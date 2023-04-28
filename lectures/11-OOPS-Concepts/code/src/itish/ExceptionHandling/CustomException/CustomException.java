package itish.ExceptionHandling.CustomException;

public class CustomException {
    public static void main(String[] args) throws AgeLessThanZeroException {
        int age = -1;
        validateAge(age);
    }
    public static void validateAge(int age) throws AgeLessThanZeroException {
        if(age<0){
            throw new AgeLessThanZeroException("oh !no ",new RuntimeException());
            //throw new AgeLessThanZeroException();
        }
    }
}
