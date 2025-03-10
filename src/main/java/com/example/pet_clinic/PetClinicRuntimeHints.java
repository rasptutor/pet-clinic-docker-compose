package com.example.pet_clinic;

import java.io.Serializable;

import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import com.example.pet_clinic.model.BaseEntity;
import com.example.pet_clinic.model.Person;
import com.example.pet_clinic.vet.Vet;

public class PetClinicRuntimeHints implements RuntimeHintsRegistrar {

	@SuppressWarnings({ "null" })
    @Override
	public void registerHints(RuntimeHints hints, ClassLoader classLoader) {
		hints.resources().registerPattern("db/*"); // https://github.com/spring-projects/spring-boot/issues/32654
		hints.resources().registerPattern("messages/*");
		hints.resources().registerPattern("mysql-default-conf");
		hints.serialization().registerType(BaseEntity.class);
		hints.serialization().registerType(Person.class);
		hints.serialization().registerType((Class<? extends Serializable>) Vet.class);
	}

}