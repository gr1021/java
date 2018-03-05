package day07;

public class MainApp {
	public static void main(String[] args) {
		//创建Teacher类对象
		Teacher t1 = new Teacher("t001","薛之谦",'男',26,"Java");
		System.out.print(t1.getNumber()+"---"+t1.getName()+"---"+t1.getSex());
	    System.out.println("---"+t1.getAge()+"---"+t1.getCourse()); 

		Teacher t2 = new Teacher("t002","张碧晨",'女',24,"IOS");
		System.out.print(t2.getNumber()+"---"+t2.getName()+"---"+t2.getSex());
		System.out.println("---"+t2.getAge()+"---"+t2.getCourse());
		
		Teacher t3 = new Teacher("t003","张杰",'男',28,"Java");
		System.out.print(t3.getNumber()+"---"+t3.getName()+"---"+t3.getSex());
		System.out.println("---"+t3.getAge()+"---"+t3.getCourse());
		
		System.out.println("---------------------------------------");
		
		//创建Course类对象
		Course c1 = new Course("s001","Java","2007-02-08","Java学科,包含JavaSE和JavaEE");
		System.out.print(c1.getCourseNum()+"---"+c1.getCourse());
		System.out.println("---"+c1.getCreateTime()+"---"+c1.getDescribe());
		
		Course c2 = new Course("s002","IOS","2007-02-09","IOS系统开发");
		System.out.print(c2.getCourseNum()+"---"+c2.getCourse());
		System.out.println("---"+c2.getCreateTime()+"---"+c2.getDescribe());
	}
}
