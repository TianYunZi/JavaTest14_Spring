package chapter02.test.org;

import chapter.practise.org.SoundSystemConfig;
import chapter.practise.org.model.MediaPlayer;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SoundSystemConfig.class)
public class ImportJavaConfigTest {

    @Rule
    public final SystemOutRule outRule = new SystemOutRule();

    @Autowired
    private MediaPlayer player;


    @Test
    public void play() {
        player.play();
        assertEquals(
                "Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\n" +
                        "-Track: Sgt. Pepper's Lonely Hearts Club Band\n" +
                        "-Track: With a Little Help from My Friends\n" +
                        "-Track: Lucy in the Sky with Diamonds\n" +
                        "-Track: Getting Better\n" +
                        "-Track: Fixing a Hole\n",
                outRule.getLog());
    }
}
