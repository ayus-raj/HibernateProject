package HibernateCRUD;


public class Student1 {
	
	private int id;
	
	private String name;
	private int age;
	private double marks;
	private String gender;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void Student1(int id, String name, int age, double marks, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.gender = gender;
	}
	public Student1() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks + ", gender=" + gender
				+ "]";
	}
	
}
