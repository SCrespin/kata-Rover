
public class Box {
	private Position position;
	private boolean hasObstacle;
	
	public Box(int x, int y, int width, int height) {
		this.position = new Position(x, y);
	}

	
	
	public Position getPosition() {
		return position;
	}

	public boolean isHasObstacle() {
		return hasObstacle;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public void setHasObstacle(boolean hasObstacle) {
		this.hasObstacle = hasObstacle;
	}
	
	
}
