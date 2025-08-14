package com.example.demo.Controller.Dto.Request;

import java.sql.Date;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

public class LibroRequestDto {
	@NotNull
	@NotEmpty
	@Size(max=50)
	private String name;
	@NotNull
	@NotEmpty
	@Size(max=50)
	private String autor;
	@NotNull
	@NotEmpty
	@Past
	private Date fecha;
	@NotNull
	@NotEmpty
	@Size(max=50)
	private String disponible;
	public LibroRequestDto() {}
	public LibroRequestDto(String name, String autor,Date fecha, String disponible ) {
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
}	

