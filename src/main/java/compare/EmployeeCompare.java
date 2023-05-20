package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeCompare{

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Aviansh", 21, new Address("Lucknow",233));
		Employee e2 = new Employee("Neha", 25, new Address("Indore",244));
		Employee e3 = new Employee("Meghna", 14, new Address("Amstardam",684));
		
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(e3);
		employeeList.add(e2);
		employeeList.add(e1);
		
		Collections.sort(employeeList,new AddressComparator());
	
		System.out.println(employeeList);

		Collections.sort(employeeList, new NameComparator());
		
		System.out.println(employeeList);
	}

}
