package uz.geeks.hh_uz.exceptions;

public class GenericNotFoundException extends GenericRunTimeException{
    public GenericNotFoundException(String message, Integer statusCode) {
        super(message, statusCode);
    }
}
