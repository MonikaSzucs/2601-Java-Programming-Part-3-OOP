import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CarSearchGUI extends JFrame {

    private static final ArrayList<Cars> carList = new ArrayList<>();

    private final DefaultListModel<Cars> jListModel = new DefaultListModel<>();

    private JList<Cars> jList = new JList<>(jListModel);

    public CarSearchGUI() {
        super("Car Search Application");
        setSize(700, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setJMenuBar(getAppMenuBar());
        add(jList);
        setVisible(true);
    }

    public JMenuBar getAppMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        // Creating three menus
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F); // alt + F works too
        menuBar.add(fileMenu);

        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
        exitMenuItem.addActionListener((event) -> System.exit(0)); // 0 means no error

        fileMenu.add(exitMenuItem);

        JMenu searchMenu = new JMenu("Search");
        searchMenu.setMnemonic(KeyEvent.VK_S);
        menuBar.add(searchMenu);

        JMenu helpMenu = new JMenu("Help");
        helpMenu.setMnemonic(KeyEvent.VK_H);
        menuBar.add(helpMenu);

        JMenuItem aboutMenuItem = new JMenuItem("About");
        aboutMenuItem.addActionListener((event) -> JOptionPane.showMessageDialog(CarSearchGUI.this,
                "This is a car search application",
                "About pop up",
                JOptionPane.INFORMATION_MESSAGE));

        aboutMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, InputEvent.SHIFT_DOWN_MASK));
        aboutMenuItem.setMnemonic(KeyEvent.VK_C);
        helpMenu.add(aboutMenuItem);

        JMenuItem fileItem1 = new JMenuItem("All Cars");
        fileMenu.add(fileItem1);

        // Create menu item for the Search menu
        JMenuItem searchItem1 = new JMenuItem("By Make");
        searchItem1.setMnemonic(KeyEvent.VK_M);
        searchMenu.add(searchItem1);

        JMenuItem searchItem2 = new JMenuItem("By Model");
        searchItem2.setMnemonic(KeyEvent.VK_O);
        searchMenu.add(searchItem2);

        JMenuItem searchItem3 = new JMenuItem("By Year");
        searchItem3.setMnemonic(KeyEvent.VK_Y);
        searchMenu.add(searchItem3);

        JMenuItem searchItem4 = new JMenuItem("By If Is Electric");
        searchItem4.setMnemonic(KeyEvent.VK_E);
        searchMenu.add(searchItem4);

        menuBar.add(fileMenu);
        menuBar.add(searchMenu);
        menuBar.add(helpMenu);

        fileItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // clear data from JList
                jListModel.clear();

                // Ask user to enter course name to search
                for(Cars c : carList) {
                    jListModel.addElement(c);
                }
            }
        });

        return menuBar;
    }

    public static void main(final String[] args) throws FileNotFoundException {
        Scanner file;
        file = new Scanner(new File("files\\cars.csv"));

        while(file.hasNextLine()) {
            // Read a line
            String line = file.nextLine();

            // Split the line string into tokens
            String[] cars = line.split(",");

            int id = Integer.parseInt(cars[0]);
            String make = cars[1];
            String model = cars[2];
            int year = Integer.parseInt(cars[3]);
            boolean electric = Boolean.parseBoolean(cars[4]);

            // Create an instance of Course and add to the array list
            carList.add(new Cars(id, make, model, year, electric));

        }

        // Close the file
        file.close();

        CarSearchGUI app = new CarSearchGUI();
    }

}
