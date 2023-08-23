public class SelectionSort {
    public static int[] sort(int a[]){
        for(int i =0; i<a.length;i++){
            int smallest = i;
            for(int k = i; k<a.length;k++){
                if(a[smallest]>a[k]){
                    smallest = k;
                }

            }
            int temp = a[i];
            a[i] = a[smallest];
            a[smallest] = temp;

        }

        return a;
    }
}
