package Book;

import java.util.Arrays;
import java.util.List;


public class Book {
    private String name="War and World";
    List<Author> authors;
    private double price;
    private int qty=0;

    public Book(String name, List<Author> authors, double price,int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty=qty;
    }
    public Book(String name, List<Author> authors, double price)
    {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(List<Author> authors) {
        this.authors = authors;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public List<Author> getAuthors() {
        return authors;
    }
    public String getAuthorsNames()
    {
        String a="";
        int i=0;
        for (Author p:authors)
        {
            a+=authors.get(i).getName()+" ";
            i++;
        }
        return a;
        //return String.valueOf(authors.get(0).getName());
    }
@Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", Author=" + getAuthors()+
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }



}
