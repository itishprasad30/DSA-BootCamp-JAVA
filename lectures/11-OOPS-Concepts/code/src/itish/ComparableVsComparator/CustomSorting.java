package itish.ComparableVsComparator;

import java.util.*;

public class CustomSorting {
    public static void main(String[] args) {
        Comparator<Integer> com = new Comparator<>() {
            @Override
            public int compare(Integer i,Integer j) {
                if(i%10 > j%10){
                    return 1;
                }
                else {
                    return -1;
                }
            }
        };

        Comparator<Student> com2 = (i, j) -> i.age>j.age?1:-1;
        Comparator<Student> com3 = (i,j) -> -i.name.compareTo(j.name);

//        List<Integer> ll = new ArrayList<>();
//        ll.add(32);
//        ll.add(12);
//        ll.add(54);
//        ll.add(98);
//        ll.add(59);
//        System.out.println("Before Sorting");
//        System.out.println(ll);
//
//        System.out.println("After SOrting");
//        Collections.sort(ll,com);
//        System.out.println(ll);

        List<Student> list = new ArrayList<>();
        list.add(new Student("pintu",23));
        list.add(new Student("zayn",34));
        list.add(new Student("Ana",12));

        Collections.sort(list,com3);
        for (Student s:list) {
            System.out.println(s);
        }


    }
}
