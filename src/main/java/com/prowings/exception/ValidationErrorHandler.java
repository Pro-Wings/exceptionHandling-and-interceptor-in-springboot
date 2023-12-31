package com.prowings.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.prowings.entity.ValidationError;

@RestControllerAdvice
@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class ValidationErrorHandler {

	@ExceptionHandler(value = MethodArgumentNotValidException.class)
	public ValidationError handleValidationError(Exception ex)
	{
		return new ValidationError(400, ex.getMessage());
	}

	@ExceptionHandler(value = InValidInputException.class)
	@ResponseStatus(code = HttpStatus.BAD_GATEWAY)
	public ValidationError handleInValidInputError(Exception ex)
	{
		return new ValidationError(400, ex.getMessage());
	}
}
