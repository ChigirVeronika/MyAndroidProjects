package by.bsuir.myfullviolin.model.sound;

import junit.framework.TestCase;

/**
 * Created by Вероника on 19.12.2015.
 */
public class ViolinSoundPoolTest extends TestCase {
    public void testInitialize(){
        ViolinSoundPool violinSoundPool = new ViolinSoundPool();
        assertNotNull(violinSoundPool);
    }
}
