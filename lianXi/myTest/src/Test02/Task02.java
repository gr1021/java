package Test02;

/*
 * 需求：把数组中的数据按照指定个格式拼接成一个字符串
 举例： int[] arr = {1,2,3};	
 输出结果："[1, 2, 3]"

 */
public class Task02 {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3 };

					/*System.out.print("[");
					for (int i = 0; i < arr.length; i++) {
						if (i == arr.length - 1) {
							System.out.print(arr[i]);
						} else {
							System.out.print(arr[i] + ",");
						}
					}
					System.out.print("]");*/
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length-1) {
				sb.append(arr[i]);
			}else{
				sb.append(arr[i]).append(",");
			}
		}
		sb.append("]");
//		String ss = sb.toString();
		System.out.println(sb);
		
		//定义方法实现
		String s = reverse(arr);
		System.out.println(s);
		
	}
	
	public static String reverse(int[] arr){
		String ss = "";
		ss += "[";
		
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length-1) {
				ss += arr[i];
			}else{
				ss += arr[i];
				ss += ",";
			}
		}
		ss += "]";
		return ss;
	}
}
