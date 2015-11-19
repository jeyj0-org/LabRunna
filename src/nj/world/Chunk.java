package nj.world;

import nj.main.Constants;

public class Chunk {

	private Field[][] fields;
	
	public Chunk() {
		fields = new Field[Constants.CHUNK_SIZE][Constants.CHUNK_SIZE];
		
		for (Field[] field_i : fields) {
			for (Field field : field_i) {
				field = new Field();
			}
		}
	}

	public Field getField(int x, int y) {
		return fields[x][y];
	}

	public void setField(int x, int y, Field field) {
		fields[x][y] = field;
	}
	
}
