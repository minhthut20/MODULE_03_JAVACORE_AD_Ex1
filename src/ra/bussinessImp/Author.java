package ra.bussinessImp;

import ra.InputMethods;
import ra.bussiness.IShop;

public class Author implements IShop {
    private int authorId;
    private String authorName;
    private Boolean sex;
    private int year;

    public Author() {
    }

    public Author(int authorId, String authorName, Boolean sex, int year) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.sex = sex;
        this.year = year;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public void inputData() {
        System.out.println("---------------Nhập vào-----------------");
        System.out.print("Nhập vào mã tác giả : ");
        setAuthorId(InputMethods.getInteger());
        System.out.print("NHập vào tên tác giả : ");
        setAuthorName(InputMethods.getString());
        System.out.print("Nhập vào giới tính tác giả : ");
        setSex(InputMethods.getBoolean());
        System.out.print("Nhập vào năm sinh tác gỉa : ");
        setYear(InputMethods.getInteger());
    }

    @Override
    public void displayData() {
        System.out.println("---------------Thông tin tác giả-----------------");
        System.out.println("Mã tác giả : " + getAuthorId());
        System.out.println("Tên tác giả : " + getAuthorName());
    }
}
