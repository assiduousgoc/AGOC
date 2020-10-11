package com.authentication.advices;

import javax.persistence.PersistenceException;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.authentication.constants.AuthConstant;
import com.authentication.exceptions.DuplicateEntryException;
import com.authentication.exceptions.EntityNotFoundException;
import com.authentication.exceptions.InvalidTokenException;
import com.authentication.exceptions.InvalidUserException;
import com.authentication.exceptions.LoginSuspendException;
import com.authentication.models.ExceptionResponse;

import io.jsonwebtoken.MalformedJwtException;

@RestControllerAdvice(annotations = RestController.class)
@RequestMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
public class AuthAdvice {

	@ExceptionHandler(value = PersistenceException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	protected ResponseEntity<ExceptionResponse> handle(final PersistenceException exception) {
		return new ResponseEntity<>(get(exception), HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value = IllegalArgumentException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	protected ResponseEntity<ExceptionResponse> handle(final IllegalArgumentException exception) {
		return new ResponseEntity<>(get(exception), HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value = InvalidUserException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	protected ResponseEntity<ExceptionResponse> handle(final InvalidUserException exception) {
		return new ResponseEntity<>(get(exception), HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(value = InvalidTokenException.class)
	@ResponseStatus(HttpStatus.UNAUTHORIZED)
	protected ResponseEntity<ExceptionResponse> handle(final InvalidTokenException exception) {
		return new ResponseEntity<>(get(exception), HttpStatus.UNAUTHORIZED);
	}

	@ExceptionHandler(value = LoginSuspendException.class)
	@ResponseStatus(HttpStatus.FORBIDDEN)
	protected ResponseEntity<ExceptionResponse> handle(final LoginSuspendException exception) {
		return new ResponseEntity<>(get(exception), HttpStatus.CONFLICT);
	}

	@ExceptionHandler(value = DuplicateEntryException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	protected ResponseEntity<ExceptionResponse> handle(final DuplicateEntryException exception) {
		return new ResponseEntity<>(get(exception), HttpStatus.CONFLICT);
	}

	@ExceptionHandler(value = EntityNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	protected ResponseEntity<ExceptionResponse> handle(final EntityNotFoundException exception) {
		return new ResponseEntity<>(get(exception), HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(value = RuntimeException.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	protected ResponseEntity<ExceptionResponse> handle(final RuntimeException exception) {
		return new ResponseEntity<>(get(exception), HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value = MalformedJwtException.class)
	@ResponseStatus(HttpStatus.UNAUTHORIZED)
	protected ResponseEntity<ExceptionResponse> handle(final MalformedJwtException exception) {
		return new ResponseEntity<>(get(exception), HttpStatus.UNAUTHORIZED);
	}

	ExceptionResponse get(RuntimeException exception) {
		if (exception instanceof InvalidTokenException)
			return new ExceptionResponse(((InvalidTokenException) exception).getErrorCode(),
					((InvalidTokenException) exception).getMessage(),
					((InvalidTokenException) exception).getDescription());

		if (exception instanceof InvalidUserException)
			return new ExceptionResponse(((InvalidUserException) exception).getErrorCode(),
					((InvalidUserException) exception).getMessage(),
					((InvalidUserException) exception).getDescription());

		if (exception instanceof ConstraintViolationException)
			return new ExceptionResponse(AuthConstant.ExceptionCode.BAD_REQUESEST, AuthConstant.Message.CONSTRAINT,
					AuthConstant.Message.CONSTRAINT);

		if (exception instanceof DuplicateEntryException)
			return new ExceptionResponse(AuthConstant.ExceptionCode.CONFLICT,
					((DuplicateEntryException) exception).getMessage(),
					((DuplicateEntryException) exception).getDescription());

		if (exception instanceof EntityNotFoundException)
			return new ExceptionResponse(AuthConstant.ExceptionCode.NOT_FOUND,
					((EntityNotFoundException) exception).getMessage(),
					((EntityNotFoundException) exception).getDescription());

		if (exception instanceof LoginSuspendException)
			return new ExceptionResponse(AuthConstant.ExceptionCode.FORBIDDEN,
					((LoginSuspendException) exception).getMessage(),
					((LoginSuspendException) exception).getDescription());

		return new ExceptionResponse(AuthConstant.ExceptionCode.INTERAL_SERVER_ERROR, exception.getMessage(),
				exception.getMessage());
	}
}
