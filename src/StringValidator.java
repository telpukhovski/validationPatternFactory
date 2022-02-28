import exception.ValidationFailedException;

public class StringValidator implements Validator<String> {

    @Override
    public void validate(String data) throws ValidationFailedException {
        if (!data.matches("^[A-ZА-ЯЁ].+")) throw new ValidationFailedException("The string should start with a " +
                "capital letter");


    }
}
