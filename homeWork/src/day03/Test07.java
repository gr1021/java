package day03;

/*
 * 7.分析以下需求，并用代码实现：
 *		1.珠穆朗玛峰高度为8848米，有一张足够大的纸，厚度为0.0001米。
 *	    2.请问，我折叠多少次，可以折成珠穆朗玛峰的高度。
 * 	第一次折叠：2*x
 * 	第二次折叠：4*x
 * 	第三次折叠：8*x
 * 	第四次折叠：16*x
 * 	第五次折叠：32*x
 * .....
 * 	第n次折叠：n*x == 8848,求n  27
 */
public class Test07 {
	public static void main(String[] args) {
		int count = 0;
		//double x = 0.0001;
		//第一种方法
		for (double x = 0.0001; x <= 8848; x *= 2) {
			count++;
		}
		
		//第二种方法
		/*while (x <= 8848) {
			x *= 2;
			count++;
		}*/
		
		//第三种方法
		/*while(true){
			count++;
			x *= 2;
			if (x >= 8848) {
				break;
			}
		}*/
		System.out.println("count:" + count);
	}
}
