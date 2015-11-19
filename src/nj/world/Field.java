package nj.world;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import nj.obstacles.Obstacle;
import nj.obstacles.Player;
import nj.obstacles.Wall;

public class Field {

	private ArrayList<Obstacle> obstacles;
	
	public Field() {
		obstacles = new ArrayList<Obstacle>();
		obstacles.add(new Wall());
		obstacles.add(new Player());
	}
	
	public ArrayList<ImageIcon> getIcons() {
		ArrayList<ImageIcon> icons = new ArrayList<ImageIcon>();
		
		for (Obstacle o : obstacles)
			icons.add(o.getIcon());
		
		return icons;
	}

	public ArrayList<Obstacle> getContent() {
		return obstacles;
	}

	public void addObstacle(ArrayList<Obstacle> obstacle) {
		obstacles = obstacle;
	}

	public void removeObstacle(ArrayList<Obstacle> obstacle) {
		obstacles.remove(obstacle);
	}
	
}
