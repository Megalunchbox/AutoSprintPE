package megalunchbox;

import java.awt.AWTException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tasks  {

	
	public class startTaskSprint implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
	
			Autosprint starter = new Autosprint();
			
			
			try {
				starter.sprintActivation();
			} catch (AWTException e1) {
			
				e1.printStackTrace();
			}
		}
		
		
		
	}
	
	public class startTaskDeactivate {
		
		
		
		
	}
}
