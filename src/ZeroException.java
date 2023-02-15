

public class ZeroException extends Exception{

    @Override
    public String getMessage() {
        return "Error: cannot divide by 0";
    }
}
