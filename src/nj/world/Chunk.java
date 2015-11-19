package nj.world;

public class Chunk {

	private Field[][] fields;
	
	public Chunk() {
		this.setFields(new Field[16][16]);
	}
	
	public void generate() {
		// TODO
	}

	public Field[][] getFields() {
		return fields;
	}

	public void setFields(Field[][] fields) {
		this.fields = fields;
	}
	
}
