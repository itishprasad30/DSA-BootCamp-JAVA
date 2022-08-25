package Arrays;

public class FrequencyOfArrayElement {
    public static void main(String[] args) {
        int [] arr ={23,45,56,45,89,45,89,26,45,56};
        long start = System.nanoTime();

        arrayFrequency(arr);
        long end = System.nanoTime();
        System.out.println(end -start);
    }
   static void arrayFrequency(int[] arr){
        boolean []res = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if(res[i]== false){
                int count =1;
                for (int j = i+1; j < arr.length; j++) {
                    if(arr[i] == arr[j]){
                        count++;
                        res[j ]=true;
                    }
                }
                System.out.println(arr[i] + "----->"+count);
            }

        }
    }
}
