package day03lx;

/*
 * if���ĵ�һ�ָ�ʽ
 * if(��ϵ���ʽ){
 * 		�����;
 * }
 * 
 * if��� �ĵڶ��ָ�ʽ��
 * 	if(��ϵ���ʽ){
 * 		�����1;
 * }else{
 * 		�����2;
 * }
 * 
 * if���ĵ����ָ�ʽ��
 *if(��ϵ���ʽ1){
 *	�����1;
 *}else  if(��ϵ���ʽ2){
 *	�����2;
 *}
 *����.
 *else{
 *	�����n+1;
 *}
 */
public class IfLx {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		// if���ĵ�һ�ָ�ʽ
		/*
		 * if (a > b) { System.out.println("true"); }
		 */

		// if��� �ĵڶ��ָ�ʽ��
		/*
		 * if (a >= b) { System.out.println("a����b"); } else {
		 * System.out.println("aС��b"); }
		 */

		// if���ĵ����ָ�ʽ��
		if (a > b) {
			System.out.println("a����b");
		} else if (a == b) {
			System.out.println("a����b");
		} else {
			System.out.println("aС��b");
		}
	}
}
