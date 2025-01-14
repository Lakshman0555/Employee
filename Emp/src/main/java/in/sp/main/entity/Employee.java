package in.sp.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "emp_system")
public class Employee
{

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name; 
private String address;
private String email;
private String phno;
private int salary;




public Employee() {
	super();
	// TODO Auto-generated constructor stub
}



public Employee(int id, String name, String address, String email, String phno, int salary) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
	this.email = email;
	this.phno = phno;
	this.salary = salary;
}



public int getId() {
	return id;
}
public String getName() {
	return name;
}
public String getAddress() {
	return address;
}
public String getEmail() {
	return email;
}
public String getPhno() {
	return phno;
}
public int getSalary() {
	return salary;
}
public void setId(int id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
public void setAddress(String address) {
	this.address = address;
}
public void setEmail(String email) {
	this.email = email;
}
public void setPhno(String phno) {
	this.phno = phno;
}
public void setSalary(int salary) {
	this.salary = salary;
}



@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", phno=" + phno
			+ ", salary=" + salary + "]";
}




}
