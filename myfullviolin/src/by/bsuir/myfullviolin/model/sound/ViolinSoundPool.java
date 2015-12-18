package by.bsuir.myfullviolin.model.sound;

import android.content.Context;
import android.media.SoundPool;
import by.bsuir.myfullviolin.R;

import java.util.HashMap;

/**
 * Created by Вероника on 13.12.2015.
 */
public class ViolinSoundPool {
    public  Context context ;

    public  SoundPool soundPool;

    public  HashMap<Integer,Integer> soundPoolMap;

    public ViolinSoundPool(Context context, HashMap<Integer, Integer> soundPoolMap, SoundPool soundPool) {
        this.context = context;
        this.soundPool = soundPool;
        this.soundPoolMap = soundPoolMap;
    }

    public  void soundPoolLoadTest(){
        soundPoolMap.put(1,soundPool.load(context, R.raw.m1, 1));//context,raw,priority
        soundPoolMap.put(2,soundPool.load(context, R.raw.m2, 1));
        soundPoolMap.put(3,soundPool.load(context, R.raw.m3, 1));
        soundPoolMap.put(4,soundPool.load(context, R.raw.m4, 1));
        soundPoolMap.put(5,soundPool.load(context, R.raw.m5, 1));
        soundPoolMap.put(6,soundPool.load(context, R.raw.m6, 1));
        soundPoolMap.put(7,soundPool.load(context, R.raw.m7, 1));
        soundPoolMap.put(8,soundPool.load(context, R.raw.m8, 1));
    }
    public final int play(int soundID, float leftVolume, float rightVolume, int priority, int loop, float rate)throws Exception{

        return soundPool.play(soundID,leftVolume,rightVolume,priority,loop,rate);
    }

    public  void stop(int streamID)throws Exception {
        // TODO Auto-generated method stub
        soundPool.stop(streamID);
    }


    public void pause(Integer integer) {
        // TODO Auto-generated method stub
        soundPool.pause(integer);
    }

}
