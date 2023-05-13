package Demo1.EuqalsandDoubleEuquals;

import java.util.Objects;

public class Dog {
    private final String name ;

    public Dog(String name){
        this.name = name;
    }

    public boolean equals(Object obj){
        Dog d = (Dog) obj;
        return Objects.equals(this.name, d.name);
    }
    public int hashCode(){
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name +" "  ;
    }

    public String getName() {
        return name;
    }


}
