public class Book {
    private String name;
    private int pages;
    private int pyear;

    public Book (String bookName, int bookPages, int bookYear) {
        this.name = bookName;
        this.pages = bookPages;
        this.pyear = bookYear;
    }

    public String getName() {
        return this.name;
    }
    public int getPages() {
        return this.pages;
    }
    public int getPyear() {
        return this.pyear;
    }

    public String toString() {
        return this.name + ", " + this.pages + " pages, " + this.pyear;
    }

}
