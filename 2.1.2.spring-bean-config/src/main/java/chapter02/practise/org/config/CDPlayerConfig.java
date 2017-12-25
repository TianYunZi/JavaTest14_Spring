package chapter02.practise.org.config;

import chapter02.practise.org.model.CDPlayer;
import chapter02.practise.org.model.CompactDisc;
import chapter02.practise.org.model.SgtPapers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {

    @Bean
    public CompactDisc sgtPeppers() {
        return new SgtPapers();
    }

    @Bean
    public CDPlayer cdPlayer() {
        return new CDPlayer(sgtPeppers());
    }
}
