package ge.giga;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ModifyString {
    boolean toUpperCase() default false;
    boolean toLowerCase() default false;
    String prefix() default "";
    String suffix() default "";
    boolean trimmed() default false;
}
