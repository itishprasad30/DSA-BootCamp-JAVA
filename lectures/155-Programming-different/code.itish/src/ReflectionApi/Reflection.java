package ReflectionApi;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Cat cat = new Cat("taylor",4);
        System.out.println(cat.getName());
        // Accessing the Fields
        Field[] catFields = cat.getClass().getDeclaredFields();
        for(Field field : catFields){
            System.out.println(field.getName());
            if(field.getName().equals("name")){
                field.setAccessible(true);
                field.set(cat,"selena");
            }
        }

        System.out.println(cat.getName());

        // Accessing the Methods
        Method[] catMethods = cat.getClass().getDeclaredMethods();
        for(Method method : catMethods){
            if(method.getName().equals("thisIsPrivateStaticMethod")) {
                method.setAccessible(true);
                method.invoke(null);
            }
        }
        cat.meow();
        Cat.thisIsPublicStaticMethod();
    }
}
