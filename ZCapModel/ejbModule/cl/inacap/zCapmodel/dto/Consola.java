package cl.inacap.zCapmodel.dto;

import java.util.List;

public class Consola {

	private String nombre;
	private String marca;
	private int aniolanzamiento;
	private List<Juego> juegos;
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAniolanzamiento() {
		return aniolanzamiento;
	}
	public void setAniolanzamiento(int aniolanzamiento) {
		this.aniolanzamiento = aniolanzamiento;
	}
	public List<Juego> getJuegos() {
		return juegos;
	}
	public void setJuegos(List<Juego> juegos) {
		this.juegos = juegos;
	}
	
	
}
