package i_i;

public class test {

	public static void main(String[] args) {

		Queue book = new BookShelf();
		book.enQueue("해리포터1");
		book.enQueue("해리포터2");
		book.enQueue("해리포터3");
		book.enQueue("해리포터4");
		book.enQueue("해리포터5");
		
		System.out.println(book.getSize());
		System.out.println(book.deQueue());
		System.out.println(book.deQueue());
		System.out.println(book.deQueue());
		System.out.println(book.deQueue());
		System.out.println(book.deQueue());
	}

}
