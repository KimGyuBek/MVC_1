package hello.serverlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan //servelet 자동 등록
@SpringBootApplication
public class ServerletApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerletApplication.class, args);
	}

}
