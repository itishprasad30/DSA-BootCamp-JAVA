package com.itish;

public class ScopeingInJava {
    public static void main(String[] args) {
        int a =10,b = 20;
        String name = "Itish Prasad Sahoo";
        System.out.println(name); // itish prasad sahoo

        System.out.println(b);
        // you can not access this a,b outside of the main function
        random();

        // block scope  means inside { ... }
        {
           // int a = 220;// error because if some value already initialied
                          // outside of block you can't initialised it
                          // ,but change it or update it.
            a = 123;
            System.out.println(a);// 123  updataitng happens

            int c =654;
            System.out.println(c); // 654

            name = "Abel Tesfaye";
            System.out.println(name); // Abel Tesfaye

        }
        System.out.println(name); // Abel Tesfaye

        System.out.println(a); // 123  orginal value is changed in this.

        // but c can not be access outide of the block scope
        //System.out.println(c); //error happens

        // scoping in for loops
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            a = 1_000;

        }
//        System.out.println(i); // error you can not access the i out side of for loop block
        System.out.println(a); // 1000
    }
    static void  random(){
        //System.out.println(a);// error
        // instead reinitalised a new one
        int a = 330;
        System.out.println(a); // 330
    }
}
