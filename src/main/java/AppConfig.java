import com.genialsata.repository.HibernateSpeakerRepositoryImpl;
import com.genialsata.repository.SpeakerRepository;
import com.genialsata.service.SpeakerService;
import com.genialsata.service.SpeakerServiceImpl;
import com.genialsata.util.CalenderFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Calendar;

@Configuration
@ComponentScan({"com.genialsata"})
public class AppConfig {

    @Bean(name = "cal")
    public CalenderFactory calFactory() {
        CalenderFactory factory = new CalenderFactory();
        factory.addDays(2);
        return factory;
    }

    @Bean
    public Calendar cal() throws Exception{
        return calFactory().getObject();
    }

    /*
    @Bean(name = "speakerService")
    @Scope(value= BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService() {
//        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
//        service.setRepository(getSpeakerRepository());

        SpeakerServiceImpl service = new SpeakerServiceImpl();
        return service;
    }



    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }

     */
}
