package cybersoft.java11.group8.pizza_store.warehouse.validation.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import cybersoft.java11.group8.pizza_store.warehouse.validation.validator.UniqueSupplierValidator;

@Constraint(validatedBy = UniqueSupplierValidator.class)
@Target ({ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface UniqueSupplierName {
	public String message() default "Supplier name is already used";

	public Class<?>[] groups() default {};

	public Class<? extends Payload>[] payload() default {};
}
