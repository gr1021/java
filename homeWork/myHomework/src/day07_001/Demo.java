package day07_001;
/*
 * 测试类
 */
public class Demo {
	public static void main(String[] args) {
		//创建Manger类对象
		Manager m = new Manager("一龙",123,15000,6000);
		
		System.out.println(m.getName()+"---"+m.getId()+"---"+m.getSalary()+"---"+m.getBonus());
		m.work();
		
		//创建coder类对象
		Coder c = new  Coder();
		
		c.setName("方便");
		c.setSalary(10000 );
		c.setId(135);
		
		//工号为 135 基本工资为 10000 的程序员方便正在努力的写着代码......
		System.out.println("工号为"+c.getId()+"基本工资为"+c.getSalary()+"的程序员"+c.getName()+"正在努力的写着代码...");
		
		System.out.println("---------------------------");
		
		c.work();
		
	}
	 
}
