public class QuickSort {
    public static void sort(int a[],int left,int right){
        if(left>=right){return;}
        int piv = right;

        for(int i = right; i>=left; i--){
            if(piv>= 0 && a[i]>a[piv]){
                int temp  = a[piv-1];
                a[piv-1] = a[i];
                a[i] = temp;

                temp = a[piv];
                a[piv]  = a[piv-1];
                a[piv-1] = temp;
                piv--;
            }
        }


        sort(a,left,piv-1);
        sort(a,piv +1,right);


    }




}
