package uz.geeks.hh_uz.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import uz.geeks.hh_uz.exceptions.GenericNotFoundException;
import uz.geeks.hh_uz.exceptions.TokenRefreshException;
import uz.geeks.hh_uz.response.ApiErrorResponse;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(GenericNotFoundException.class)
    public ResponseEntity<ApiErrorResponse> handle404(GenericNotFoundException e, HttpServletRequest request) {
        return new ResponseEntity<>(ApiErrorResponse.builder()
                .developerMessage(Arrays.toString(e.getStackTrace()))
                .friendlyMessage(e.getMessage())
                .requestPath(request.getRequestURL().toString())
                .timestamp(Timestamp.valueOf(LocalDateTime.now()))
                .build(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = TokenRefreshException.class)
    public ResponseEntity<ApiErrorResponse> handleTokenRefreshException(TokenRefreshException ex, HttpServletRequest request) {
        return new ResponseEntity<>(ApiErrorResponse.builder()
                .developerMessage(Arrays.toString(ex.getStackTrace()))
                .friendlyMessage(ex.getMessage())
                .requestPath(request.getRequestURL().toString())
                .timestamp(Timestamp.valueOf(LocalDateTime.now()))
                .build(), HttpStatus.FORBIDDEN);
    }
}
