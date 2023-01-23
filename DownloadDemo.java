//package com.calculator.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class DownloadDemo implements ItemListener{

	static JFrame f;
	
	JInternalFrame inf;
	
	JCheckBox jcb1, jcb2;
	
	JLabel heading;
	
	JProgressBar jb1, jb2;
	
	int i = 0, num = 0;
	
	
	@SuppressWarnings("static-access")
	DownloadDemo(){
		
		
		heading = new JLabel("Item Listener Demo");
		heading.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 25));
		heading.setSize(300,40);
	
		
		jcb1 = new JCheckBox("Download");
		jcb1.setBounds(50, 30, 150, 50);
		jcb1.addItemListener(this);
		
		
		jcb2 = new JCheckBox("Return status null(0)");
		jcb2.setBounds(50, 70, 250, 50);
		jcb2.addItemListener(this);
		
		
		jb1 = new JProgressBar(0,1000);
		jb1.setBounds(50, 150, 250, 30);
		jb1.setValue(0);
		jb1.setStringPainted(true);
		jb1.setForeground(Color.BLUE);
		jb1.setBackground(Color.black);
		
		
		
		jb2 = new JProgressBar(0,1000);
		jb2.setBounds(50, 250, 250, 30);
		jb2.setValue(1000);
		jb2.setStringPainted(true);
		jb2.setForeground(Color.blue);
		jb2.setBackground(Color.black);
		
		
		// Supportive Internal Frame
		inf = new JInternalFrame("Demo");
		inf.setVisible(true);
		inf.setLayout(null);
		
		
		// Base Frame
		f = new JFrame();
		f.setVisible(true);
		f.setSize(400,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		// Cast widgets to supportive inner frame
		inf.add(heading);
		inf.add(jcb1);
		inf.add(jcb2);
		inf.add(jb1);
		inf.add(jb2);
		
		
		// Add Internal Frame to External Main Frame
		f.add(inf);
	}
	

	public static void main(String[] args) {
		
		DownloadDemo d = new DownloadDemo();
		
		// TODO Auto-generated method stub

	}



	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==jcb1) {
			
			
			int i = 0;
			
			
			while(i<=1000) {
				
				jb1.setValue(i);
				
				i += 20;
				
				try {
					
					Thread.sleep(10);
					
				
				
				}catch(Exception ae) {
					
					
					System.out.println(ae);
					
				}
			
				
			
			}
			
			
		
		
		}
		else if(e.getSource()==jcb2) {
			
			int i = 1000;
			
			
			
			while(i>=0) {
				
				jb2.setValue(i);
				
				i -= 20;
				
				
				
				try {Thread.sleep(10);}catch(Exception ae) {System.out.println(ae);}
			}
			
			
			
			
			
			
		}

		
		
	}
	
}
	
