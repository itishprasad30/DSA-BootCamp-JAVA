package itish.SortingObjectComparableAndCompartor;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(45);
        li.add(87);
        li.add(79);
        li.add(12);
        li.add(43);

        Collections.sort(li);
        System.out.println(li); // [12, 43, 45, 79, 87]


        ArrayList<Movie> list = new ArrayList<>();
        list.add(new Movie("Force Awakans", 8.3, 2015));
        list.add(new Movie("Star wars", 8.7, 1997));
        list.add(new Movie("Empire Strikes back", 8.8, 1980));
        list.add(new Movie("Return of jedi", 8.4, 1983));

        // Sorting by year using Comparable
        System.out.println("Sorting by Year using Comparable");
        Collections.sort(list);
        for (Movie m : list) {
            System.out.println(m.getName() + " || " + m.getRating() + " || " + m.getYear() + " ");
        }
        // Output
        /*
        Empire Strikes back || 8.8 || 1980
        Return of jedi || 8.4 || 1983
        Star wars || 8.7 || 1997
        Force Awakans || 8.3 || 2015
        */

        // Sorting by name using Comparator
        System.out.println("\nSorting by Name using comparator");
        Collections.sort(list, new NameComparator());
        for (Movie m : list) {
            System.out.println(m.getName() + " || " + m.getRating() + " || " + m.getYear() + " ");
        }

        // Sorting by Year using Comparator
        System.out.println("\n Sorting by year in comparator");
        Comparator<Movie> com = new Comparator<>() {
            @Override
            public int compare(Movie m1, Movie m2) {
                return m1.getYear() - m2.getYear();
            }
        };

        Collections.sort(list, com);
        for (Movie m : list) {
            System.out.println("year sorting : " + m.getYear());
        }

        // Sorting by rating using comparator
        System.out.println("\n Sorting by rating in comparator");
        Collections.sort(list,new RatingComparator());
        for (Movie m : list) {
            System.out.println(m.getName() + " || " + m.getRating() + " || " + m.getYear() + " ");
        }
        /*
        Empire Strikes back || 8.8 || 1980
        Star wars || 8.7 || 1997
        Return of jedi || 8.4 || 1983
        Force Awakans || 8.3 || 2015
         */

    }
}
