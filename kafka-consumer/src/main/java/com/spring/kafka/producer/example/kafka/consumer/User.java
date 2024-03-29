package com.spring.kafka.producer.example.kafka.consumer;

public class User /* implements Serializable */{

	//private static final long serialVersionUID = 6385983152732107433L;

	private String name;
	private String dept;
	private Long salary;

	public User() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public User(String name, String dept, Long salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}

}
