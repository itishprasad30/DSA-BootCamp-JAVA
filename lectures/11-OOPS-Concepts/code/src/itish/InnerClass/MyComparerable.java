package itish.InnerClass;

public class MyComparerable implements Comparable{
    @Override
    public int compareTo(Object obj) {
        return this.hashCode()-obj.hashCode();
    }
}
