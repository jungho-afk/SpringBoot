import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "myprop")
public class MyPropProperties {
    private String username;
    private int port;

    // 값을 읽고 쓸 수 있게 get/set 메서드를 만들어야 해요
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public int getPort() { return port; }
    public void setPort(int port) { this.port = port; }
}
