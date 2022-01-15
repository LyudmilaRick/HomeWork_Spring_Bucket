package pro.sky.java.course211.homework_spring_bucket.Сonfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.java.course211.homework_spring_bucket.Repository.Bucket;


@Configuration
public class ConfigurationClass {
    @Bean
    @SessionScope
    public Bucket createBucket(){
        return new Bucket();
    }
}
