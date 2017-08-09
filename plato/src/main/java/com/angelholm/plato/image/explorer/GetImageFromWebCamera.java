package com.angelholm.plato.image.explorer;


import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;



import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GetImageFromWebCamera extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6353986489045948126L;
	private JPanel panel;

	
	public GetImageFromWebCamera(){
		
		initGUI();
		initEvents();
		
		getImage();
		
	}

	private void initEvents() {
		
	}

	private void initGUI() {
		
		panel = new JPanel();
		panel.setLayout( new BoxLayout(panel,  BoxLayout.X_AXIS));
		this.add(panel);	
	}
	
	
    private void getImage() {
      
    	/*Webcam webcam = Webcam.getDefault();
		webcam.open();
/*
		// get image
		BufferedImage image = webcam.getImage();

		// save image to PNG file
		try {
			ImageIO.write(image, "PNG", new File("test.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
    	
    	
		Webcam webcam = Webcam.getDefault();
		webcam.setViewSize(WebcamResolution.VGA.getSize());

		WebcamPanel panel = new WebcamPanel(webcam);
		panel.setFPSDisplayed(true);
		panel.setDisplayDebugInfo(true);
		panel.setImageSizeDisplayed(true);
		panel.setMirrored(true);

		JFrame window = new JFrame("Test webcam panel");
		window.add(panel);
		window.setResizable(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);
		
    }

    
    
	
}
