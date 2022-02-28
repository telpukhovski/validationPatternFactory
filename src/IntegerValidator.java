import exception.ValidationFailedException;

public class IntegerValidator implements Validator<Integer> {

    @Override
    public void validate(Integer data) throws ValidationFailedException{
        if (data < 1 || data > 10) throw new ValidationFailedException("The number should be between 1 and 10");
    }
}
