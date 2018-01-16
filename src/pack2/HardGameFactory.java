package pack2;

public class HardGameFactory extends AbstractGameFactory {

	@Override
	public Player createPlayer() {
		return new KungFuGuy();
	}

	@Override
	public Obstacle createObstacle() {
		return new NastyGuy();
	}

}
