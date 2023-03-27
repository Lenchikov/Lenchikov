import java.util.Date;

public class Reader {
    private String firstName;
    private String surName;
    private String patron;
    private int numReadTicket;
    private String faculty;
    private String dateBirth;
    private String phoneNumber;
    private Book[] books = new Book[10];
    public Reader(String firstName,String surName,String patron,int numReadTicket,String faculty,String dateBirth,String phoneNumber){
        this.firstName=firstName;
        this.surName=surName;
        this.patron=patron;
        this.numReadTicket=numReadTicket;
        this.faculty=faculty;
        this.dateBirth=dateBirth;
        this.phoneNumber=phoneNumber;
    }

    public int getNumReadTicket() {
        return numReadTicket;
    }

    public void printStatus(){
        int count = 0;
        for(Book book : books){
            if (book!=null){
                count++;
            }
        }
        String a;
        if (count==0){
            a=" книг\n";
        }else if (count==1){
            a=" книгу: ";
        }else {
            a=" книги: ";
        }
        System.out.println(surName+" "+firstName.toUpperCase().charAt(0)+"."+
                patron.toUpperCase().charAt(0)+". взял "+count+" "+a);
        if (count!=0){
            int val = 0;
            for(Book book : books){
                if (book!=null){
                    if (val==0){
                        System.out.print(book.getName());
                    }else {
                        System.out.print(", "+book.getName());
                    }
                    val++;
                }
            }
            System.out.println();
        }
        }
        public void takeBook(Book book){
        for (int i=0;i < books.length;i++){
            if (books[i]==null){
                books[i]=book;
                break;
            }
            }
        System.out.println(surName+" "+firstName.toUpperCase().charAt(0)+"."+
                patron.toUpperCase().charAt(0)+". взял книгу "+book.getName());
        }

        public void returnBook(String nameBook){
        boolean check = false;
        for (int i =0; i< books.length;i++){
            if (books[i]!=null && books[i].getName().equals(nameBook)) {
                books[i]=null;
                System.out.println(surName+" "+firstName.toUpperCase().charAt(0)+"."+
                        patron.toUpperCase().charAt(0)+". вернул книгу "+nameBook);
            }
        }
        if(!check){
            System.out.println(surName+" "+firstName.toUpperCase().charAt(0)+"."+
                    patron.toUpperCase().charAt(0)+". не хранит книгу "+nameBook);
            System.out.println();
        }
        }
    }
