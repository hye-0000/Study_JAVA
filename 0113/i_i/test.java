package i_i;

public class test {

	public static void main(String[] args) {

		Queue book = new BookShelf();
		book.enQueue("�ظ�����1");
		book.enQueue("�ظ�����2");
		book.enQueue("�ظ�����3");
		book.enQueue("�ظ�����4");
		book.enQueue("�ظ�����5");
		
		System.out.println(book.getSize());
		System.out.println(book.deQueue());
		System.out.println(book.deQueue());
		System.out.println(book.deQueue());
		System.out.println(book.deQueue());
		System.out.println(book.deQueue());
	}

}
