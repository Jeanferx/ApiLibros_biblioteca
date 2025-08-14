package com.example.demo.model;

import java.sql.Date;


public class LibroModel {
	private int id;
	private String name;
	private String autor;
	private Date fecha;
	private String disponible;
	public LibroModel() {}
	public LibroModel(int id,String name, String autor,Date fecha, String disponible ) {
		this.id=id;
		this.name=name;
		this.autor=autor;
		this.disponible=disponible;
		this.fecha=fecha;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor=autor;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha=fecha;
	}
	public String getDisponible() {
		return disponible;
	}
	public void setDisponible(String disponible) {
		this.disponible=disponible;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
