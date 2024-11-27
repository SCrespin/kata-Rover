import java.util.ArrayList;

public class Grid {
	private int width;
	private int height;
	private ArrayList<Obstacle> obstacles;
	private ArrayList<Rover> rovers;
	
	public Grid(int width, int height) {
		this.width = width;
		this.height = height;
		obstacles = new ArrayList<Obstacle>();
		rovers = new ArrayList<Rover>();
	}

	public void addRover(Rover rover) {
		rovers.add(rover);
	}
	
	public void addObstacle(Obstacle obstacle) {
		obstacles.add(obstacle);
	}
	
	public void checkCollisions() {
		for (Rover rover : rovers) {
			for (Obstacle obstacle : obstacles) {
				if (rover.getX() == obstacle.getX() && rover.getY() == obstacle.getY()) {
					rover.moveBackward();
				}
			}
		}
	}
	
	
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
}
