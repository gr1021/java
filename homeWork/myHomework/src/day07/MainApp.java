package day07;

public class MainApp {
	public static void main(String[] args) {
		//����Teacher�����
		Teacher t1 = new Teacher("t001","Ѧ֮ǫ",'��',26,"Java");
		System.out.print(t1.getNumber()+"---"+t1.getName()+"---"+t1.getSex());
	    System.out.println("---"+t1.getAge()+"---"+t1.getCourse()); 

		Teacher t2 = new Teacher("t002","�ű̳�",'Ů',24,"IOS");
		System.out.print(t2.getNumber()+"---"+t2.getName()+"---"+t2.getSex());
		System.out.println("---"+t2.getAge()+"---"+t2.getCourse());
		
		Teacher t3 = new Teacher("t003","�Ž�",'��',28,"Java");
		System.out.print(t3.getNumber()+"---"+t3.getName()+"---"+t3.getSex());
		System.out.println("---"+t3.getAge()+"---"+t3.getCourse());
		
		System.out.println("---------------------------------------");
		
		//����Course�����
		Course c1 = new Course("s001","Java","2007-02-08","Javaѧ��,����JavaSE��JavaEE");
		System.out.print(c1.getCourseNum()+"---"+c1.getCourse());
		System.out.println("---"+c1.getCreateTime()+"---"+c1.getDescribe());
		
		Course c2 = new Course("s002","IOS","2007-02-09","IOSϵͳ����");
		System.out.print(c2.getCourseNum()+"---"+c2.getCourse());
		System.out.println("---"+c2.getCreateTime()+"---"+c2.getDescribe());
	}
}
