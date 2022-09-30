package DataStructures.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {
    public static void main(String[] args) throws Exception {
        Cat myCat = new Cat("shallow",3);
        Field [] names =myCat.getClass().getDeclaredFields();

        for(Field name :names){
            if(name.getName().equals("name")){
                name.setAccessible(true);
                name.set(myCat,"mellao");
            }

        }
        System.out.println(myCat.getName());

        Method[] catMethod = myCat.getClass().getDeclaredMethods();
        for (Method method : catMethod){
            if(method.getName().equals("meow")){
                method.invoke(myCat);
            }
//            System.out.println(method.getName());
        }

    }
}
