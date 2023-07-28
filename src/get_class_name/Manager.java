package get_class_name;
public class Manager {
	
	
	public Class getInstance() {
		return this.getClass();
		
	}
	public static void main(String[] args) {
		
		Manager manager=new Manager();
		Person person=new Person();
		person.setStatus(1, manager.getInstance());
		
		
	}

	
}
