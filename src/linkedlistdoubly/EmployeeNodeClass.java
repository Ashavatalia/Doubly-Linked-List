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
public class EmployeeNodeClass {

    Employee employee;
    EmployeeNodeClass next, previos;

    public EmployeeNodeClass(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNodeClass getNext() {
        return next;
    }

    public void setNext(EmployeeNodeClass next) {
        this.next = next;
    }

    public EmployeeNodeClass getPrevios() {
        return previos;
    }

    public void setPrevios(EmployeeNodeClass previos) {
        this.previos = previos;
    }

    @Override
    public String toString() {
        return employee.toString();
    }

}
