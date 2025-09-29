/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nodost;

/**
 *
 * @author Johan Villada
 * @param <T>
 */
public class MyStack<T> {
    // Nodo interno privado: genérico
    private static class Node<T> {
        T data;
        Node<T> next;
        Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node<T> top;
    private int size;

    public MyStack() {
        top = null;
        size = 0;
    }

    // Push: O(1)
    public void push(T item) {
        top = new Node<>(item, top);
        size++;
    }

    // Pop: O(1). Lanza EmptyStackException si está vacía.
    public T pop() {
        if (isEmpty()) throw new EmptyStackException("Pila vacía - no se puede hacer pop");
        T value = top.data;
        top = top.next;
        size--;
        return value;
    }

    // Peek: O(1)
    public T peek() {
        if (isEmpty()) throw new EmptyStackException("Pila vacía - no se puede hacer peek");
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> cur = top;
        sb.append("[top] ");
        while (cur != null) {
            sb.append(cur.data).append(" ");
            cur = cur.next;
        }
        sb.append("[bottom]");
        return sb.toString();
    }
}
