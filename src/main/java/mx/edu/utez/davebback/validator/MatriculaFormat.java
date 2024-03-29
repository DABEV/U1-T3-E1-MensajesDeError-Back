package mx.edu.utez.davebback.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = MatriculaFormatValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface MatriculaFormat {
    String message() default "El formato de uno o más campos es inválido.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}