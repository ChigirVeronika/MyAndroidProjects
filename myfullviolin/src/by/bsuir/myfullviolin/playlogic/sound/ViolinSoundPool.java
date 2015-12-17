package by.bsuir.myfullviolin.playlogic.sound;

import android.content.Context;
import android.media.SoundPool;
import android.widget.Toast;
import by.bsuir.myfullviolin.R;

import java.util.HashMap;

/**
 * Created by Вероника on 13.12.2015.
 */
public class ViolinSoundPool {
    public  Context context ;

    public  SoundPool soundPoll;

    public  HashMap<Integer,Integer> soundPoolMap;

    public ViolinSoundPool(Context context, HashMap<Integer, Integer> soundPoolMap, SoundPool soundPoll) {
        this.context = context;
        this.soundPoll = soundPoll;
        this.soundPoolMap = soundPoolMap;
    }

    public  void soundPoolLoadTest(){
        soundPoolMap.put(1,soundPoll.load(context, R.raw.m1, 1));
        soundPoolMap.put(2,soundPoll.load(context, R.raw.m2, 1));
        soundPoolMap.put(3,soundPoll.load(context, R.raw.m3, 1));
        soundPoolMap.put(4,soundPoll.load(context, R.raw.m4, 1));
        soundPoolMap.put(5,soundPoll.load(context, R.raw.m5, 1));
        soundPoolMap.put(6,soundPoll.load(context, R.raw.m6, 1));
        soundPoolMap.put(7,soundPoll.load(context, R.raw.m7, 1));
        soundPoolMap.put(8,soundPoll.load(context, R.raw.m8, 1));
        //Toast.makeText(this.context, "", Toast.LENGTH_SHORT).show();
    }
    public final int play(int soundID, float leftVolume, float rightVolume, int priority, int loop, float rate)throws Exception{

        return soundPoll.play(soundID,leftVolume,rightVolume,priority,loop,rate);
    }

    public  void stop(int streamID)throws Exception {
        // TODO Auto-generated method stub
        soundPoll.stop(streamID);
    }


    public void pause(Integer integer) {
        // TODO Auto-generated method stub
        soundPoll.pause(integer);
    }

}
