package my.gui.view;

import javax.swing.JFrame;
import my.gui.controller.Controller;


public class Frame extends JFrame
{
	private Controller theController;
	
	public Frame(Controller theController)
	{
		super();
		this.theController = theController;
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(thePanel);
		this.setSize(800,800);
		this.setTitle("MyGUI");
		this.setResizable(true);
		this.setVisible(true);
	}

}
