package data.structure;

public class StackArray {
    private int MAX = 10;
    private int front;
    private int end;

    private Object[] stack;

    public StackArray() {     //add stack vacua
        front = 0;
        end = -1;
        stack = new Object[MAX];
    }

    public boolean isStackFull() {
        return end == MAX - 1;
    }

    public void add(Object dato) {
        if (!isStackFull()) {
            end++;
            stack[end] = dato;
        } else {
            System.out.println("ERROR: NO SE PUEDE add, LA stack ESTA LLENA");
        }
    }
    
    public boolean isStackEmpty(){
        return front > end;
    }
    
    public Object remove(){             //quitando del front
        Object aux = null;
        if(!isStackEmpty()){
            aux = stack[front];
            front++;
        }else{
            System.out.println("ERROR: NO SE PUEDE add, LA stack ESTA VACIA");
        }
        return aux;
    }

    public void showStack() {
        System.out.println("stack actual: ");
        for (int i = front; i <= end; i++) {
            System.out.print(stack[i] + "\t");
        }
    }
    
    public Object front(){
        return stack[front];
    }
}
