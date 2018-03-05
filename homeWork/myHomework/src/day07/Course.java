package day07;

/*
 * Course¿‡
 */
public class Course {

	private String courseNum;
	private String course;
	private String CreateTime;
	private String describe;

	public String getCourseNum() {
		return courseNum;
	}

	public void setCourseNum(String courseNum) {
		this.courseNum = courseNum;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCreateTime() {
		return CreateTime;
	}

	public void setCreateTime(String createTime) {
		CreateTime = createTime;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public Course() {

	}

	public Course(String courseNum, String course, String createTime,
			String describe) {

		this.courseNum = courseNum;
		this.course = course;
		CreateTime = createTime;
		this.describe = describe;
	}

}
