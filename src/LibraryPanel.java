import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LibraryPanel extends JPanel{

    JLabel bookId, bookName, borrowerName;
    JTextField bookIdTextField, namTextField, borrowTextField;
    JButton create, search, delete;
    JPanel panel1, panel2;

    Library library = new Library();
    LibraryPanel()
    {
        bookId = new JLabel("Book ID");
        bookIdTextField = new JTextField(20);

        bookName = new JLabel("Book Name");
        namTextField = new JTextField(20);

        borrowerName = new JLabel("Borrower Name");
        borrowTextField = new JTextField(20);

        create = new JButton("CREATE");
        create.addActionListener(new CreateBook());

        panel1 = new JPanel();
        panel1.add(bookId);
        panel1.add(bookIdTextField);
        panel1.add(bookName);
        panel1.add(namTextField);
        panel1.add(borrowerName);
        panel1.add(borrowTextField);
        panel1.add(create);

        panel2 = new JPanel();
        search = new JButton("SEARCH");
        search.addActionListener(new SearchBook());
        panel2.add(search);

        add(panel1);
        add(panel2);
    }
    
    class CreateBook implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            String id = bookIdTextField.getText();
            String name = namTextField.getText();
            String borrower = borrowTextField.getText();

            library.createBook(new Book(id, name, borrower));
        }
    }

    class SearchBook implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, library.getBooklist());
        }
        
    }
}
