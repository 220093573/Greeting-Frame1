/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author LISWO
 */
public class GreetingsGUI extends JFrame{

    private JPanel namePnl;
    private  JPanel surnamePnl;
    private JPanel nameAndsurnamePnl;
    private JPanel greetingsAreaPnl;
    private JPanel mainPnl;
    private JPanel btnPnl;
    private JPanel headingPnl;
    
    //labels
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    
    //textfields
    private JTextField nameTxtFld;
    private JTextField surnameTxtFld;
    
    //textarea
    private JTextArea greetingsTxtArea;
    
    //buttons
    
    private JButton greetBtn;
    private JButton clearBtn;
    private JButton exitBtn;

    public GreetingsGUI() {
        setLayout(new BorderLayout());
        setTitle("Greetings UI");
        setSize(700,750);
        setBackground(Color.yellow);
        
        //create the panels
       namePnl = new JPanel(new FlowLayout());
       surnamePnl = new JPanel(new FlowLayout());
       nameAndsurnamePnl = new JPanel(new GridLayout(2, 1));
       
       greetingsAreaPnl = new JPanel(new FlowLayout());
       greetingsAreaPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Greetings"));
       
       btnPnl = new JPanel(new  FlowLayout());
       mainPnl = new JPanel(new BorderLayout());
       
       headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
       headingPnl.setBorder(new BevelBorder(BevelBorder.RAISED));
       
       //create the lebels
       
       headingLbl = new JLabel("Greetings App");
       nameLbl = new JLabel("Name: ");
       surnameLbl = new JLabel("Surname: ");
       
       //create the text fields
       nameTxtFld = new JTextField(20);
       surnameTxtFld = new JTextField(20);
       
       //create the text area
       greetingsTxtArea = new JTextArea(40, 50);
       greetingsTxtArea.setEditable(false);
       greetingsTxtArea.setText("Hello [name] [surname]");
       
       //create the buttons 
       greetBtn = new JButton("Greet");
       clearBtn = new JButton("Clear");
       exitBtn = new JButton("Exit");
       
       namePnl.add(nameLbl);
       namePnl.add(nameTxtFld);
       
       surnamePnl.add(surnameLbl);
       surnamePnl.add(surnameTxtFld);
       
       nameAndsurnamePnl.add(namePnl);
       nameAndsurnamePnl.add(surnamePnl);
       
       greetingsAreaPnl.add(greetingsTxtArea);
       
       btnPnl.add(greetBtn);
       btnPnl.add(clearBtn);
       btnPnl.add(exitBtn);
       
       //add all the panels to the main panel
       mainPnl.add(nameAndsurnamePnl, BorderLayout.NORTH);
            mainPnl.add(greetingsAreaPnl, BorderLayout.CENTER);
                mainPnl.add(btnPnl, BorderLayout.SOUTH);
                
        add(headingPnl, BorderLayout.NORTH);
        add(mainPnl, BorderLayout.CENTER);
        
       
       //make the Frame visible
        setVisible(true);
       
    }
    
    
    
}
