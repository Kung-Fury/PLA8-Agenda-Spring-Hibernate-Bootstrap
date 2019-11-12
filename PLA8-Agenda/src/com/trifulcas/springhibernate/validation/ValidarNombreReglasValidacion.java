package com.trifulcas.springhibernate.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidarNombreReglasValidacion implements ConstraintValidator<ValidarNombre, String> {
	@Override
	public void initialize(ValidarNombre nombre) {
	}
	@Override
	public boolean isValid(String nombre, ConstraintValidatorContext cxt) {
		String regex = "[a-zA-Z\\-'\\s]+";	
	return nombre.matches(regex);
	}
}