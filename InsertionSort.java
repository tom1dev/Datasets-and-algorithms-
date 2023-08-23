public class InsertionSort {
    public static int[] sort(int a[]){
        for(int i = 1; i<a.length;i++){
            int k =0;
            while(i+k-1 >= 0 && a[i+k]<a[i+k-1] ){
         

                    int temp = a[i+k];
                    a[i+k] = a[i+k-1];
                    a[i+k-1] = temp;
                    k--;
                System.out.print(i-k);
            }

        }


        return a;

    }
}
