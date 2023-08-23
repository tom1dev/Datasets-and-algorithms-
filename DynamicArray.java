import java.util.Arrays;

public class DynamicArray {
    int size;
    int data[];

    DynamicArray(){
        size = 0;
        this.data = new int[1];
    }

    public void add(int val){
        if(size == data.length){
            int capastity = data.length *2;
            data = Arrays.copyOf(data, capastity);
        }
        data[size] = val;

        size++;

    }

    public void remove(int index){
        size--;
        if(data.length >= size *2){
            data = Arrays.copyOf(data, data.length/2);
        }

    }
}
