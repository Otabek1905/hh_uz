package uz.geeks.hh_uz.exceptions;

import lombok.Getter;

@Getter
public class GenericRunTimeException extends RuntimeException {
    protected final Integer statusCode;

    public GenericRunTimeException(String message, Integer statusCode) {
        super(message);
        this.statusCode = statusCode;
    }
}
