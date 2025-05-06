import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test") // 개발 환경에서만 활성화됨
public class DevConfig {

    @Bean
    public MyEnvironment myEnvironment() {
        return new MyEnvironment("개발환경");
    }
}
