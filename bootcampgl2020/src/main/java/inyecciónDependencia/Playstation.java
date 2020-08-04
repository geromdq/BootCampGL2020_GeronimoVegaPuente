package inyecciónDependencia;

public class Playstation {
	
	Game videogame;
	
	public Playstation(Game game){
		videogame = game;
	}
	
	public void setGame(Game game) {
		videogame = game;
	}
	
	public void askMyGame() {
		if(videogame != null) {
			System.out.println("El videojuego que estoy corriendo es:" + videogame.title);
		}
		else {
			System.out.println("¡Estoy vacio!");
		}
		
	}

}
