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
public class Employee {
    
    String Fname;
    String Lname;

    public Employee(String Fname, String Lname) {
        this.Fname = Fname;
        this.Lname = Lname;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    @Override
    public String toString() {
        return "Employee{" + "Fname=" + Fname + ", Lname=" + Lname + '}';
    }
    
    
}
