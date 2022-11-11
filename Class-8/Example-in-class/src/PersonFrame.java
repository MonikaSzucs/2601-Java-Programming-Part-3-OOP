import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.List;

public class PersonFrame extends JFrame
{
    private static PersonFrame theInstance = new PersonFrame();

    private JPanel contentPane;
    private List<Celebrity> list;

    // singleton - private constructor
    private PersonFrame()
    {
        super("Famous People");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 300); // x, y (width, height)
        setLocationRelativeTo(null); // gui (frame) centered on the screen
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        buildMenu();
    }

    public static PersonFrame getTheInstance()
    {
        return theInstance;
    }

    public List<Celebrity> getList()
    {
        return list;
    }

    public void setList(List<Celebrity> list)
    {
        this.list = list;
    }

    // menuBar has a menu, which has menuItems
    public void buildMenu()
    {
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F); // alt+F works too
        menuBar.add(fileMenu);

        JMenuItem  loadMenuItem = new JMenuItem("Load");
        loadMenuItem.setMnemonic(KeyEvent.VK_L);
        fileMenu.add(loadMenuItem);

        JMenuItem  exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
        exitMenuItem.addActionListener((event)->System.exit(0)); // 0 means no errors
        // when you say exit then any number other than 1 will be an error

        exitMenuItem.setMnemonic(KeyEvent.VK_X);
        fileMenu.add(exitMenuItem);

        JMenu subMenu = new JMenu("My sub menu");
        fileMenu.add(subMenu);

        JMenuItem mntmNewMenuItem = new JMenuItem("new menu item");
        subMenu.add(mntmNewMenuItem);

        JMenu searchMenu = new JMenu("Search");
        searchMenu.setMnemonic(KeyEvent.VK_S);
        menuBar.add(searchMenu);

        JMenuItem byJobMenuItem = new JMenuItem("By Job");
        byJobMenuItem.setMnemonic(KeyEvent.VK_J);
        searchMenu.add(byJobMenuItem);
        byJobMenuItem.addActionListener(PersonFrame.this::searchByJob); // tbd

        JMenuItem byNameMenuItem = new JMenuItem("By Name");
        byNameMenuItem.setMnemonic(KeyEvent.VK_N);
        searchMenu.add(byNameMenuItem);
        byNameMenuItem.addActionListener(PersonFrame.this::searchByName); // tbd

        JMenu helpMenu = new JMenu("Help");
        helpMenu.setMnemonic(KeyEvent.VK_H);
        menuBar.add(helpMenu);

        JMenuItem aboutMenuItem = new JMenuItem("About");
        aboutMenuItem.addActionListener((event)->JOptionPane.showMessageDialog(PersonFrame.this,
                "This is the CELEBRITY APP!!!!",
                "About...",
                JOptionPane.INFORMATION_MESSAGE));

        aboutMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, InputEvent.SHIFT_DOWN_MASK));
        aboutMenuItem.setMnemonic(KeyEvent.VK_C);
        helpMenu.add(aboutMenuItem);


    }

    public void searchByJob(ActionEvent event)
    {
        JList allMatches;

        String job = JOptionPane.showInputDialog(PersonFrame.this, "What job are you looking for?",
                "Search by job", JOptionPane.QUESTION_MESSAGE);

        allMatches = new JList(SearchUtilities.byJob(job).toArray());

        this.add(allMatches);
        this.setVisible(true); // AFTER data loaded
    }


    public void searchByName(ActionEvent event)
    {
        String name = JOptionPane.showInputDialog(PersonFrame.this, "What name are you looking for?",
                "Search by name", JOptionPane.QUESTION_MESSAGE);

        JList allMatches = new JList(SearchUtilities.byName(name).toArray());
        this.add(allMatches);
    }

}
