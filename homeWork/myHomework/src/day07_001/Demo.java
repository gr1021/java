package day07_001;
/*
 * ������
 */
public class Demo {
	public static void main(String[] args) {
		//����Manger�����
		Manager m = new Manager("һ��",123,15000,6000);
		
		System.out.println(m.getName()+"---"+m.getId()+"---"+m.getSalary()+"---"+m.getBonus());
		m.work();
		
		//����coder�����
		Coder c = new  Coder();
		
		c.setName("����");
		c.setSalary(10000 );
		c.setId(135);
		
		//����Ϊ 135 ��������Ϊ 10000 �ĳ���Ա��������Ŭ����д�Ŵ���......
		System.out.println("����Ϊ"+c.getId()+"��������Ϊ"+c.getSalary()+"�ĳ���Ա"+c.getName()+"����Ŭ����д�Ŵ���...");
		
		System.out.println("---------------------------");
		
		c.work();
		
	}
	 
}
