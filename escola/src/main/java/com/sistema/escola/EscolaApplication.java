package com.sistema.escola;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EscolaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EscolaApplication.class, args);
                System.out.println("--- Link principal de acesso: http://localhost:8080/main/home");
                
	}

}
