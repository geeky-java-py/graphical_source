//package com.calculator.demo;

import java.awt.Color;


import javax.swing.*;


public class ProgressBar{

	JProgressBar jb;
    
	JFrame f;
	
	// default value 0
	int i = 0,  num = 0;
	
	ProgressBar(){
		
		f = new JFrame();
			
		jb = new JProgressBar(0,2000);
		
		jb.setBounds(40, 40, 100, 10);
		
		jb.setValue(0);
		
		jb.setStringPainted(true);
		
		jb.setForeground(Color.red);
		jb.setBackground(Color.black);
		
		
		f.add(jb);
		
		f.setTitle("Loading..");
		f.setSize(400,70);
		f.setVisible(true);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setResizable(false);
		
		
	}
	public void iterate() {
		
			
		while(i<=2000) {
			
			jb.setValue(i);
			
			i = i + 20;
			
			
			
			try {Thread.sleep(170);}catch(Exception e) {System.out.println(e);}
		}
	
	
	
	}
	public void setInvisible() {
		
		jb.setVisible(false);
		f.setVisible(false);
		
	}
	
}



