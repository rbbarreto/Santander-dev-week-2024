package me.dio.domain.Controller.Exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandle {

   private final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandle.class);


    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handlebusinessException(IllegalArgumentException businessException){
        return new ResponseEntity<>(businessException.getLocalizedMessage(), HttpStatus.UNPROCESSABLE_ENTITY);
    }

    @ExceptionHandler(NoSuchFieldException.class)
    public ResponseEntity<String> handleNotFoundException(NoSuchFieldException notFoundException){
        return new ResponseEntity<>("Resource Id not found", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Throwable.class)
    public ResponseEntity<String> handleUnexpectedException(Throwable UnexpectedException){
        var message = "Unexpected Server error, see the logs";
        logger.error(message, UnexpectedException);
        return new ResponseEntity<>(message, HttpStatus.INTERNAL_SERVER_ERROR);
    }


}
