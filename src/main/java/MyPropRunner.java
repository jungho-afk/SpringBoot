import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyPropRunner implements CommandLineRunner {

    private final MyEnvironment myEnvironment;
    private static final Logger logger = LoggerFactory.getLogger(MyPropRunner.class);

    public MyPropRunner(MyEnvironment myEnvironment) {
        this.myEnvironment = myEnvironment;
    }

    @Override
    public void run(String... args) {
        logger.info("현재 실행 환경: {}", myEnvironment.getMode());
    }
}
