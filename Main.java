package cs602A2;

import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Main extends JFrame implements ActionListener{
	JRadioButton plus;
	JRadioButton minus;
	JRadioButton div;
	JRadioButton times;
	JTextField textField1,textField2,textField3;
	public static void main(String[] args){
		new Main().display();
	}
	
	private void display(){
		setSize(new Dimension(400, 300));
		Container c = getContentPane();
		c.setLayout(null);
		c.setBackground(Color.lightGray);
		JLabel equal = new JLabel("=");
		equal.setBounds(225, 100, 50, 21);
		textField1 = new JTextField();
		textField1.setBounds(25, 100, 50, 21);
		textField2 = new JTextField();
		textField2.setBounds(150, 100, 50, 21);
		textField3 = new JTextField();
		textField3.setBounds(250, 100, 50, 21);
		
		plus= new JRadioButton("+");
		plus.setBounds(90, 50, 50, 30);
		minus= new JRadioButton("-");
		minus.setBounds(90, 75, 50, 30);
		div= new JRadioButton("/");
		div.setBounds(90, 100, 50, 30);
		times= new JRadioButton("*");
		times.setBounds(90, 125, 50, 30);
		
		ButtonGroup group = new ButtonGroup();
		group.add(plus);
		group.add(minus);
		group.add(div);
		group.add(times);
		
		c.add(equal);
		c.add(plus);
		c.add(minus);
		c.add(div);
		c.add(times);
		c.add(textField1);
		c.add(textField2);
		c.add(textField3);
		setVisible(true);
		
		plus.addActionListener(this);
		minus.addActionListener(this);
		div.addActionListener(this);
		times.addActionListener(this);
	}
	public void actionPerformed(ActionEvent evt) {
		try {
		int input1 = Integer.parseInt(textField1.getText());
		int input2 = Integer.parseInt(textField2.getText());
		if(plus.isSelected()) {
			textField3.setText(Integer.toString(input1+input2));
		}
		if(minus.isSelected()) {
			textField3.setText(Integer.toString(input1-input2));
		}
		if(div.isSelected()) {
			if(input2 == 0) {
				JOptionPane.showMessageDialog(null, "can not divided by zero");
			}
			double n = ((double)input1)/input2;
			textField3.setText(Double.toString(n));
		}
		if(times.isSelected()) {
			textField3.setText(Integer.toString(input1*input2));
		}
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "input value invalid");
		}
			

		
	}

	private double toDouble(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
}

