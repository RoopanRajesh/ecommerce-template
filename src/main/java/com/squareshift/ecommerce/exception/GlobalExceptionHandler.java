package com.squareshift.ecommerce.exception;

import feign.FeignException;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(FeignException.class)
    public String handleFeignStatusException(FeignException e, HttpServletResponse response) throws JSONException {
        response.setStatus(e.status());
        return new JSONObject(e.contentUTF8()).toString(1);
    }

}
