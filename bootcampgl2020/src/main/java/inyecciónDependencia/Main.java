package inyecciónDependencia;

public class Main {

	public static void main(String[] args) {
		
		Game re = new Game("Resident evil");
		Game br = new Game("Brawlhalla");

		Playstation pl = new Playstation(re);
		pl.askMyGame();
		pl.setGame(br);
		pl.askMyGame();
		pl.setGame(null);
		pl.askMyGame();

	}
}
