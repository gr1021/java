package it;

/*
 * 方法重载
 * 数据求和   int类型的  float类型的    double类型的
 */
public class Test08 {
	public static void main(String[] args) {
		// 调用
		int sum = sum(10, 20);
		System.out.println("sum:" + sum);

		int sum1 = sum(10, 20, 30);
		System.out.println("sum1:" + sum1);

		float sum2 = sum(11.2F, 12.3F);
		System.out.println("sum2:" + sum2);

		double sum3 = sum(11.2, 12.3, 12.3);
		System.out.println("sum3:" + sum3);

	}

	public static int sum(int a, int b) {
		int c = a + b;
		return c;
	}

	public static float sum(float a, float b) {
		float c = a + b;
		return c;
	}

	public static double sum(double a, double b, double c) {
		double x = a + b + c;
		return x;
	}

	public static int sum(int a, int b, int c) {
		int y = a + b + c;
		return y;
	}
}
