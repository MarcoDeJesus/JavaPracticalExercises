package annotations;

import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.CONSTRUCTOR;

@Target(value = {FIELD, CONSTRUCTOR})
public @interface CustomAnnotation{
    String owner();
    int count() default 100;
}