package by.intexsoft.study.ITXSUNFLOW425.annotation1.model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
public @interface Book {
    String id() default "1";
    String name() default "MyBook";
    String author() default "Kate";
    String publisher() default "Amazon";
    String year() default "2022";
}