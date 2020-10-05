package data.structure;


public class QueueArray {
    private int MAXSIZE = 1000;
    private int top;
    private Object[] queueArray;
    
    public QueueArray(){
        this.top = -1;
        this.queueArray = new Object[MAXSIZE];
    }
    
    public boolean isQueueFull(){
        if(this.top == MAXSIZE -1){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean isQueueEmpty(){
        if(this.top==-1){
            return true;
        }else{
            return false;
        }
    }
    
    public Object topQueue(){
        if(!isQueueEmpty()){
            return queueArray[top];
        }else{
            System.out.println("La pila esta vacia-");
            return null;
        }
    }
    
    public void add(Object elemento){
        if(isQueueFull()){
            System.out.println("No se puede añadir, la pila esta llena");
        }else{
            this.top++;
            queueArray[top]=elemento;
        }
    }
    
    public Object remove(){
        Object aux = null;
        if(isQueueEmpty()){
            System.out.println("No se puede estraer, la pila esta llena");
        }else{
            aux = queueArray[top];
            System.out.println("Se ha extraido el elemento: " + aux);
            top--;
        }
        return aux;
    }
    
    public void showQueue(){
        if(!isQueueEmpty()){
            for(int i=0; i<=top; i++){
                System.out.println("|" + queueArray[i] + "|");
            }
        }
    }
    
    public void cleanQueue(){
        this.top = -1;
    }
}
