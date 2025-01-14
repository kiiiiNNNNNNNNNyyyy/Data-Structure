package LinkedList;

public class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	public Person(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
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

	@Override
	public int compareTo(Person person) {
		return Integer.compare(this.age, person.getAge());
	}
}
