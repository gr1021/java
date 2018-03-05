package day07_002;

/*
 * 姓名 name 
 * 年龄 age 
 * 讲课内容 content
 */
public class Teacher {
	private String name;
	private int age;
	private String content;
	
	public Teacher() {
		
	}

	public Teacher(String name, int age, String content) {
		
		this.name = name;
		this.age = age;
		this.content = content;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	//吃饭   年龄为 30 的周志鹏老师正在吃饭.... 
	public void eat(){
		System.out.println("年龄为"+age+"的"+name+"老师正在吃饭....");
	}
	//讲课        
	public void speak(){
		System.out.println("年龄为"+age+"的"+name+"老师正在亢奋的讲着"+content+"的知识.....");
	}
	
}
