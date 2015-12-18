/**
 * Lines 25 and 31-38 were originally found here:
 * http://stackoverflow.com/questions/2413426/playing-an-arbitrary-tone-with-android
 * which came from here:
 * http://marblemice.blogspot.com/2010/04/generate-and-play-tone-in-android.html
 */
package by.bsuir.myfullviolin.model.metronome;

import android.media.AudioFormat;
import android.media.AudioManager;//управление громкостью
import android.media.AudioTrack;//запись и  воспроизведение аудиороликов

public class AudioGenerator {
	
    private int sampleRate;//размер буфера в байтах
    private AudioTrack audioTrack;
    
    public AudioGenerator(int sampleRate) {
    	this.sampleRate = sampleRate;
    }
    
    public double[] getSineWave(int samples,int sampleRate,double frequencyOfTone) {
    	double[] sample = new double[samples];          //частота в √ц
        for (int i = 0; i < samples; i++) {
            sample[i] = Math.sin(2 * Math.PI * i / (sampleRate/frequencyOfTone));
        }
		return sample;
    }

    //16битное кодир.
    public byte[] get16BitPcm(double[] samples) {
    	byte[] generatedSound = new byte[2 * samples.length];
    	int index = 0;
        for (double sample : samples) {
            // scale to maximum amplitude
            short maxSample = (short) ((sample * Short.MAX_VALUE));
            // in 16 bit wav PCM, first byte is the low order byte
            generatedSound[index++] = (byte) (maxSample & 0x00ff);
            generatedSound[index++] = (byte) ((maxSample & 0xff00) >>> 8);

        }
    	return generatedSound;
    }
    
    public void createPlayer(){
        audioTrack = new AudioTrack(AudioManager.STREAM_MUSIC,//микрофон
                sampleRate, AudioFormat.CHANNEL_OUT_MONO,//частота//конфигураци€ канала
                AudioFormat.ENCODING_PCM_16BIT, sampleRate,//тип кодировани€ звука//размер буфера в байтах
                AudioTrack.MODE_STREAM);//режим дл€ потокового звука
    	audioTrack.play();
    }

    //запись звуковых данных на устройство воспроизведени€
    public void writeSound(double[] samples) {
    	byte[] generatedSnd = get16BitPcm(samples);
    	audioTrack.write(generatedSnd,//буфер со звуковыми данными
                        0,//смещение =0, воспроизведение будет начато с начала буфера
                        generatedSnd.length);//размер буфера
    }
    
    public void destroyAudioTrack() {
    	audioTrack.stop();
    	audioTrack.release();
    }
    
}
