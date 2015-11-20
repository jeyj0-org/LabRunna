package jannis.pixlengine.objects;

import javax.swing.ImageIcon;

import nj.main.Constants;

public class Wall extends Object {

	@Override
	public ImageIcon getIcon() {
		return new ImageIcon(Constants.PICTURE_PATH + "wall.png");
	}

}
