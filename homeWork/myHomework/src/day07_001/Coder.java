package day07_001;

public class Coder {
	private String name;
	private int id;
	private double salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Coder() {
		
	}
	
	public Coder(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	//����Ϊ 135 ��������Ϊ 10000 �ĳ���Ա��������Ŭ����д�Ŵ���......
	public void work(){
		System.out.println("����Ϊ"+id+"��������Ϊ"+salary+"�ĳ���Ա"+name+"����Ŭ����д�Ŵ���....");
	}
	
}
