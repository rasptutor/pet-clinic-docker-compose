package com.example.pet_clinic;

import org.springframework.boot.SpringApplication;

public class TestPetClinicApplication {

	public static void main(String[] args) {
		SpringApplication.from(PetClinicApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
