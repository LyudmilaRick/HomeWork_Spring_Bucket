package pro.sky.java.course211.homeworkSpringBucket.configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.java.course211.homeworkSpringBucket.repository.Bucket;

@Configuration
public class ConfigurationClass {
    @Bean
    @SessionScope
    public Bucket bucket(){
        return new Bucket();
    }
}
