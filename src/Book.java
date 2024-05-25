public class Book {
    private String bookID;
    private String bookname;
    private String borrowerName;

    public Book()
    {
        setBookID(null);
        setBookname(null);
        setBorrowerName(null);
    }

    public Book(String bookID, String bookname, String borrowerName)
    {
        // setBookID(bookID);
        // setBookname(bookname);
        // setBorrowerName(borrowerName);
        this.bookID = bookID;
        this.bookname = bookname;
        this.borrowerName = borrowerName;
    }

    public String getBookID() {
        return bookID;
    }
    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getBookname() {
        return bookname;
    }
    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBorrowerName() {
        return borrowerName;
    }
    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    @Override
    public String toString() {
        return "Book Id : " +   getBookID() + "\nBook Name : " + getBookname() + "\nBorrower Name : " + getBorrowerName();
    }
}
