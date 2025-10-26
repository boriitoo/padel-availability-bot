package nl.xx1.padel.api.command.application;

import java.lang.annotation.*;
import org.springframework.stereotype.Component;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Component
public @interface CommandDescription {
  String title();

  String description();

  boolean admin() default false;
}
