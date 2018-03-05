package day06_1;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 1.����¼�� 10 ���������������� 
 * 2.����һ������������������������,ż������������Ҳ� 
 * 3.����һ��������ӡԭ����ʹ��������� 
 * 4.����һ����������һ�� int �������飬������������ֻ����һ�ε����ּ����� 
 */
public class Test01 {
	public static void main(String[] args) {
		int[] arr = new int[10];

		// 1.����¼�� 10 ����������������
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("�������" + (i + 1) + "��Ԫ��");
			arr[i] = sc.nextInt();
			
		}
		printArray(arr);
		array(arr);
		printArray(arr);
		count(arr);
		
	}


	// 2.����һ������������������������,ż������������Ҳ� 1 2 3 4 5 6
	public static void array(int[] arr) {
		int start=0;
		int end = arr.length-1;
		while(start < end){
			while (arr[end] % 2 == 0 && start < end ) {
				end--;
			}
			while (arr[start] % 2 == 1 && start < end) {
				start++;
			}
			int temp = arr[end];
			arr[end] = arr[start];
			arr[start] = temp;
		}
}


	// 3.����һ��������ӡԭ����ʹ���������
	public static void printArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length-1) {
				System.out.println(arr[i]+"]");
			}else{
			System.out.print(arr[i]+",");
			}
		}
	}

	// 4.����һ����������һ�� int �������飬������������ֻ����һ�ε����ּ����� 
	public static int count(int[] arr,int num) {
		//���������
		int count = 0;
		//��������
		for(int i = 0;i<arr.length;i++) {
			if(num==arr[i]) {//������鵱ǰԪ�غ�Ҫͳ�Ƶ�����num��ֵ���
				count++;//������+1
			}
		}
		return count;
	
	}
	
	public static void count(int[] arr) {
		int count = 0;
		
		for(int i = 0;i<arr.length;i++) {
			if(count(arr,arr[i])==1) {//��������е�ǰԪ���������г��ֵĴ�������1
				if(count==0){//˵�������˵�һ������һ�ε����֣�Ҫ��ӡ������ʾ��Ϣ���Ժ��ٳ��ֲ��ô�ӡ��
					System.out.print("���飺"+Arrays.toString(arr)+"�У�ֻ����һ�ε����ְ�����");	
				}
				System.out.print(arr[i]+" ");//��ӡ��Ԫ��
				count++;//������+1
			}
		}
		System.out.println();
		System.out.println("���飺"+Arrays.toString(arr)+" ��ֻ����һ�ε����ֵ�����Ϊ��"+count+" ��");
	}
}
