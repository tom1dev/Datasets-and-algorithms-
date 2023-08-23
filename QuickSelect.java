public class QuickSelect {
    public static int select(int a[],int k){
        int left = 0,right = a.length -1;
        while(left < right){
            int q = partition(a,left,right);

            if(k == q){
                return a[q];
            }else if(k>q){
                left = q+1;
            }else{right = q-1;}
        }



        return 0;
    }
    public static int partition(int[] a, int left,int right){
        int piv = right;
        for(int i = piv -1; i>=0; i--){
            if(a[i]>a[piv]){
                int temp  = a[piv-1];
                a[piv-1] = a[i];
                a[i] = temp;

                temp = a[piv];
                a[piv]  = a[piv-1];
                a[piv-1] = temp;
                piv--;
            }
        }
        return piv;

    }
}