import exception.ValidationFailedException;

public class ValidationSystem {

    public static void validate(Integer data) throws ValidationFailedException {
        Validator<Integer> validator = new IntegerValidator();
        validator.validate(data);
    }

    public static void validate(String data) throws ValidationFailedException {
        Validator<String> validator = new StringValidator();
        validator.validate(data);
    }
}