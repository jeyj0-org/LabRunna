package nj.main;

import jannis.pixlengine.PixlEngine;

/**
 * @author Jannis and Nicolas
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// creates a new window
		PixlEngine engine = new PixlEngine(Constants.RESOURCE_PATH, Constants.PROJECT_NAME, Constants.CHUNK_SIZE);
	}

}
