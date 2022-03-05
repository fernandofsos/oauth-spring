package br.com.backend.pedido.apiExceptionHandler;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import br.com.backend.pedido.error.UsuarioJaCadastradoException;


@RestControllerAdvice
public class AplicationControllerAdvice {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public  ResponseEntity<ApiErrors> handleValidationErros(MethodArgumentNotValidException ex) {
	
		BindingResult bindingResult =  ex.getBindingResult();
		List<String> messages =	bindingResult.getAllErrors()
		             .stream()
		             .map( objErros -> objErros.getDefaultMessage())
		             .collect(Collectors.toList());
		
		ApiErrors apiErrors = new ApiErrors(messages);
		
		return new ResponseEntity<ApiErrors>(apiErrors,HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(UsuarioJaCadastradoException.class)
	public ResponseEntity<ApiErrors> usuarioJaCadastrado(UsuarioJaCadastradoException ex) {
		ApiErrors apiErrors = new ApiErrors(ex.getMessage());
		
		return new ResponseEntity<ApiErrors>(apiErrors,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ApiErrors> usuarioJaCadastrado(Exception ex) {
		ApiErrors apiErrors = new ApiErrors(ex.getMessage());
		
		return new ResponseEntity<ApiErrors>(apiErrors,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
}
