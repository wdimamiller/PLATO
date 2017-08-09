package com.angelholm.plato.observation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.angelholm.plato.image.explorer.GetImageFromWebCamera;

public class ObservationFrame extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1580269312650291350L;
	private JPanel panel;
	private JButton takePictureButton;
	
	public ObservationFrame(){
		
		initGUI();
		initEvents();
	}

	private void initEvents() {

		takePictureButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {

				GetImageFromWebCamera frame = new GetImageFromWebCamera();
				frame.setVisible(true);
				
			}
			});
		
	}

	private void initGUI() {
		
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		this.add(panel);
		
		takePictureButton = new JButton("Take picture");
		panel.add(takePictureButton);
		
	}
	
	
}
