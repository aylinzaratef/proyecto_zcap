package cl.inacap.zCapModel.dto;

import java.time.LocalDate;

public class Juego {
		
	private String nombre;
	private String Descripcion;
	private boolean aptoNinios;
	private int precio;
	private LocalDate fechaLanzamiento;
	private Consola consola;
	
	
	
	public Consola getConsola() {
		return consola;
	}
	public void setConsola(Consola consola) {
		this.consola = consola;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public boolean isAptoNinios() {
		return aptoNinios;
	}
	public void setAptoNinios(boolean aptoNinios) {
		this.aptoNinios = aptoNinios;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public LocalDate getFechaLanzamiento() {
		return fechaLanzamiento;
	}
	public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}
}
