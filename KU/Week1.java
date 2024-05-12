import java.util.Scanner;
public class Week1 {
    String title;
    String author;
    int edition;
    String publication;

    // setter and getter method setter is used to set something 
    // this is used to call 
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return this.title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return this.author;
    }
    public void setEdition(int edition) {
        this.edition = edition;        
    }
    public  int getEdition() {
        return this.edition;
    }
    public void setPublication(String publication) {
        this.publication = publication;        
    }
    public String getPublication() {
        return this.publication;
    }
    public static void main(String[] args) {
        Week1 book1 = new Week1();
        book1.title = "Harry potter";
        book1.author = "J.K Rolling";
        book1.edition = 1;
        book1.publication = "Bloomsbury";
        
        System.out.println();
        
        Week1 book2 = new Week1();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your name : ");
        book2.setAuthor(keyboard.nextLine());
        System.out.println("Your name is : " + book2.getAuthor());
    }
}
