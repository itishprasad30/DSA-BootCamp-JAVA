package itish.InnerClass;

import java.util.Comparator;

public class MyComparerable implements Comparable{
    @Override
    public int compareTo(Object obj) {
        return this.hashCode()-obj.hashCode();
    }

}
