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
		PixlEngine engine = new PixlEngine(1, 1, Constants.PROJECT_NAME, Constants.RESOURCE_PATH, Constants.CHUNK_SIZE);
	}

}
