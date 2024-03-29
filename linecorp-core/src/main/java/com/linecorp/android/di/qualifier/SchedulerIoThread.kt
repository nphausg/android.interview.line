package com.linecorp.android.di.qualifier

import javax.inject.Qualifier

@Qualifier
@Target(
        AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER,
        AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.FIELD,
        AnnotationTarget.VALUE_PARAMETER
)
annotation class SchedulerIoThread
