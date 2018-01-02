package chapter02.test.org;

import chapter.practise.org.model.MediaPlayer;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:cdplayer-config.xml")
public class ImportXmlConfigTest {

    @Rule
    public final SystemOutRule outRule = new SystemOutRule();

    @Autowired
    private MediaPlayer cdPlay;

    @Test
    public void play() {
        cdPlay.play();
        Assert.assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\n", outRule.getLog());
    }
}
