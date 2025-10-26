package nl.xx1.padel.api;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Service
@Validated
public @interface UseCase {
  String title() default "";
  String description() default "";
}
