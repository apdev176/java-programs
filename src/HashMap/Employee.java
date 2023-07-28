package HashMap;
import java.util.HashMap;
import java.util.Objects;

public class Employee {

	int id;
	String name;
	public Employee(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "id="+id+" name="+name;
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee employee=(Employee)obj;
		return id==employee.id;
			
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	public static void main(String[] args) {
		HashMap<Employee, String> map=new HashMap<Employee, String>();
		map.put(new Employee(1, "nikhil"),"6ae");
		map.put(new Employee(1, "nikhil"),"6aw");
		map.put(new Employee(2, "nihal"),"6ac");
		System.out.println(map.toString());
	}
}

