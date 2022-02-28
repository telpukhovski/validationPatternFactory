import exception.ValidationFailedException;

public interface Validator<T> {
    void validate(T data) throws ValidationFailedException;

}
