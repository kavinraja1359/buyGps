package com.TruckBooking.buyGPS.Exception;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class BuyGPSExceptionAdvice extends ResponseEntityExceptionHandler
{


     @ExceptionHandler (EntityNotFoundException.class)
     public ResponseEntity<Object> handleEntityNotFoundException(EntityNotFoundException ex)
     {
    	 ErrorResponse errorResponse = new ErrorResponse();
    	 errorResponse.setErrorCode(HttpStatus.NOT_FOUND.value());
    	 errorResponse.setErrorMessage(ex.getMessage());
    	 return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
     }

	
	
	

	
}
