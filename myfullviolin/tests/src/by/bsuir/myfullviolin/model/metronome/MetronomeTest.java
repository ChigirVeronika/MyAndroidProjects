package by.bsuir.myfullviolin.model.metronome;

import android.os.Handler;
import dalvik.annotation.TestTargetClass;
import junit.framework.TestCase;

import java.util.logging.LogRecord;

/**
 * Created by Вероника on 19.12.2015.
 */
public class MetronomeTest extends TestCase {
    Metronome metronome;
    Handler h=null;

    public void testInitialize(){
        metronome = new Metronome(h);
        assertNotNull(metronome);
    }

    public void testGetBeat(){
        metronome = new Metronome(h);
        metronome.setBeat(1);
        assertEquals(metronome.getBeat(), 1);
    }

    public void testGetBeatSound(){
        metronome = new Metronome(h);
        metronome.setBeatSound(1);
        assertEquals(metronome.getBeatSound(), 1);
    }

    public void testGetNoteValue(){
        metronome = new Metronome(h);
        metronome.setNoteValue(1);
        assertEquals(metronome.getNoteValue(), 1);
    }

    public void testGetSound(){
        metronome = new Metronome(h);
        metronome.setSound(2);
        assertEquals(metronome.getSound(),2);
    }


}
