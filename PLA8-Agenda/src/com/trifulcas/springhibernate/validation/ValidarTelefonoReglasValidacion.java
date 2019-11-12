package com.trifulcas.springhibernate.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidarTelefonoReglasValidacion implements ConstraintValidator<ValidarTelefono, String> {
	@Override
	public void initialize(ValidarTelefono telefono) {
	}
	@Override
	public boolean isValid(String telefono, ConstraintValidatorContext cxt) {
		String regex = "^([+]?[\\s0-9]+)?(\\d{3}|[(]?[0-9]+[)])?([-]?[\\s]?[0-9])+$";	
	return telefono.matches(regex);
	}
}