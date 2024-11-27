import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class RoverTest {

    @Test
    void canMoveForwardToTheNorth() {
        Rover rover = new Rover();
        rover.moveForward();
        assertEquals(rover.getY(),1);
    }
    
    @Test
	void canTurnToTheEast() {
		Rover rover = new Rover();
		rover.turnRight();
		assertEquals(rover.getDirection(), "East");
	}
    
	@Test
	void canMoveToTheWest() {
		Rover rover = new Rover(new Position(10, 10));
		rover.turnLeft();
		assertEquals(rover.getDirection(), "West");
		rover.moveForward();
		assertEquals(9,rover.getX());
	}
	
	@Test
	void movesBackIfHitObstacle() {
		Rover rover = new Rover(new Position(10, 10));
		Obstacle wheel = new Obstacle(new Position(10, 11));
		Grid grid = new Grid(20, 20);
		grid.addObstacle(wheel);
		grid.addRover(rover);
		rover.moveForward();
		grid.checkCollisions();
		assertEquals(10,rover.getX());
	}
    
    
}
