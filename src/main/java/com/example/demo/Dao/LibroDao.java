package com.example.demo.Dao;

import com.example.demo.model.LibroModel;

public interface LibroDao {
	
	LibroModel getLibro(int libroID);
	
	LibroModel postLibro(LibroModel libro);
	
	LibroModel putLibro(int libroID,LibroModel libro);
	
	LibroModel deleteLibro(int libroID);
	
}
