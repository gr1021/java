package day07_001;

public class Manager {
	private String name;
	private int id;
	private double salary;
	private double bonus;
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
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	
	public Manager() {
		
	}
	
	
	public Manager(String name, int id, double salary, double bonus) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.bonus = bonus;
	}
	
	public void work(){
		System.out.print("����Ϊ"+id+"�ġ���������Ϊ"+salary+"�ġ�����Ϊ"+bonus+"����Ŀ����");
		System.out.println(name+"����Ŭ�������Ź��������������񣬼��Ա���ύ�����Ĵ���......");
	}
	
}
