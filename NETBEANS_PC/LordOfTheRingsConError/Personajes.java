package LordOfTheRingsConError;
import java.util.Random;

public class Personajes {
	private int vitalidad, fisico, fuerza, resistencia, nivel ;
	private String nombre;
	private Random rand = new Random(System.nanoTime());
		
	// Ataques
	
	public int ataqueFisico(){
		int aleatorio = rand.nextInt(2);
		return nivel * fisico * aleatorio;
	}
	
	public int ataqueFuerza() {
		if (resistencia > 0 ) {
			resistencia--;
			return nivel * fuerza;
		}
		else {
			return 0;
		}	
	}
	
	public void danio(int vitalidad) {
		this.vitalidad -=vitalidad;
	}
	

}
