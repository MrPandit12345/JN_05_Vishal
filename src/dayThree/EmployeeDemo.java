package dayThree;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1= new Employee();
		emp1.setEmpId(101);
		emp1.setName("Abhi");
		emp1.setDept("IT");
		emp1.setDesignation("Network Administrator");
		emp1.setSalary(78000);
		System.out.println("Employee Details");
		System.out.println("EmpID = "+emp1.getEmpId());
		System.out.println("Name = "+emp1.getName());
		System.out.println("Designation = "+emp1.getDesignation());
		System.out.println("Department = "+emp1.getDept());
		System.out.println("Salary = "+emp1.getSalary());
		
		Employee emp2= new Employee();
		emp2.setEmpId(102);
		emp2.setName("Vishal");
		emp2.setDept("IT");
		emp2.setDesignation("UI/UX Designer");
		emp2.setSalary(680000);
		System.out.println("===============================================");
		System.out.println("Employee Details");
		System.out.println("EmpID = "+emp2.getEmpId());
		System.out.println("Name = "+emp2.getName());
		System.out.println("Designation = "+emp2.getDesignation());
		System.out.println("Department = "+emp2.getDept());
		System.out.println("Salary = "+emp2.getSalary());
	}

}
