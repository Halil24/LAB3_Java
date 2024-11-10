package Ex3;

public class TestBook {
    public static void main(String[] args) {
        Author author1=new Author("Ismail","Kadare");
        Author author2=new Author("J.K","Rowling");
        Book[] library= {new Book("1234567891234", "Kronike ne gur",author1,"Onufri",1230.50),
        new Book("1234567897896","Gjenerali i ushtrise se vdekur", author1),
        new Book("1234567894567","Harry Potter dhe i burgosuri i Azkabanit",author2)};
        printBooks(library);
        sort(library, "price");
    }
    public static void printBooks(Book[] library)
    {
        for (Book book:library){
            book.printBook();
        }
    }

    public static void sort(Book[] library, String criteria)
    {
        for (int i = 0; i <library.length-1; i++)
        {
                Book currentMin=library[i];
                int currentMinIndex=i;

                for (int j = i+1; j < library.length; j++){
                    boolean smallerThan=false;
                    switch (criteria){
                        case "price": smallerThan=library[i].getPrice()>currentMin.getPrice(); break;
                    }
                }
        }
    }
}
