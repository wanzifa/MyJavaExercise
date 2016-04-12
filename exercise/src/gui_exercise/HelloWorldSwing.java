package gui_exercise;
import javax.swing.*;
import java.awt.*;

public class HelloWorldSwing {
	private static void createAndShowGUI(){
		JFrame frame = new JFrame("HelloWorld");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Pane's layout
		Container cp = frame.getContentPane();
		cp.setLayout(new FlowLayout());
		
		// Create button
		JButton B1 = new JButton("click me");
		JButton B2 = new JButton("shit");
		
		// add buttons
		cp.add(B1);
		cp.add(B2);
		
		//show the window
		frame.pack();
		frame.setVisible(true);
		
	}
	public static void main(String[] args){
		Runnable tr = new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		};
		javax.swing.SwingUtilities.invokeLater(tr);
	}
}


