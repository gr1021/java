package Test;
/*
 * 2.�����һ��è�࣬�������ֺ���������ԣ��Է���˯������Ϊ��
 *  �����ɺ�ͨ�����������в���
 */
public class Cat {
	private String name;
	private int age;
	
	
	
	public Cat() {
		
	}
	
	public Cat(String name, int age) {
		
		this.name = name;
		this.age = age;
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

	public void eat(){
		System.out.println("һֻ��"+name+"���ڳԷ�");
	}
	public void sleep(){
		System.out.println("һֻ����Ϊ"+age+"�Ĵ�"+name+"����˯��");
	}
		
	
}
