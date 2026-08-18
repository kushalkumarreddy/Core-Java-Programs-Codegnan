package set;

public class Student implements Comparable<Student> {
	int id;
	String name;
	int age;
	
	public Student(int id, String name,int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", age=" + age;
	}
	
	@Override
    public int compareTo(Student s) {
        return this.id - s.id;
    }

}
