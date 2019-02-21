package org.jboss.shamrock.extest;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Marker annotation for test configuration target beans
 */
@Target({ TYPE})
@Retention(RUNTIME)
@Documented
@Inherited
public @interface TestAnnotation {
}
