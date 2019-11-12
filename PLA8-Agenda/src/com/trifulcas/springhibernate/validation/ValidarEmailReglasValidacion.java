package com.trifulcas.springhibernate.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidarEmailReglasValidacion implements ConstraintValidator<ValidarEmail, String> {
	@Override
	public void initialize(ValidarEmail email) {
	}
	@Override
	public boolean isValid(String email, ConstraintValidatorContext cxt) {
		String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";	
	return email.matches(regex);
	}
}