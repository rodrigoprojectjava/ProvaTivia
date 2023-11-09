package pldesaude.CadastroDeBeneficiario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"pldesaude.CadastroDeBeneficiario.controller", "pldesaude.CadastroDeBeneficiario.repository"})
public class CadastroDeBeneficiarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastroDeBeneficiarioApplication.class, args);
	}

}
