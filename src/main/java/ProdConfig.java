import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod") // 운영 환경에서만 활성화됨
public class ProdConfig {

    @Bean
    public MyEnvironment myEnvironment() {
        return new MyEnvironment("운영환경");
    }
}
