import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CelebritySearchGUI extends JFrame
{
    /**
     * Array list of courses read from the csv file
     */
    private static final ArrayList<Celebrity> courses = new ArrayList<>();

    /**
     * Default list model for the controlling JList
     */
    private final DefaultListModel<Celebrity> jListModel = new DefaultListModel<>();

    /**
     * JList of Courses
     */
    private JList<Celebrity> jList = new JList<>(jListModel);

    /**
     * Constructs a new frame
     */
    public CelebritySearchGUI()
    {
        super("Sample Run"); // set title of the frame
        setSize(700, 400); // set size of the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setJMenuBar(getAppMenuBar()); // set the menu bar
        add(jList); // Add JList to the frame
        setVisible(true); // display the frame
    }

    /**
     * Returns JMenuBar to display to attach to the frame.
     *
     * @return an object of JMenuBar
     */
    public JMenuBar getAppMenuBar()
    {
        // Create an object of JMenuBar
        JMenuBar menuBar = new JMenuBar();

        // Create three menus
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F); // alt+F works too
        menuBar.add(fileMenu);

        JMenuItem  exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
        exitMenuItem.addActionListener((event)->System.exit(0)); // 0 means no errors

        JMenu searchMenu = new JMenu("Search");
        searchMenu.setMnemonic(KeyEvent.VK_S);
        menuBar.add(searchMenu);

        JMenu helpMenu = new JMenu("Help");
        helpMenu.setMnemonic(KeyEvent.VK_H);
        menuBar.add(helpMenu);

        JMenuItem aboutMenuItem = new JMenuItem("About");
        aboutMenuItem.addActionListener((event)->JOptionPane.showMessageDialog(CelebritySearchGUI.this,
                "This is the CELEBRITY APP!!!!",
                "About...",
                JOptionPane.INFORMATION_MESSAGE));

        aboutMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, InputEvent.SHIFT_DOWN_MASK));
        aboutMenuItem.setMnemonic(KeyEvent.VK_C);
        helpMenu.add(aboutMenuItem);

        JMenuItem fileItem1 = new JMenuItem("All Celebrities");

        // Create menu item for the Search menu
        JMenuItem searchItem1 = new JMenuItem("By Job");
        searchItem1.setMnemonic(KeyEvent.VK_J);
        searchMenu.add(searchItem1);

        JMenuItem searchItem2 = new JMenuItem("By First Name");
        searchItem2.setMnemonic(KeyEvent.VK_F);
        searchMenu.add(searchItem2);

        JMenuItem searchItem3 = new JMenuItem("BY Last Name");
        searchItem3.setMnemonic(KeyEvent.VK_L);
        searchMenu.add(searchItem3);

        JMenuItem searchItem4 = new JMenuItem("Alive Celebrities");
        searchItem4.setMnemonic(KeyEvent.VK_A);
        searchMenu.add(searchItem4);

        JMenuItem searchItem5 = new JMenuItem("Death Celebrities");
        searchItem5.setMnemonic(KeyEvent.VK_D);
        searchMenu.add(searchItem5);

        fileMenu.add(fileItem1);
        fileMenu.add(exitMenuItem);

        // Add the above menu items to the Search menu
        searchMenu.add(searchItem1);
        searchMenu.add(searchItem2);
        searchMenu.add(searchItem3);
        searchMenu.add(searchItem4);
        searchMenu.add(searchItem5);

        // Add the menus to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(searchMenu);
        menuBar.add(helpMenu);

        fileItem1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                // Clear data from JList
                jListModel.clear();

                // Ask user to enter course name to search
                for(Celebrity c : courses)
                {
                    jListModel.addElement(c);
                }
            }
        });
        // Add event listener to the first menu item of the Search menu
        searchItem1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                // Clear data from JList
                jListModel.clear();

                // Ask user to enter course name to search
                String searchQuery = JOptionPane.showInputDialog(null,
                        "What Job are you looking for?",
                        "Search by Job",
                        JOptionPane.QUESTION_MESSAGE);
                // Iterate through each course
                for(Celebrity c : courses)
                {
                    // If course search for found
                    if(c.getOccupation().equalsIgnoreCase(searchQuery))
                    {
                        // Display the course details
                        jListModel.addElement(c);
                    }
                }
            }
        });

        // Add event listener to the second menu item of the Search menu
        searchItem2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                // Clear data from JList
                jListModel.clear();

                // Ask user to enter instructor to search
                String searchQuery = JOptionPane.showInputDialog(null,
                        "Which First Name are you looking for?",
                        "Search by First Name",
                        JOptionPane.QUESTION_MESSAGE);
                // Iterate through each course
                for(Celebrity c : courses)
                {
                    // If instructor search for found
                    if (c.getFirstName().equalsIgnoreCase(searchQuery))
                    {
                        // Display the course details
                        jListModel.addElement(c);
                    }
                }
            }
        });

        // Add event listener to the third menu item of the Search menu
        searchItem3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                // Clear data from JList
                jListModel.clear();

                // Ask user to enter course name to search
                String searchQuery = JOptionPane.showInputDialog(null,
                        "Which Last Name are you looking for?",
                        "Search by Last Name",
                        JOptionPane.QUESTION_MESSAGE);
                // Iterate through each course
                for(Celebrity c : courses)
                {
                    // If instructor search for found
                    if (c.getLastName().equalsIgnoreCase(searchQuery))
                    {
                        // Display the course details
                        jListModel.addElement(c);
                    }
                }
            }
        });

        // Add event listener to the fourth menu item of the Search menu
        searchItem4.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                // Clear data from JList
                jListModel.clear();

                for(Celebrity c : courses)
                {
                    // If year for found
                    if(c.isAlive())
                    {
                        // Display the course details
                        jListModel.addElement(c);
                    }
                }
            }
        });

        searchItem5.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                // Clear data from JList
                jListModel.clear();

                for(Celebrity c : courses)
                {
                    // If year for found
                    if(!c.isAlive())
                    {
                        // Display the course details
                        jListModel.addElement(c);
                    }
                }
            }
        });
        // Return the created menu bar
        return menuBar;
    }

    /**
     * Main method to run this program
     *
     * @param args - the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        // Open the courses.csv file
        Scanner file = new Scanner(new File("files\\people.csv"));

        // Read the file
        while(file.hasNextLine())
        {
            // Read a line
            String line = file.nextLine();
            // Split the line string into tokens
            String[] celebrity = line.split(",");

            String id = celebrity[0];
            String occupation = celebrity[1];
            boolean alive = Boolean.parseBoolean(celebrity[2]);
            String firstName = celebrity[3];
            String middleName = celebrity[5];
            String lastName = celebrity[4];
            String citizenship = celebrity[6];
            // Create an instance of Course and add to the array list
            courses.add(new Celebrity(id, occupation, alive, firstName, middleName, lastName, citizenship));
        }

        // Close the file
        file.close();

        // Create an object of CourseSearchGUI
        CelebritySearchGUI app = new CelebritySearchGUI();
    }

}