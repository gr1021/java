package day07_004;

public class BookTest {
	public static void main(String[] args) {
		Book b1 = new Book("001", "ͼ��1", 20);
		b1.print();
		Book b2 = new Book("002", "ͼ��2", 25);
		b2.print();
		Book b3 = new Book("003", "ͼ��3", 35);
		b3.print();

		if (b1.getPrice() > b2.getPrice()) {
			if (b1.getPrice() > b3.getPrice()) {
				System.out.println("�۸���ߵ�ͼ���ǣ�" + b1.getName());
			} else {
				System.out.println("�۸���ߵ�ͼ���ǣ�" + b3.getName());
			}
			} else if (b3.getPrice() > b2.getPrice()) {
				System.out.println("�۸���ߵ�ͼ���ǣ�" + b3.getName());
			} else {
				System.out.println("�۸���ߵ�ͼ���ǣ�" + b2.getName());
		}
	}
}
