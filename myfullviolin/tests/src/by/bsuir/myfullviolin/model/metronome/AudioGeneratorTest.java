package by.bsuir.myfullviolin.model.metronome;

import junit.framework.TestCase;

/**
 * Created by Вероника on 19.12.2015.
 */
public class AudioGeneratorTest extends TestCase {
    public void testInitialize(){
        AudioGenerator audioGenerator = new AudioGenerator(1);
        assertNotNull(audioGenerator);
    }
}
