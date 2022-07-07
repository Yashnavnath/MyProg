package tdd_Assignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void test() throws CloneNotSupportedException {
		Employee e1= new Employee(101, "Suraj");
		Employee e2= (Employee)e1.clone();
		assertEquals(true, Employee.checkClone(e1, e2));
	}

}
