package com.springboot.hibernate.exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<ErrorMessaging> handleUserNotFoundException(UserNotFoundException userNotFoundException,
			WebRequest webRequest)

	{
		ErrorMessaging messaging = new ErrorMessaging(new Date(), userNotFoundException.getMessage(),
				webRequest.getDescription(false));
		return new ResponseEntity<ErrorMessaging>(messaging, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorMessaging> handleAllException(Exception exception, WebRequest webRequest)

	{
		ErrorMessaging messaging = new ErrorMessaging(new Date(), exception.getMessage(),
				webRequest.getDescription(false));
		return new ResponseEntity<ErrorMessaging>(messaging, HttpStatus.NOT_FOUND);
	}
}
