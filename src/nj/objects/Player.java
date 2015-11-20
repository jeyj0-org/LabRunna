package nj.objects;

import jannis.pixlengine.objects.Object;

import javax.swing.ImageIcon;

import nj.main.Constants;

public class Player extends Object {

	@Override
	public ImageIcon getIcon() {
		return new ImageIcon(Constants.PICTURE_PATH + "player.png");
	}
	
	public void move() {
		
	}

}
