package by.intexsoft.study.ITXSUNFLOW425.annotation1.model;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

@Book
public class Books {

    public static void printBook(AnnotatedElement element){
        Annotation[] annotations = element.getAnnotations();
        System.out.println("Book");
        for (Annotation annotation : annotations) {
            if (annotation instanceof Book book) {
                System.out.println("Id:" + book.id());
                System.out.println("Name:" +book.name());
                System.out.println("Author:" + book.author());
                System.out.println("Publisher: " + book.publisher());
                System.out.println("Year:" +book.year());
                System.out.println("\n");
            }
        }
    }

    @Book(id = "2", name = "MyStory", author = "Mary", publisher = "SmartBooks", year = "2000" )
    public void changeBook(){
    }

}
