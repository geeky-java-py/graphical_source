//package com.calculator.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GUI_Addition extends JFrame implements ActionListener{
	
	JLabel l1, l2;
	JButton b;
	JTextField t1,t2,t3;
	
	
	GUI_Addition(){
		
		
		setLayout(new FlowLayout());
		
		l1 = new JLabel("First Number");
		t1 = new JTextField(20);
		
		l2 = new JLabel("Second Number");
		t2 = new JTextField(20);
		
		b = new JButton("Add");
		
		t3 = new JTextField(20);
		
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b);
		add(t3);
		
		
		b.addActionListener(this);
		
		setVisible(true);
		setSize(400,400);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new GUI_Addition(); 

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		int num1 = Integer.parseInt(t1.getText());
		int  num2 = Integer.parseInt(t2.getText());
		
		int value = num1 + num2;
		
		t3.setText(" "+value);
		
		
		
		
	}

}
