/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basicdll;

/**
 *
 * @author Daniel García
 */
public class BasicDLLApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DLList dl = new DLList();
        System.out.println("Empty: " + dl.isEmpty());
        dl.add(1, "elem1");
        dl.add(2, "elem2");
        dl.add(3, "elem3");
        dl.add(4, "elem4");
        System.out.println("Size: " + dl.size());
        dl.printList();
    }
    
}
