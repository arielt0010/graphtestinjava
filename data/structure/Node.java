package data.structure;

public class Node {
    private Object data;
    private Node link;
    
    public Node(Object data){
        this.data = data;
        this.link = null;
    }
    public Node(Object data, Node link){
        this.data = data;
        this.link = link;
    }
    public Object getData(){
        return data;
    }
    public Node getLink(){
        return link;
    }
    public void setData(Object data){
        this.data=data;
    }
    public void setLink(Node link){
        this.link=link;
    }

    public String toString(){
        return "Node = {Object = {" +this.data+ "}, Link = {"+this.link+"}}";
    }

}