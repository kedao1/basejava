package cn.dl.jcdz.annotation;

import jdk.nashorn.internal.ir.annotations.Reference;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.ANNOTATION_TYPE.TYPE,ElementType.ANNOTATION_TYPE.FIELD,ElementType.ANNOTATION_TYPE.METHOD})
public @interface AnnoTest {
    String value() default "-1";
}
