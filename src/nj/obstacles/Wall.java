package nj.obstacles;

import javax.swing.ImageIcon;

import nj.main.Constants;

public class Wall extends Obstacle {

	@Override
	public ImageIcon getIcon() {
		return new ImageIcon(Constants.PICTURE_PATH + "wall.png");
	}

}
