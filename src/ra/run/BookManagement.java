package ra.run;

import ra.InputMethods;
import ra.bussinessImp.Author;
import ra.bussinessImp.Book;
import ra.bussinessImp.BookPrice;

import java.util.*;

public class BookManagement {
    public static List<Author> authorsList = new ArrayList<>();
    public static List<Book> bookList = new ArrayList<>();


    public static void main(String[] args) {
//        authorsList.add(new Author(1, "Minh Thu", false, 2000));
//        authorsList.add(new Author(2, "Do Chuan", true, 1992));
//        authorsList.add(new Author(3, "Hai Yen", false, 1992));
//        authorsList.add(new Author(4, "Duc Vuong", true, 1993));
//        bookList.add(new Book(1, "Book 1", "Book 1", 200, authorsList.get(2), 200, 80, false));
//        bookList.add(new Book(2, "Book 2", "Book 2", 2000, authorsList.get(0), 300, 20, true));
//        bookList.add(new Book(3, "Book 3", "Book 3", 200, authorsList.get(1), 100, 70, false));
        while (true) {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************\n" +
                    "1. Nhập số tác giả và nhập thông tin các tác giả\n" +
                    "2. Nhập số sách và nhập thông tin các sách\n" +
                    "3. Sắp xếp sách theo giá xuất sách tăng dần (Comparable/Comparator)\n" +
                    "4. Tìm kiếm sách theo tên tác giả sách\n" +
                    "5. Thoát");
            System.out.print("Nhập chức năng muốn thực thi:  ");
            int option = InputMethods.getInteger();
            switch (option) {
                case 1:
                    inputAuthor();
                    break;
                case 2:
                    inputBook();
                    break;
                case 3:
                    sortPriceBook();
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.print("Lựa chọn không hợp lệ, vui lòng chọn lại");
                    break;
            }
        }
    }
    //1. Nhập số tác giả và nhập thông tin các tác giả
    public static void inputAuthor() {
       Author author = new Author();
       author.inputData();
       authorsList.add(author);
       System.out.println("------------------Thông tin tác giả--------------------");
    }

    //2. Nhập số sách và nhập thông tin các sách
    public static void inputBook() {
        Book book = new Book();
        book.inputData();
        bookList.add(book);
        System.out.println("------------------Thông tin sách--------------------");
    }

    //3. Sắp xếp sách theo giá xuất sách tăng dần
    public static void sortPriceBook() {
        BookPrice bookPrice = new BookPrice();
        Collections.sort(bookList,bookPrice);
        displayBook();
    }

    private static void displayBook() {
        int bookListSize = bookList.size();
        for (int i = 0; i < bookListSize; i++) {
            bookList.get(i).displayData();
        }
    }
    //4. Tìm kiếm sách theo tên tác giả sách

}
