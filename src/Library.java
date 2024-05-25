import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public class Library {
    ArrayList <Book> book = new ArrayList<>();

    public void createBook(Book b)
    {
        book.add(b);
    }

    public ArrayList<Book> getBooklist()
    {
        return book;
    }

    public Book searchBookByID(String id)
    {
        for(Book b : book)
        {
            if(b.getBookID().equals(id))
            {
                return b;
            }
        }
        return null;
    }

    public void deleteBook(String id)
    {
        try {
            for(Book b : book)
            {
                if(b.getBookID().equals(id))
                {
                    book.remove(b);
                }
            }    
        } catch (ConcurrentModificationException e) {

        }
    }

    public void updateBookByID(String id, String borrowerName)
    {
        for(Book b : book)
        {
            if(b.getBookID().equals(id))
            {
                b.setBorrowerName(borrowerName);
            }
        }
    }
}
