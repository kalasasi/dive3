package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import model.Books;

public class BookTest {
	public static void main(String []args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(Books.class);
		Books Bk=(Books)context.getBean(Books.class);
		Bk.setBookId(90);
		Bk.setBookName("wings of minds");
		Bk.setBookAuthor("Aurn");
		System.out.print(Bk);
		((AbstractApplicationContext) context).close();
	}

}
