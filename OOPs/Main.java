package OOPs;

//ENCAPSULATION
import java.util.*;

class Book {
    public ArrayList<String> title;
    private ArrayList<Boolean> isAvailable;

    public Book(ArrayList<String> title, ArrayList<Boolean> isAvailable) {
        this.title = title;
        this.isAvailable = isAvailable;
    }

    public void borrowBook(String bookName) {
        for (int i = 0; i < title.size(); i++) {
            if (title.get(i).equals(bookName)) {
                if (isAvailable.get(i) == true) {
                    System.out.println("book is borrowed");
                    isAvailable.set(i, false);
                } else {
                    System.out.println("Book is not available.");
                }
                return;
            }
        }
    }

    public void returnBook(String bookName) {
        for (int i = 0; i < title.size(); i++) {
            if (title.get(i).equals(bookName)) {
                isAvailable.set(i, true);
                return;
            }
        }
    }

    public void getAvailability(String bookName) {
        for (int i = 0; i < title.size(); i++) {
            if (title.get(i).equals(bookName)) {
                System.out.println(isAvailable.get(i));
                return;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<String> title = new ArrayList<>();
        title.add("n1");
        title.add("n2");
        title.add("n3");
        title.add("n4");


        ArrayList<Boolean> isAvailable = new ArrayList<>();
        isAvailable.add(true);
        isAvailable.add(true);
        isAvailable.add(true);
        isAvailable.add(false);

        Book b = new Book(title, isAvailable);

        b.borrowBook("n2");
        b.borrowBook("n1");
         b.borrowBook("n2");
        b.getAvailability("n1");
        b.returnBook("n3");
    }
}
