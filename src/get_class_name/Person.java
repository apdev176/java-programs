package get_class_name;

public class Person {

  private int status;

public int getStatus() {
	return status;
}

public void setStatus(int status,Class c) {
	String name=c.getCanonicalName();
	if(name.equals("Manager")) {
		this.status=status;
		System.out.println(this.status);
		System.out.println("done");
	}
	else {
		System.out.println("you are not authorised");
	}
	
}
}
