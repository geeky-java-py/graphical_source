//package com.calculator.demo;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


@SuppressWarnings("unused")
public class Graphical implements ActionListener{
	
	static JFrame win;
	JButton add, minus, multiply, divide;
	JTextField field, field1;
	JTextArea resultfield;
	
	JInternalFrame inf;
	JLabel title, l1, l2, result;
	
	
	Graphical(){
		
		title = new JLabel("Arithmetic Operation");
		title.setFont(new Font(Font.MONOSPACED,Font.BOLD, 25));
		title.setForeground(Color.red);
		
		
		l1 = new JLabel("Number[1]");
		l1.setFont(new Font(Font.DIALOG,Font.BOLD, 15));
		l1.setForeground(Color.BLUE);
		
		
		
		field = new JTextField();
		field.setFont(new Font(Font.MONOSPACED, Font.BOLD, 25));
		field.setForeground(Color.BLACK);
		field.setBackground(Color.white);
		
		
		
		l2 = new JLabel("Number[2]");
		l2.setFont(new Font(Font.DIALOG, Font.BOLD, 15));
		l2.setForeground(Color.BLUE);
		
		field1 = new JTextField();
		field1.setFont(new Font(Font.MONOSPACED, Font.BOLD, 25));
		field1.setForeground(Color.BLACK);
		
		
		add = new JButton("Addition");
		add.setForeground(Color.black);
		add.setBackground(Color.cyan);
		add.addActionListener(this);
		
		minus =  new JButton("Substraction");
		minus.setForeground(Color.white);
		minus.setBackground(Color.BLUE);
		minus.addActionListener(this);
		
		
		multiply = new JButton("Muliplication");
		multiply.setForeground(Color.BLACK);
		multiply.setBackground(Color.CYAN);
		multiply.addActionListener(this);
		
		
		divide = new JButton("Division");
		divide.setForeground(Color.white);
		divide.setBackground(Color.BLUE);
		divide.addActionListener(this);
		
		result = new JLabel("Result");
		result.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
		result.setForeground(Color.red);
		
		
		resultfield = new JTextArea();
		resultfield.setFont(new Font(Font.SERIF, Font.BOLD, 25));
		resultfield.setForeground(Color.white);
		resultfield.setBackground(Color.BLACK);
		resultfield.setEditable(false);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// Inside Frame
		
		inf = new JInternalFrame();
		inf.setVisible(true);
		inf.setLayout(new GridLayout(12,10));
		
		
		
		// Outer Main Frame 
		
		win = new JFrame("Graphical");
		win.setVisible(true);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setSize(350,450);
		win.setResizable(false);
		
		
		// Show Inside Frame in Outer Frame (main)
		win.add(inf);
		
		
		// show widgets in inner frame
		inf.add(title);
		inf.add(l1);
		inf.add(field);
		inf.add(l2);
		inf.add(field1);
		inf.add(add);
		inf.add(minus);
		inf.add(multiply);
		inf.add(divide);
		inf.add(result);
		inf.add(resultfield);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProgressBar p = new ProgressBar();
		p.iterate();
		p.setInvisible();

		new Graphical();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==add) {
			
		
			
			int num1 = Integer.parseInt(field.getText());
			int  num2 = Integer.parseInt(field1.getText());
			
			int sum = num1 + num2;
			
			resultfield.setText(" "+sum);
			
			
		}
		else if(e.getSource()==minus) {
			
			int num1 = Integer.parseInt(field.getText());
			int  num2 = Integer.parseInt(field1.getText());
			
			int min = num1 - num2;
			
			resultfield.setText(" "+min);
			
			
		}
		else if(e.getSource()==multiply) {
			
			int num1 = Integer.parseInt(field.getText());
			int  num2 = Integer.parseInt(field1.getText());
			
			int mult = num1 * num2;
			
			resultfield.setText(" "+mult);
		}
		else if(e.getSource()==divide) {
			
			int num1 = Integer.parseInt(field.getText());
			int  num2 = Integer.parseInt(field1.getText());
			
			int div = num1 / num2;
			
			resultfield.setText(" "+div);
		}
		
	}

}
