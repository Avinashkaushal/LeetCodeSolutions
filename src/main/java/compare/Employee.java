package compare;

public class Employee {
	
	String empName;
	Integer empId;
	Address empAddress;
	public Employee(String empName, Integer empId, Address empAddress) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empAddress = empAddress;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", empAddress=" + empAddress  + "]";
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public Address getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(Address empAddress) {
		this.empAddress = empAddress;
	}
	
	

}
