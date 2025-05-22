//Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada, Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and display the capital of the countries on console whenever the countries are selected on the list.


package program_5;

import java.util.*;
import javax.swing.*;
import javax.swing.event.*;

public class CountryCapitalList extends JFrame {
    private JList<String> countryList;

    public CountryCapitalList() {
        // Create the model and add countries
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("USA");
        listModel.addElement("India");
        listModel.addElement("Vietnam");
        listModel.addElement("Canada");
        listModel.addElement("Denmark");
        listModel.addElement("France");
        listModel.addElement("Great Britain");
        listModel.addElement("Japan");
        listModel.addElement("Africa");
        listModel.addElement("Greenland");
        listModel.addElement("Singapore");

        // Map to store country-capital pairs
        Map<String, String> countryCapitalMap = new HashMap<>();
        countryCapitalMap.put("USA", "Washington D.C.");
        countryCapitalMap.put("India", "New Delhi");
        countryCapitalMap.put("Vietnam", "Hanoi");
        countryCapitalMap.put("Canada", "Ottawa");
        countryCapitalMap.put("Denmark", "Copenhagen");
        countryCapitalMap.put("France", "Paris");
        countryCapitalMap.put("Great Britain", "London");
        countryCapitalMap.put("Japan", "Tokyo");
        countryCapitalMap.put("Africa", "Addis Ababa");
        countryCapitalMap.put("Greenland", "Nuuk");
        countryCapitalMap.put("Singapore", "Singapore");

        // Create the list
        countryList = new JList<>(listModel);
        countryList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    List<String> selectedCountries = countryList.getSelectedValuesList();
                    for (String country : selectedCountries) {
                        String capital = countryCapitalMap.get(country);
                        System.out.println("Capital of " + country + " is: " + capital);
                    }
                }
            }
        });

        add(new JScrollPane(countryList));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Country Capital List");
        this.setSize(300, 250);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        System.out.println("Please select countries from the list...");
        new CountryCapitalList();
    }
}
