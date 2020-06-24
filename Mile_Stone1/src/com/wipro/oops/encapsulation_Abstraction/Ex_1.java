package com.wipro.oops.encapsulation_Abstraction;
class Author {
    private String name;
    private String email;
    private char gender;
    Author(String name, String email, char g) {
        this.name = name;
        this.email = email;
        this.gender = g;
    }
    String getName() {
        return name;
    }
    String getEmail() {
        return email;
    }
    char getGender() {
        return gender;
    }
}
class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyStock;

    Book(String name, Author author, double p, int q) {
        this.name = name;
        this.author = author;
        this.price = p;
        this.qtyStock = q;
    }
    String getName() {
        return name;
    }
    Author getAuthor() {
        return author;
    }
    double getPrice() {
        return price;
    }
    int getQtyStock() {
        return qtyStock;
    }
}
public class Ex_1 {
	public static void main(String args[])
	{
		String a=args[0];
		String b=args[1];
		char c=args[2].charAt(0);
		String d=args[3];
		double e=Double.parseDouble(args[4]);
		int f=Integer.parseInt(args[5]);
		Author au=new Author(a,b,c);
		Book bo=new Book(d,au,e,f);
		System.out.println("Name of the Book: "+bo.getName());
		System.out.println("Author of the Book: "+bo.getAuthor().getName());
		System.out.println("Email: "+bo.getAuthor().getEmail());
		System.out.println("Gender: "+bo.getAuthor().getGender());
		System.out.println("Price: "+bo.getPrice());
		System.out.println("Qunatity Stock: "+bo.getQtyStock());
	}
}
