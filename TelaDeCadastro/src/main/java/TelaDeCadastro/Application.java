package TelaDeCadastro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 *
 * Spring Boot application starter class
 */
@SpringBootApplication
@EntityScan(basePackages = "TelaDeCadastro.model") //caminho para o banco achar a tabela e fazer a criação 

public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
