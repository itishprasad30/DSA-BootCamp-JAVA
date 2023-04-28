package itish.ExceptionHandling.CustomException;

public class AgeLessThanZeroException extends Exception{
    public AgeLessThanZeroException(){
        super();
    }
    public AgeLessThanZeroException(String message){
        super(message);
    }
    public AgeLessThanZeroException(Throwable cause){
        super(cause);
    }
    public AgeLessThanZeroException(String message,Throwable cause){
        super(message,cause);
    }
    @Override
    public String getMessage(){
        return "error occurs";
    }


}
