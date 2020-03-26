package fabrizio;

public class Person {

	private int id;
	private String name;
	
	public Person() {}
	
	public Person(int id, String name ) {
		setId(id);
		setName(name);
	}
	
	public void printPerson() {
		System.out.print("id: " + this.getId() + " name:" + this.getName());
		System.out.println("");
		
	}
	public String getPersonDetails() {
		return "id: " + this.getId() + " name:" + this.getName();
	}
	
//	public String toString() {
//		return "id: " + this.getId() + " name:" + this.getName();
//	}
	

	public void setId(int id) {
		if (id > 0) {
			this.id = id;
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person id=" + id + ", name=" + name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	
}
