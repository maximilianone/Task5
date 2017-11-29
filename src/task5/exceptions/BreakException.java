package task5.exceptions;

public class BreakException extends Exception{
    @Override
    public String getMessage(){
        return "Input is interrupted";
    }
}
