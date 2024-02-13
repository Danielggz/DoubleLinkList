/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package basicdll;

/**
 * @author Daniel García
 * 12/02/2024
 */
public class DLList implements LinearListInterface{
    private Node head, curr, last;
    private int size;

    public DLList() {
        size = 0;
        head = null;
        curr = null;
        last = null;
    }

    @Override
    public boolean isEmpty() {
        if(size == 0)
        {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(int index, Object element) {
        if(isEmpty()){
            //If list is empty, the head and the last are both the same
            Node newNode = new Node(element, null, null);
            head = newNode;
            last = newNode;
        }else{
            //If list has elements, 
            if(index == 1){
                //If index is 1, it means that 
                Node newNode = new Node(element, null, null);
                newNode.setNext(head);
                head.setPrev(head);
                head = newNode;
            }else if(index == (size+1)){
                Node newNode = new Node(element, null, null);
                newNode.setPrev(last);
                last.setNext(newNode);
                last = newNode;
            }else{
                setCurrent(index);
                Node newNode = new Node(element, null, null);
                newNode.setNext(curr);
                Node prev = curr.getPrev();
                newNode.setPrev(prev);
                curr.setPrev(newNode);
            }
        }
        size++; //we need to increase as we are managing the size manually
    }

    @Override
    public Object get(int index) {
        setCurrent(index);
        return curr;
    }

    @Override
    public void remove(int index, Object element) {
        if(isEmpty()){
            
        }else{
            
        }
    }

    @Override
    public void printList() {
        Node node = head;
        for(int i=0; i<size; i++){
            System.out.println(node.toString());
            node = node.getNext();
        }
    }
    
    private void setCurrent(int index){
        //set curr to the node at the position specified by the supplied index
        for(int k = 1; k < index; k++){
            curr = curr.getNext();
        }
    }
}
