package chapter.practise.org.config;

import chapter.practise.org.model.CDPlayer;
import chapter.practise.org.model.CompactDisc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("chapter.practise.org")
@Configuration
public class CDPlayerConfig {

    @Bean("player")
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }
}
