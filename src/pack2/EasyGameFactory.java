package pack2;

public class EasyGameFactory extends AbstractGameFactory {

	@Override
	public Player createPlayer() {
		return new Kitty();

	}

	@Override
	public Obstacle createObstacle() {
		return new Puzzle();

	}
}
