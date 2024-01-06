package com.maksud.spring.mvc.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD) // аннотация для переменных
@Retention(RetentionPolicy.RUNTIME) // наша аннотация сохранит инфу до конца кода
@Constraint(validatedBy = CheckEmailValidator.class) // в этом классе будет сохранена вся бизнес логика
public @interface CheckEmail {
    public String value() default "gmail.com"; // это дефолтное значение
    public String message () default "email must be end with gmail.com "; // это дефолтное значение

    // эти два метода внизу обезаетльны для написания и все
    public Class<?>[] groups() default {};
    public Class<? extends Payload> [] payload() default {};
}
