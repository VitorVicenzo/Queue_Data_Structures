package edu.vitor.dio.queue;

public class Queue<T> {

    private Node<T> refEnterQueue;

    public Queue(){
        this.refEnterQueue = null;
    }

    public void enqueue(T object){
        Node newNode = new Node(object);
        newNode.setRefNode(refEnterQueue);
        refEnterQueue = newNode;
    }

    public T first(){
        if (!this.isEmpty()){
            Node firstNode = refEnterQueue;
            while (true){
                if (firstNode.getRefNode() != null){
                    firstNode = firstNode.getRefNode();
                }else{
                    break;
                }
            }
            return (T) firstNode.getObject();
        }
        return null;
    }

    public T dequeue(){
        if (!this.isEmpty()){
            Node firstNode = refEnterQueue;
            Node nodeAuxiliar = refEnterQueue;
            while (true){
                if (firstNode.getRefNode() != null){
                    nodeAuxiliar = firstNode;
                    firstNode = firstNode.getRefNode();
                }else{
                    nodeAuxiliar.setRefNode(null);
                    break;
                }
            }
            return (T) firstNode.getObject();
        }
        return null;
    }

    public boolean isEmpty(){
        return refEnterQueue == null ? true:false;
    }

    @Override
    public String toString() {
        String returnString = "------------------\n";
        returnString += "--------Queue--------\n";
        returnString += "-------------------\n";

        Node nodeAuxiliar = refEnterQueue;

        if (refEnterQueue != null){
            while(true){
                returnString += "{Node(objeto=" + nodeAuxiliar.getObject() + ")}---->";
                if(nodeAuxiliar.getRefNode() != null){
                    nodeAuxiliar = nodeAuxiliar.getRefNode();
                }else{
                    returnString += "null";
                    break;
                }
            }
        }else{
            returnString = "null";
        }
        return returnString;
    }
}
