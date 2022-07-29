package Lab02;

public class Employee implements IEmployee {
	private int id;
	private String name;
	
	

	@Override
	public void setId(int id) {	
		this.id = id;
	}
	@Override
	public int getId() {
		return id;
	}
	@Override
	public void setName(String name) {	
		this.name = name;
	}
	@Override
	public String getName() {
		return name;
	}

}
