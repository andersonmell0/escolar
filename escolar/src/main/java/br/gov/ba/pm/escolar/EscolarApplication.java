package br.gov.ba.pm.escolar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class EscolarApplication {

	public static void main(String[] args) {
		SpringApplication.run(EscolarApplication.class, args);		
		//Criptografa uma senha para adicionar na tabela usuario
		//System.out.println("Password:" + new BCryptPasswordEncoder().encode("admin123"));
		
	}
}