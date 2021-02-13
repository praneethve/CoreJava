package c68;

import javax.swing.*;
import java.awt.*;
class Example3 extends JFrame
{
    JButton button;
    public Example3 ()
    {
	setTitle("Button Action Example using Lambda Expression");
	setSize(400,300);
	setVisible(true);
	setLayout(new FlowLayout());
	setDefaultCloseOperation(EXIT_ON_CLOSE);

	button = new JButton("Button");
	button.setBounds(100,100,90,40);
	button.addActionListener(e-> 
	   System.out.println("You clicked the button.")); 
	
	add(button);
    }
    public static void main(String args[])
    {
	new Example3 ();
    }   
}
