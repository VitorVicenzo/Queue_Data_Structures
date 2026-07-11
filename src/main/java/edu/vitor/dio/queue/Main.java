package edu.vitor.dio.queue;

public class Main {
    public static void main(String[] args){

        Queue myQueue = new Queue();

        myQueue.enqueue(new Node("primeiro"));
        myQueue.enqueue(new Node("segundo"));
        myQueue.enqueue(new Node("terceiro"));
        myQueue.enqueue(new Node("quarto"));

        System.out.println(myQueue);

        System.out.println(myQueue.dequeue());
        System.out.println(myQueue);
        myQueue.enqueue(new Node("ultimo"));

        System.out.println(myQueue);

        System.out.println(myQueue.first());
        System.out.println(myQueue);
    }
}
