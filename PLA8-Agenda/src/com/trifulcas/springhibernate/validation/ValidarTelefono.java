package com.trifulcas.springhibernate.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = ValidarTelefonoReglasValidacion.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)

public @interface ValidarTelefono {
	String message() default "Tel�fono no v�lido";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}