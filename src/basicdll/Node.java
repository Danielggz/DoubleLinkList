/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package basicdll;

/**
 * @author Daniel García
 * 12/02/2024
 */
public class Node {
    private Object element;
    private Node prev, next;

    public Node(Object element, Node prev, Node next) {
        this.element = element;
        this.prev = prev;
        this.next = next;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Object getElement() {
        return element;
    }

    public Node getPrev() {
        return prev;
    }

    public Node getNext() {
        return next;
    }

    @Override
    public String toString() {
        return "Node: \n" + "element: " + element;
    }
    
    
}
