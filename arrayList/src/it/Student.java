package it;

/*
 * ����һ��ѧ���࣬��������˽�����ԣ�������name���ͳɼ���score������name ������
Ϊ String ���ͣ�score ������Ϊ int ���ͣ����ṩ�޲κ��вι��죬get/set ����
 */
public class Student {
	private String name;
	private int score;
	
	public Student() {
		
	}
	public Student(String name, int score) {
		
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
