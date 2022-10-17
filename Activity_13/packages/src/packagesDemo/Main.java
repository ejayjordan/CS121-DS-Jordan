package packagesDemo;

public class Main {
    String title;
    String author;
    int copies;
    int pages;

    public Main(String Book, String Name, int prints, int paper){
        this.title = Book;
        this.author = Name;
        this.copies = prints;
        this.pages = paper;
    }

    public String getTitle() {
        System.out.print(title);
        return title;
    }

    public String getAuthor() {
        System.out.print(author);
        return author;
    }

    private int getCopies() {
        System.out.print(copies);
        return copies;
    }

    private int getPages() {
        System.out.print(pages);
        return pages;
    }
}
