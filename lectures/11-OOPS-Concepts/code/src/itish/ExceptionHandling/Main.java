package itish.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a=7;
        int b=0;

        try{
//            int c = a/b;
//            divide(a,b);
//            throw new Exception("Just for fun");
            String name = "Itish";
            if(name.equals("Itish"))
                throw new MyException("Name is Itish");
        }
        catch (MyException e){
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("Normal Exception");
        }
        finally {
            System.out.println("Always finally exhicutes");
        }
    }
    // throws basically decalres it
    static int divide(int a,int b) throws ArithmeticException{
        if(b == 0){
            // explicitly when you throw something do it like that
//            throw new ArithmeticException();// null
            throw new ArithmeticException("Please do not divide by zero");// null
        }
        return a/b;

    }

}
