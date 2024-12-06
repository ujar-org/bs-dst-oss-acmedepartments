package com.iqkv.incubator.sample.mixnetflixoss.starter.mvc.rest.dto;

import org.apache.commons.lang3.exception.ExceptionUtils;

public record UnknownErrorMeta(String exceptionClass, String stackTrace) {
  public static UnknownErrorMeta fromException(Exception exception) {
    return new UnknownErrorMeta(
        exception.getClass().getSimpleName(),
        ExceptionUtils.getStackTrace(exception)
    );
  }

}