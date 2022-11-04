public  class Book implements Comparable<Book>{
    private String bookName;
    private int pageNumbers;
    private String author;
    private int realeseDate;

    public Book(String bookName, int pageNumbers, String author, int realeseDate) {
        this.bookName = bookName;
        this.pageNumbers = pageNumbers;
        this.author = author;
        this.realeseDate = realeseDate;
    }




    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageNumbers() {
        return pageNumbers;
    }

    public void setPageNumbers(int pageNumbers) {
        this.pageNumbers = pageNumbers;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getRealeseDate() {
        return realeseDate;
    }

    public void setRealeseDate(int realeseDate) {
        this.realeseDate = realeseDate;
    }


    public int compareTo(Book b) {
        return this.getBookName().compareTo(b.getBookName());
    }
}
