/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistdoubly;

/**
 *
 * @author ashavatalia
 */
public class LinkedListDoubly {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Employee a = new Employee("Asha", "Vatalia");
        Employee v = new Employee("Vishal", "Desai");
        Employee h = new Employee("Himani", "Desai");
        Employee p = new Employee("Priyangi", "Desai");
        Employee k = new Employee("Kamlesh", "Desai");

        EmployeeLinkedList list = new EmployeeLinkedList();
        list.addToFront(a);
        list.addToFront(v);
        list.addToFront(h);
        list.addToFront(p);
        list.addToFront(k);
        list.printNode();

        System.out.println("-----------------------");
        System.out.println("-----------------------");

        //   list.addNodeToEnd(p);
     //   list.romoveFromFrontNode();
        list.printNode();
        
        list.removeFromEnd();
        list.printNode();
    }
    
    

}
