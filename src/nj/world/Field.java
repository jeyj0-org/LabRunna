package nj.world;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import nj.obstacles.Obstacle;
import nj.obstacles.Player;
import nj.obstacles.Wall;

public class Field {

	private ArrayList<Obstacle> content;
	
	public Field() {
		this.content = new ArrayList<Obstacle>();
		content.add(new Wall());
		content.add(new Player());
	}
	
	public ArrayList<ImageIcon> getIcons() {
		ArrayList<ImageIcon> icons = new ArrayList<ImageIcon>();
		
		for (Obstacle o : content)
			icons.add(o.getIcon());
		
		return icons;
	}

	public ArrayList<Obstacle> getContent() {
		return content;
	}

	public void addContent(ArrayList<Obstacle> content) {
		this.content = content;
	}
	
}
