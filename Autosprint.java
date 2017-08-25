package megalunchbox;
import java.awt.*;
import java.awt.event.KeyEvent;

import javax.swing.*;


public class Autosprint {


public static void main(String []args) {
	
	ASGuiFrame();
	
}
public void sprintActivation () throws AWTException{
	Robot Sprinter = new Robot();
	Sprinter.keyPress(KeyEvent.VK_CONTROL);
}
public void sprintDeactivation() throws AWTException {
	
	Robot Stopper = new Robot();
	Stopper.keyRelease(KeyEvent.VK_CONTROL);
	
}

@SuppressWarnings("unused")
public static void ASGuiFrame()  {
	
	
	Frame guiFrame = new JFrame("AutoSprint");
	JPanel guiPanel1 = new JPanel();
	JButton startButton = new JButton("start");
	JButton stopButton = new JButton("stop");

	
	((JFrame) guiFrame).setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	guiFrame.setVisible(true);
	guiFrame.setSize(300,75);
	guiFrame.add(guiPanel1);
	guiPanel1.add(startButton);
	guiPanel1.add(stopButton);
	//startButton.setSize(100,100);
	

	startButton
	
	
	
	
	// going to do something with the look and feel of the gui later
	JFrame.setDefaultLookAndFeelDecorated(true);
	
	
	
	
	
}

}
