package by.intexsoft.study.ITXSUNFLOW425.annotation1;

import by.intexsoft.study.ITXSUNFLOW425.annotation1.model.Books;

import java.lang.reflect.Method;

public class BookStarter {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException {

        Books books = new Books();

        Class<Books> library = Books.class;
        books.printBook(library);;

        Method method = library.getMethod("changeBook");
        Books.printBook(method);

    }

}
