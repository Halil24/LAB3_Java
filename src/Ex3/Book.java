package Ex3;

public class Book {
    private String ISBN;
    private String title;
    private String author;
    private String publisher;
    private double price;

    public Book(String i, String t, String a, String p, double p)
    {
        setISBN(i);
        title=t;
        author=a;
        publisher=pub;
        setPrice(p);
    }
public void setISBN(String isbn){
        if (isbn.length==13)
            ISBN=isbn;

}
public String setPrice(String t){
        if (p>0){
            price=p;
        }
}
public String getISBN(){
        return ISBN;
}
public Author getAuthor(){
        return author;
}
public String getTitle(){
        return title;
}
public String getPublisher(){
        return publisher;
}
public double getPrice(){
        return price;
}
public void printBook(){
        System.out.printf("ISBN: %s, Title: %s, Author: %s, Publisher: %s, Price: %.2f\n",getISBN(), getTitle(),
                getAuthor(),getFirstName(),getAuthor(),getLastName(), getPublisher(), getPrice);
}
}
