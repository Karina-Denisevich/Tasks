package com.github.Karina_Denisevich.task7.annotations;

import java.lang.annotation.*;

@Documented
@Inherited
@Target(value = ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Description {

    String createdBy() default "Me";

    String info();
}
