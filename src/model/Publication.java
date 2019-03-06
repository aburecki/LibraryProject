package model;

public class Publication {
    private int year;
    private String title;
    private String publisher;


    Publication(String title, String publisher, int year) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }

     int getYear() {
        return year;
    }

     void setYear(int year) {
        this.year = year;
    }

     String getTitle() {
        return title;
    }

     void setTitle(String title) {
        this.title = title;
    }

     String getPublisher() {
        return publisher;
    }

     void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
