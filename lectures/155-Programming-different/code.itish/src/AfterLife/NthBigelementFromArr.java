package AfterLife;

public class NthBigelementFromArr {
    public static void main(String[] args) {
        int []arr = {23,48,84,56,24,87};
        int n = 5;
        int big = biggest(arr,n);
        System.out.println(big);
    }
    static int biggest(int []arr,int n){
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
               if(arr[j]>arr[i]){
                   count++;
               }
            }
            if(count == n-1){
                return arr[i];
            }
        }
        System.out.println("no big element");
        return 0;
    }
}
