import java.util.TreeSet;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Book b1=new Book("Suç ve Ceza",700,"Dostoyevski",1870);
        Book b2=new Book("Nutuk",500,"Mustafa Kemal Atatürk",1930);
        Book b3=new Book("Şu çılgın Türkler",850,"Turgut Özakman",2010);
        Book b4=new Book("Safahat",300,"Mehmet Akif Ersoy",1935);
        Book b5=new Book("Kürk mantolu Madonna",250,"Sebahattin Ali",1970);

        TreeSet<Book> books=new TreeSet<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);

        for(Book bookName :books){
            System.out.println("Kitap ismi: "+bookName.getBookName());
            System.out.println("Sayfa sayısı: "+bookName.getPageNumbers());
            System.out.println("Yazar: "+bookName.getAuthor());
            System.out.println("Basım yılı: "+bookName.getRealeseDate());
            System.out.println("-----");
        }
        TreeSet<Book> bookss=new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumbers()-o2.getPageNumbers();
            }
        });

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        System.out.println("************************************");
        System.out.println("sorted by number of page");
        for(Book bookPage:books){
            System.out.println("Book Name: "+bookPage.getBookName()+
                    "\nNumber of page: "+bookPage.getPageNumbers()+
                    "\nAuthor Name: "+bookPage.getAuthor()+
                    "\nReleased Date: "+bookPage.getRealeseDate());
            System.out.println("..........................................");
        }




        }
}