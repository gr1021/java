package com02;

import java.util.ArrayList;

/*
 * �ַ�������strs�а����ַ���{"12","345","6789","1","123","4567"}��
     ����2��ArrayList���ϣ��ֱ���strs�������ַ�������Ϊż����Ԫ�غ��ַ�����         
               ��Ϊ������Ԫ�أ����ս������������ڿ���̨��ӡ�������ӡ��ʽ���£�
                    ����Ϊż����Ԫ���У�[12, 6789, 4567];
                    ����Ϊ������Ԫ���У�[345, 1, 123];

 */
public class Test02 {
	public static void main(String[] args) {
		
		String[] str = {"12","345","6789","1","123","4567"};
		
		
		//����2��ArrayList���ϣ�
		ArrayList<String> array = new ArrayList<String>();
		ArrayList<String> array1 = new ArrayList<String>();
		
		//�ֱ���strs�������ַ�������Ϊż����Ԫ�غ��ַ�������Ϊ������Ԫ�أ����ս������������ڿ���̨��ӡ���
		for (int i = 0; i < str.length; i++) {
			if(str[i].length() % 2 == 0){
				array.add(str[i]);
			}else {
				array1.add(str[i]);
			}
		}
		//���ս������������ڿ���̨��ӡ���
		System.out.print("����Ϊż����Ԫ���У�[");
		for (int i = 0; i < array.size(); i++) {
			String st = array.get(i);
			if (i == array.size()-1) {
				System.out.print(st+"]");
			}else{
				System.out.print(st+",");
			}
		}
		System.out.println();
		System.out.print("����Ϊ������Ԫ���У�[");
		for (int i = 0; i < array.size(); i++) {
			String st = array1.get(i);
			if (i == array.size()-1) {
				System.out.print(st+"]");
			}else{
				System.out.print(st+",");
			}
		}
	}
}
