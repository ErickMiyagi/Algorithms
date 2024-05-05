package Grafos;

import java.util.LinkedList;
import java.util.Queue;

public class Filas {
    public static void main(String[] args) {
        queueLinkedList();
    }
    private static void queueLinkedList() {
        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        queue.add("2");
        queue.add("3");

        queue.peek();
        System.out.println(queue.peek()); //inspeciona o valor, mas não remove
        System.out.println(queue.size());
        System.out.println(queue.poll()); // retira o primeiro valor de entrada
        System.out.println(queue);
    }
}
