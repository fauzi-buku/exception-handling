package com.fw.exceptionhandling;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.HandlerMethod;

@ControllerAdvice
public class RestErrorControllerAdvice {

  @ExceptionHandler({Exception.class})
	public ResponseEntity<?> handleException(Exception e, HandlerMethod handlerMethod) {
		System.out.println("ASDASD -- " + handlerMethod.getMethod().getDeclaringClass().getSimpleName() + "." + handlerMethod.getMethod().getName() + " " + e.getClass().getSimpleName());
		return ResponseEntity.ok().body("OK");
	}

}
