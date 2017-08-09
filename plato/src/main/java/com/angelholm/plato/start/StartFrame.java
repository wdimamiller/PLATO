package com.angelholm.plato.start;


import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.angelholm.plato.observation.ObservationFrame;


public class StartFrame extends JFrame{
	
	
	private static final long serialVersionUID = -2308776473975305564L;
	
	private JPanel panel;
	private JTextField firstNameField;
	private JTextField middleNameField;
	private JTextField lastNameField;
	
	private JButton startObservationButton;
	
	public StartFrame(){
		initGUI();
		initEvents();
	}
	
	public void initGUI(){
		
		
		this.setBounds(100, 100, 700, 500);
		
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		this.add(panel);
		
		startObservationButton = new JButton("Start Observation");
		startObservationButton.setPreferredSize(new Dimension(150,40));
		startObservationButton.setMaximumSize(new Dimension(150,40));
		startObservationButton.setMinimumSize(new Dimension(150,40));
		panel.add(startObservationButton);
		
		firstNameField = new JTextField();
		middleNameField = new JTextField();
		lastNameField = new JTextField();
		
		panel.add(firstNameField);
		panel.add(middleNameField);
		panel.add(lastNameField);
		
	}
	
	public void initEvents(){
		startObservationButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {

				ObservationFrame frame = new ObservationFrame();
				frame.setVisible(true);
	
			}
			});
	}
}
