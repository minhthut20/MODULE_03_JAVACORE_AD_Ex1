package ra.bussinessImp;

import java.util.Comparator;

public class  BookPrice implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return (int) (o1.getExportPrice() - o2.getExportPrice());
    }
}
