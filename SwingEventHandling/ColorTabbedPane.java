//Develop a Swing program in Java to create a Tabbed Pan of RED, BLUE and GREEN anddisplay the concerned color whenever the specific tab is selected in the Pan.

package program_5;

import java.awt.Color;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ColorTabbedPane extends JFrame {
    JTabbedPane tabbedPane;
    JPanel bluePanel, redPanel, greenPanel;
    
    ColorTabbedPane() {
        // Create panels for each tab
        bluePanel = new JPanel();
        redPanel = new JPanel();
        greenPanel = new JPanel();
        
        // Set initial background colors
        bluePanel.setBackground(Color.BLUE);
        redPanel.setBackground(Color.RED);
        greenPanel.setBackground(Color.GREEN);
        
        // Create tabbed pane and add tabs with panels
        tabbedPane = new JTabbedPane();
        tabbedPane.setBounds(50, 50, 300, 300);
        tabbedPane.add("BLUE", bluePanel);
        tabbedPane.add("RED", redPanel);
        tabbedPane.add("GREEN", greenPanel);
        
        // Add ChangeListener to detect tab selection changes
        tabbedPane.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int index = tabbedPane.getSelectedIndex();
                String colorName = tabbedPane.getTitleAt(index);
                System.out.println(colorName + " tab is selected");
            }
        });
        
        // Add tabbedPane to the frame
        add(tabbedPane);
        
        // JFrame settings
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new ColorTabbedPane();
    }
}
