public class DoublelyLinked {
    int size;
    Node first;
    Node last;

    public DoublelyLinked(){
        size = 0;
    }


    public void add(int val){
        Node current = new Node(val);
        if(size ==0){
            first = current;
            last = current;
        }else{
            last.next = current;
            current.prev = last;
            last = current;
        }
        size++;

    }
    public int get(int index){
        Node current = first;
        for(int i = 0; i<index;i++){
            if(current != null){
                current = current.next;
            }else{return -1;}

        }
        return current.val;
    }
    public void remove(int index){
        Node current = first;
        for(int i = 0; i<index;i++){
            if(current != null){
                current = current.next;
            }else{return;}

        }
        if(current.next != null){
                    (current.next).prev = current.prev;
        (current.prev).next = current.next;
        size--;
        }

    }

    public int size(){
        return size;
    }

}
