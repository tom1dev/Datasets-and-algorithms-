public class UnionFind {
    int[] parent;
    int[] height;

    UnionFind(int n){
        parent = new int[n];
        height = new int[n];
        for (int i = 0;i<n;i++){
            parent[i] = -1;
            height[i] = 1;
        }
    }

    int findrep(int x){
        
        while(parent[x] != -1){
            x = parent[x];
        }

        return x;
    }

    void mergeBags(int a, int b){
        int bagArep = findrep(a);
        int bagBrep = findrep(b);

        if(height[bagArep]>= height[bagBrep]){
            parent[bagBrep] = bagArep;
        }else{
            parent[bagArep]= bagBrep;
        }



    }
}
