package com.first;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import static java.awt.Color.red;

public class My_Window extends JFrame{
    private JLabel heading;
    private JLabel clockLabel;
    private Font font=new Font("",Font.BOLD,35);
    My_Window(){
        super.setTitle("My Clock");
        super.setSize(400,200);
        super.setLocation(500,300);
        super.setBackground(red);
        this.GUI();
        this.start_clock();
        super.setVisible(true);
    }
    public void GUI(){
//           heading=new JLabel("MY CLOCK");
           clockLabel=new JLabel("clock");

//           heading.setFont(font);
           clockLabel.setFont(font);

           this.setLayout(new GridLayout(1,1));
//           this.add(heading);
           this.add(clockLabel);
    }
    public void start_clock(){
        //creating object of timer class
        // delay is in ms
        Timer t =new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dateTime = new Date().toString();
                clockLabel.setText(dateTime);
            }
        });
        t.start();
    }

}
