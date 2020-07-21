package be.harm.carshare.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CarshareEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarshareEurekaApplication.class, args);
    }

}
