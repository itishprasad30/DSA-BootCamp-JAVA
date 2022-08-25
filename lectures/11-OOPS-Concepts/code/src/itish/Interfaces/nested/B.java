package itish.Interfaces.nested;

public class B implements A.nestedInterface {
    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}
