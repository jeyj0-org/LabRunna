package jannis.pixlengine.world;

public class World {

	private Chunk[][] chunks;
	
	public World(int x, int y) {
		chunks = new Chunk[x][y];

		for (Chunk[] chunk_i : chunks) {
			for (Chunk chunk : chunk_i) {
				chunk = new Chunk();
			}
		}
	}
	
	public Chunk getChunk(int x, int y) {
		return chunks[x][y];
	}
	
}
