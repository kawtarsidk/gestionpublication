package gp_mango.gp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"gp_mango.gp.Controller","gp_mango.gp.Repository","gp_mango.gp.entity"})
public class GpApplication {

	public static void main(String[] args) {
		SpringApplication.run(GpApplication.class, args);
	}

}
