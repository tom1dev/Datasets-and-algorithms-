public class MergeSort {
    public static void sort(int a[],int left,int right){

        int k = (right - left)/2;
        
        if(left != right){
            sort(a, left,k);
            sort(a, k+1,right);
        }else{return;}
        int n = left ,q = k+1;
        int b[] = new int[right -left +1];
        for(int i = 0;i<right - left + 1;i++ ){
            if (n==k+1){
                b[i]= a[q];
                q++;
            }	
            if(a[n]<a[q]){
                b[i]= a[n];
                n++;
            }else if(a[n]>a[q]){
                b[i]= a[q];
                q++;
            }else{
                b[i]= a[n];
                n++;
            }

        }
    for(int i  = left; i <= right;i++){
        a[i]= b[i-left];
    }
    }


}
