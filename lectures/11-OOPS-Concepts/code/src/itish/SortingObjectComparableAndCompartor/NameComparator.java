package itish.SortingObjectComparableAndCompartor;

import java.util.Comparator;

public class NameComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Movie m1 = (Movie) o1;
        Movie m2 = (Movie) o2;
        return m1.getName().compareTo(m2.getName());

    }
}
