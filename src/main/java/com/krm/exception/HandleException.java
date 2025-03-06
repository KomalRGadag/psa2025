package com.krm.exception;

import com.krm.payload.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;
//global catch block
@ControllerAdvice              //it becomes a global class so whenever exception occur it comes here
public class HandleException {

    @ExceptionHandler(ResourceNotFound.class)
    public ResponseEntity<ErrorDetails> handleEmployeeNotFoundException(
            ResourceNotFound e,
            WebRequest request
    ){
        ErrorDetails errorDetails = new ErrorDetails(
                e.getMessage(),
                new Date(),
                request.getDescription(true)
        );//return type is string
        return new ResponseEntity<>(errorDetails,HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @ExceptionHandler(Exception.class)              //any other exception in project can be handled using this
    public ResponseEntity<ErrorDetails> globalException(
            Exception e,
            WebRequest request
    ){
        ErrorDetails errorDetails = new ErrorDetails(
                e.getMessage(),
                new Date(),
        request.getDescription(true)
        );//return type is string
        return new ResponseEntity<>(errorDetails,HttpStatus.INTERNAL_SERVER_ERROR);

    }
}
