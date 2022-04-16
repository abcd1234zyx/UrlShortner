

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.Short.Shortner","com.Short.Algorithm"} )
public class UrlApplication {

	public static void main(String[] args) {
		System.out.println("got ir!!!!");
		SpringApplication.run(UrlApplication.class, args);
	}

}
