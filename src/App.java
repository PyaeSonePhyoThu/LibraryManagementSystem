import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame jFrame = new JFrame();
        LibraryPanel libraryPanel = new LibraryPanel();

        jFrame.add(libraryPanel);
        jFrame.setVisible(true);
        jFrame.setSize(1000,1000);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
