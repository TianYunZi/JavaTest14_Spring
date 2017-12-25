package chapter02.practise.org.model;

import org.springframework.stereotype.Component;

@Component("cd")
public class SgtPapers implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
