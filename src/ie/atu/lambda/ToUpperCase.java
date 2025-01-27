package ie.atu.lambda;

public class ToUpperCase implements StringOperation {
    public String apply(String str) {
        return str.toUpperCase();
    }
}
