package com.pushtorefresh.android.bamboostorage;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface StorableType {

    String idFieldName() default "_id";

    String tableName() default "";
}
