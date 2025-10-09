package com.example.SpringExpense.Exceptions;


import com.example.SpringExpense.IO.ErrorObject;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@RestControllerAdvice
public class GlobalException {
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(ResourceNotFound.class)
    public ErrorObject handleResourceNotFound(ResourceNotFound exception, WebRequest request) {
            return  ErrorObject.builder()
                    .errorCode("DATA_NOT_FOUND")
                    .statusCode(HttpStatus.NOT_FOUND.value())
                    .message(exception.getMessage())
                    .timeStamp(new Date())
                    .build();
    }
}
