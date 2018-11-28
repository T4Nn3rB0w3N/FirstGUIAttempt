package my.gui.view;

import javax.swing.*;
import my.gui.controller.Controller;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel
{
	private Controller theController;
	private JButton theButton;
	private JLabel theLabel;
	private SpringLayout theLayout;
	
	public Panel(Controller theController)
	{
		super();
		this.theController = theController;
		
		theButton = new JButton("Click this");
		theLabel = new JLabel("there are words here");
		theLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(theLayout);
		this.add(theButton);
		this.add(theLabel);
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void changeColor()
	{
		
	}
	
	private void setupListeners()
	{
		theButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				changeColor();
			}
		});
	}

}
