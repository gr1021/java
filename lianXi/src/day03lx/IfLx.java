package day03lx;

/*
 * if语句的第一种格式
 * if(关系表达式){
 * 		语句体;
 * }
 * 
 * if语句 的第二种格式：
 * 	if(关系表达式){
 * 		语句体1;
 * }else{
 * 		语句体2;
 * }
 * 
 * if语句的第三种格式：
 *if(关系表达式1){
 *	语句体1;
 *}else  if(关系表达式2){
 *	语句体2;
 *}
 *…….
 *else{
 *	语句体n+1;
 *}
 */
public class IfLx {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		// if语句的第一种格式
		/*
		 * if (a > b) { System.out.println("true"); }
		 */

		// if语句 的第二种格式：
		/*
		 * if (a >= b) { System.out.println("a大于b"); } else {
		 * System.out.println("a小于b"); }
		 */

		// if语句的第三种格式：
		if (a > b) {
			System.out.println("a大于b");
		} else if (a == b) {
			System.out.println("a等于b");
		} else {
			System.out.println("a小于b");
		}
	}
}
