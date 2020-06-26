package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Calculator implements ActionListener {

	//Calculator components listed in private
private JFrame frame;
private JTextArea screen;

private JButton button0;
private JButton button1;
private JButton button2;
private JButton button3;
private JButton button4;
private JButton button5;
private JButton button6;
private JButton button7;
private JButton button8;
private JButton button9;

private JButton divide;
private JButton add;
private JButton subtract;
private JButton multiply;
private JButton clear;
private JButton equal;

private String number1_string="";
private String number2_string="";
private String[] equation;
private double number1=0;
private double number2=0;
private String finalvalue_string="";
private double finalvalue=0;


public Calculator()
{
	// calculator components defined 




button0 = new JButton("0");
button1 = new JButton("1");
button2 = new JButton("2");
button3 = new JButton("3");
button4 = new JButton("4");
button5 = new JButton("5");
button6 = new JButton("6");
button7 = new JButton("7");
button8 = new JButton("8");
button9 = new JButton("9");
clear = new JButton("C");
equal = new JButton("=");

button0.addActionListener(this);
button1.addActionListener(this);
button2.addActionListener(this);
button3.addActionListener(this);
button4.addActionListener(this);
button5.addActionListener(this);
button6.addActionListener(this);
button7.addActionListener(this);
button8.addActionListener(this);
button9.addActionListener(this);
clear.addActionListener(this);
equal.addActionListener(this);

button0.setSize(100, 50);
button0.setLocation(140, 450);
button1.setSize(100, 50);
button1.setLocation(250, 390);
button2.setSize(100, 50);
button2.setLocation(140, 390);
button3.setSize(100, 50);
button3.setLocation(30, 390);
button4.setSize(100, 50);
button4.setLocation(30, 320);
button5.setSize(100, 50);
button5.setLocation(140, 320);
button6.setSize(100, 50);
button6.setLocation(250, 320);
button7.setSize(100, 50);
button7.setLocation(30, 250);
button8.setSize(100, 50);
button8.setLocation(140, 250);
button9.setSize(100, 50);
button9.setLocation(250, 250);

divide = new JButton("÷");
add = new JButton("+");
subtract = new JButton("-");
multiply = new JButton("x");

divide.addActionListener(this);
add.addActionListener(this);
subtract.addActionListener(this);
multiply.addActionListener(this);

clear.setSize(100, 50);
clear.setLocation(30, 450);
equal.setSize(100, 50);
equal.setLocation(250, 450);

divide.setSize(50, 50);
divide.setLocation(300, 190);
multiply.setSize(50, 50);
multiply.setLocation(240, 190);
subtract.setSize(50, 50);
subtract.setLocation(180, 190);
add.setSize(50, 50);
add.setLocation(120, 190);

frame = new JFrame("Simple Calculator");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
frame.setSize(400,560);
frame.setResizable(false);
frame.setLayout(null);


screen = new JTextArea();
screen.setSize(380, 150);
screen.setLocation(7, 5);
screen.setEditable(false);

frame.add(screen);

frame.add(button0);
frame.add(button1);
frame.add(button2);
frame.add(button3);
frame.add(button4);
frame.add(button5);
frame.add(button6);
frame.add(button7);
frame.add(button8);
frame.add(button9); 

frame.add(divide);
frame.add(add);
frame.add(subtract);
frame.add(multiply); 
frame.add(clear);
frame.add(equal);
}
  
@Override
public void actionPerformed(ActionEvent e)
{
	if(e.getSource() == button0)
	{
		screen.append("0");
	}
	
	if(e.getSource() == button1)
	{
		screen.append("1");
	}
	
	if(e.getSource() == button2)
	{
		screen.append("2");
	}
	
	if(e.getSource() == button3)
	{
		screen.append("3");
	}
	
	if(e.getSource() == button4)
	{
		screen.append("4");
	}
	
	if(e.getSource() == button5)
	{
		screen.append("5");
	}
	
	if(e.getSource() == button6)
	{
		screen.append("6");
	}
	
	if(e.getSource() == button7)
	{
		screen.append("7");
	}
	
	if(e.getSource() == button8)
	{
		screen.append("8");
	}
	
	if(e.getSource() == button9)
	{
		screen.append("9");
	}
	
	if(e.getSource() == clear)
	{
		screen.setText(null);
	}
		
	if(e.getSource() == add)
	{
		screen.append("+");
	}
	
	if(e.getSource() == subtract)
	{
		screen.append("-");
	}
	
	if(e.getSource() == multiply)
	{
		screen.append("*");
	}
	
	if(e.getSource() == divide)
	{
		screen.append("÷");
	}
	
	if(e.getSource() == equal)
	{
				
		if(screen.getText().contains("+"))
		{
			equation= screen.getText().split("\\+");
			number1_string= equation[0];
			number2_string= equation[1];
			
			number1= Double.parseDouble(number1_string);
			number2= Double.parseDouble(number2_string);
			
			finalvalue= number1+number2;
			finalvalue_string= Double.toString(finalvalue);
			
			screen.setText(finalvalue_string);
				
		}
		
		if(screen.getText().contains("-"))
		{
			equation= screen.getText().split("\\-");
			number1_string= equation[0];
			number2_string= equation[1];
			
			number1= Double.parseDouble(number1_string);
			number2= Double.parseDouble(number2_string);
			
			finalvalue= number1-number2;
			finalvalue_string= Double.toString(finalvalue);
			
			screen.setText(finalvalue_string);
				
		}
		
		if(screen.getText().contains("*"))
		{
			equation= screen.getText().split("\\*");
			number1_string= equation[0];
			number2_string= equation[1];
			
			number1= Double.parseDouble(number1_string);
			number2= Double.parseDouble(number2_string);
			
			finalvalue= number1 * number2;
			finalvalue_string= Double.toString(finalvalue);
			
			screen.setText(finalvalue_string);
				
		}	
		
		if(screen.getText().contains("÷"))
		{
			equation= screen.getText().split("\\÷");
			number1_string= equation[0];
			number2_string= equation[1];
			
			number1= Double.parseDouble(number1_string);
			number2= Double.parseDouble(number2_string);
			
			finalvalue= number1/number2;
			finalvalue_string= Double.toString(finalvalue);
			
			screen.setText(finalvalue_string);
				
		}		
	}
}

public static void main(String[] args)
{
new Calculator();
}
}
