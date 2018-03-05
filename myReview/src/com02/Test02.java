package com02;

import java.util.ArrayList;

/*
 * 字符串数组strs中包含字符串{"12","345","6789","1","123","4567"}，
     创建2个ArrayList集合，分别存放strs数组中字符串长度为偶数的元素和字符串长         
               度为奇数的元素，最终将这两个集合在控制台打印输出：打印格式如下：
                    长度为偶数的元素有：[12, 6789, 4567];
                    长度为基数的元素有：[345, 1, 123];

 */
public class Test02 {
	public static void main(String[] args) {
		
		String[] str = {"12","345","6789","1","123","4567"};
		
		
		//创建2个ArrayList集合，
		ArrayList<String> array = new ArrayList<String>();
		ArrayList<String> array1 = new ArrayList<String>();
		
		//分别存放strs数组中字符串长度为偶数的元素和字符串长度为奇数的元素，最终将这两个集合在控制台打印输出
		for (int i = 0; i < str.length; i++) {
			if(str[i].length() % 2 == 0){
				array.add(str[i]);
			}else {
				array1.add(str[i]);
			}
		}
		//最终将这两个集合在控制台打印输出
		System.out.print("长度为偶数的元素有：[");
		for (int i = 0; i < array.size(); i++) {
			String st = array.get(i);
			if (i == array.size()-1) {
				System.out.print(st+"]");
			}else{
				System.out.print(st+",");
			}
		}
		System.out.println();
		System.out.print("长度为奇数的元素有：[");
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
