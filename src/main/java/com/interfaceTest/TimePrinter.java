package com.interfaceTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class TimePrinter implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("At the tone, the time is " + new Date());
        Toolkit.getDefaultToolkit().beep();
    }

    public static void main(String[] args) {
        //

        ActionListener actionListener =  new TimePrinter();
        javax.swing.Timer timer = new Timer(2000,actionListener);
        ActionListener listener = event -> System.out.println("the fuctionInterface ");
        javax.swing.Timer t =new javax.swing.Timer(1000,listener);

        javax.swing.Timer t1= new Timer(1000,event-> System.out.println("hello worrd"));
        timer.start();
        t.start();
        JOptionPane.showMessageDialog(null,"Quit ");

    }
}
