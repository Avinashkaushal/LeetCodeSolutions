package countrypackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Student {
	
	int id;
	String name;

	public Student(int id ,String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override 
	 public String toString() {
		return "Student [ "+" id " + id + " name " + name +"]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public boolean equals(Object o) {
		
		if(this == o) {
			return true;
		}
		if(o == null || getClass() != o.getClass()) {
			return false;
		}
		Student s = (Student) o;
		
		return Objects.equals(id, s.id) && Objects.equals(name, s.name);
	}	

}

class Main{
	
	public static void main(String...args) {
		
		List<Student> list = new ArrayList<Student>();
		Student s1 = new Student(1,"Avinash");
		Student s2 = new Student(2,"Avinash");
		Student s3 = new Student(1, "Kaushal");
		Student s4 = new Student(3,"Ganesh");
		Student s5 = new Student(1, "Kaushal");
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		List<Student> dist = list.stream().distinct().collect(Collectors.toList());
		
		
		System.out.println(dist);
		
		
	}
}


