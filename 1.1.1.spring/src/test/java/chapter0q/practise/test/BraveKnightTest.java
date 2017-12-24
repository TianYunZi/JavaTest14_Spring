package chapter0q.practise.test;

import chapter01.practise.org.model.BraveKnight;
import chapter01.practise.org.model.Knight;
import chapter01.practise.org.model.Quest;
import org.junit.Test;
import org.mockito.Mockito;

public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkOnTest() {
        Quest quest = Mockito.mock(Quest.class);
        Knight knight = new BraveKnight(quest);
        knight.embarkOnQuest();
        Mockito.verify(quest, Mockito.times(1)).embark();
    }
}
