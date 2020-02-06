package Lib;

public class Book {
    String title;
    String author;
    int PageCount;
    String Date;
    private void Book(String title,String author, int PageCount, String Date){
        this.title = title;
        this.author = author;
        this.PageCount = PageCount;
        this.Date = Date;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return PageCount;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return Date;
    }
    public void setBook(String title,String author, int PageCount, String Date){
        this.title = title;
        this.author = author;
        this.PageCount = PageCount;
        this.Date = Date;

    }

    public void Datee(String date){


    };
}
