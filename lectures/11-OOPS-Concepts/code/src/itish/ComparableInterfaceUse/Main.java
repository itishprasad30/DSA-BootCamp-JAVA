package itish.ComparableInterfaceUse;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] s = new Student[3];
        for (int i = 0; i < s.length; i++) {
            String name = sc.next();
            int id = sc.nextInt();
            s[i] = new Student(name,id);
        }
        System.out.println("________________");

        Arrays.sort(s);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
