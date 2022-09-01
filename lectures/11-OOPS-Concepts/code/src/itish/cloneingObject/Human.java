package itish.cloneingObject;

public class Human implements Cloneable{
    String name;
    int id;
    int []arr;

    public Human(String name, int id) {
        this.name = name;
        this.id = id;
        this.arr = new int[] {1,2,3,4,5};

    }
    public Human (Human other){
        this.name = other.name;
        this.id=other.id;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // Shallow Copy
//        return super.clone();
        // Depp copy
        Human twin =(Human) super.clone(); // this line is shallow

        // make the deep copy
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;

    }
}
