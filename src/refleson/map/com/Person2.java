package refleson.map.com;

public class Person2 {


	private String id;
	private String name;
	private String lastName;
	private String age;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Person2(String id, String name, String lastName, String age) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person2 [id=" + id + ", name=" + name + ", lastName=" + lastName + ", age=" + age + "]";
	}
	
	
	
	

}
