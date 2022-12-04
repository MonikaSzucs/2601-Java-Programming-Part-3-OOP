import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * CountryList.java
 *
 * COMP 2601 - CRN: 48065
 * Friday evenings, Fall 2022
 * Assignment 2
 *
 * @author Monika Szucs and Guilherme Trevisan
 * @version 1.1
 *
 */
public class CountryList extends JFrame{
    private static final ArrayList<CountryCapital> newCountryCapitalList = new ArrayList<>();

    private final DefaultListModel<CountryCapital> jListCountryCapital = new DefaultListModel<>();

    private JList<CountryCapital> jList = new JList<>(jListCountryCapital);


    public CountryList() {
        super("Country Search Application");

        setSize(700, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setJMenuBar(getAppMenuBar());
        add(jList);
        setVisible(true);
    }

    /**
     * @return the display of the App Menu Bar
     */
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
        aboutMenuItem.addActionListener((event) -> JOptionPane.showMessageDialog(CountryList.this,
                "This is a country and capital search application",
                "About pop up",
                JOptionPane.INFORMATION_MESSAGE));

        aboutMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, InputEvent.SHIFT_DOWN_MASK));
        aboutMenuItem.setMnemonic(KeyEvent.VK_C);
        helpMenu.add(aboutMenuItem);

        JMenuItem fileItem1 = new JMenuItem("All Countries and Capitals");
        fileMenu.add(fileItem1);

        // Create menu item for the Search menu
        JMenuItem searchItem1 = new JMenuItem("By Country");
        searchItem1.setMnemonic(KeyEvent.VK_M);
        searchMenu.add(searchItem1);

        JMenuItem searchItem2 = new JMenuItem("By Capital");
        searchItem2.setMnemonic(KeyEvent.VK_M);
        searchMenu.add(searchItem2);

        searchMenu.add(searchItem1);
        searchMenu.add(searchItem2);

        menuBar.add(fileMenu);
        menuBar.add(searchMenu);
        menuBar.add(helpMenu);

        fileItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // clear data from JList
                jListCountryCapital.clear();

                // Ask user to enter course name to search
                for(CountryCapital c : newCountryCapitalList) {
                    jListCountryCapital.addElement(c);
                }
            }
        });

        searchItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jListCountryCapital.clear();

                String searchQuery = JOptionPane.showInputDialog(null,
                        "What country are you looking for?",
                        "Search by country",
                        JOptionPane.QUESTION_MESSAGE);
                for(CountryCapital c: newCountryCapitalList) {
                    if(c.getCountry().toLowerCase().contains(searchQuery.toLowerCase())) {
                        jListCountryCapital.addElement(c);
                    }
                }
            }
        });

        searchItem2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jListCountryCapital.clear();

                String searchQuery = JOptionPane.showInputDialog(null,
                        "What capital are you looking for?",
                        "Search by capital",
                        JOptionPane.QUESTION_MESSAGE);
                for(CountryCapital c: newCountryCapitalList) {
                    if(c.getCapital().toLowerCase().contains(searchQuery.toLowerCase())) {
                        jListCountryCapital.addElement(c);
                    }
                }
            }
        });

        return menuBar;
    }

    /**
     *
     * @param args the main argument
     * @throws FileNotFoundException checking to see if an excel file is not found in the searched directory
     */
    public static void main(final String[] args) throws FileNotFoundException {
        Scanner file;
        file = new Scanner(new File("files\\countries-and-capitals.txt"));

        while(file.hasNextLine()) {
            // Read a line
            String line = file.nextLine();
            System.out.println(line);

            // Split the line string into tokens
            String[] countryCapitalList = line.split(",");
            System.out.println(countryCapitalList[0]);

            String country =countryCapitalList[0];
            String capital = countryCapitalList[1];


            // Create an instance of Course and add to the array list
            newCountryCapitalList.add(new CountryCapital(country, capital));

        }

        // Close the file
        file.close();

        CountryList app = new CountryList();
    }

}
