package pack2;

public class Client {
	AbstractGameFactory easyFactory = new EasyGameFactory();
	Player player = easyFactory.createPlayer();
	Obstacle obstacle = easyFactory.createObstacle();

}
