/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package basicdll;

/**
 *
 * @author Daniel García
 * 12/02/2024
 */
public interface LinearListInterface {
    public boolean isEmpty();
    public int size();
    public void add(int index, Object element);
    public Object get(int index);
    public void remove(int index, Object element);
    public void printList();
}
