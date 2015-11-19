package nj.layout;

import javax.swing.JFrame;

import nj.main.Constants;

/**
 * @author Jannis and Nicolas
 */
public class MainFrame extends JFrame {
	
	/**
	 * General constructor
	 */
	public MainFrame() {
		super();
		
		// ends java program on window close event
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// sets the frame's title
		this.setTitle(Constants.PROJECT_NAME);

		// set bounds
		this.setBounds(100, 100, 800, 450);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setResizable(false);
		
		// make most important windows eva
		this.setAlwaysOnTop(true);
		
		// show the frame
		this.setVisible(true);
	}

}
