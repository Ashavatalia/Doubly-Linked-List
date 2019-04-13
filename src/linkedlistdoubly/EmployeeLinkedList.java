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
public class EmployeeLinkedList {

    Employee employee;
    EmployeeNodeClass head, tail, previous;

    public void addToFront(Employee employee) {

        EmployeeNodeClass node = new EmployeeNodeClass(employee);
        node.setNext(head);

        if (head == null) {
            tail = node;
        } else {
            head.setPrevios(node);
        }
        head = node;
    }

    public void printNode() {

        EmployeeNodeClass current;
        current = head;

        System.out.println("Tail");
        System.out.println("Head-->");
        while (current != null) {
            System.out.println(current);
            System.out.println("<-->");
            current = current.getNext();
        }

        System.out.println("------------------");
        System.out.println("Head Node is : " + head);
        System.out.println("Tail Node is : " + tail);
    }

    public void addNodeToEnd(Employee employee) {

        EmployeeNodeClass node = new EmployeeNodeClass(employee);

        if (tail == null) {

            head = node;
        } else {

            tail.setNext(node);
            node.setPrevios(tail);
        }
        tail = node;
    }

    public EmployeeNodeClass romoveFromFrontNode() {

        if (head == null) {
            return null;
        }

        EmployeeNodeClass removeNode;
        removeNode = head;

        if (head.getNext() == null) {

            tail = null;
        } else {

            head.getNext().setPrevios(null);
        }

        head = head.getNext();
        removeNode.setNext(null);
        return removeNode;

    }

    public EmployeeNodeClass removeFromEnd() {

        if (tail == null) {
            return null;

        }

        EmployeeNodeClass removeNode = tail;

        if (tail.getPrevios() == null) {
            head = null;
        } else {
            tail.getPrevios().setNext(null);
        }

        tail = tail.getPrevios();
        removeNode.setPrevios(null);
        return removeNode;
    }

}
