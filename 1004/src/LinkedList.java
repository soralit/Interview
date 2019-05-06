import java.util.Arrays;

public class LinkedList {
    private class Node{
        private Node next;
        private int value;
        public Node(int value){
            this.value = value;
            this.next = null;
        }

        public Node getNext() {
            return next;
        }

        public int getValue() {
            return value;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    private Node head;

    public Node getHead() {
        return head;
    }

    public LinkedList(){
        this.head = null;
    }

    public LinkedList(String list) throws Exception {
        try {
            Arrays.stream(list.split(",")).forEach(character -> addNode(Integer.parseInt(character)));
        }catch (Exception e){
            throw new Exception("invalid character");
        }
    }

    public void addNode(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
        }
        else{
            Node nowNode = head;
            while(nowNode.getNext()!=null){
                nowNode = nowNode.getNext();
            }
            nowNode.setNext(node);
        }
    }

    public String print(){
        StringBuilder stringBuilder = new StringBuilder();

        Node nowNode = head;
        if(nowNode == null){
            return "";
        }
        stringBuilder.append(nowNode.getValue());
        stringBuilder.append(' ');
        while(nowNode.getNext()!=null){
            nowNode = nowNode.getNext();
            stringBuilder.append(nowNode.getValue());
            stringBuilder.append(' ');
        }

        return stringBuilder.toString();
    }


    //TODO
    public void delete(int index){

    }


    //TODO
    public void insert(int index, int value){

    }

    //TODO
    public void reverse(){

    }
}
