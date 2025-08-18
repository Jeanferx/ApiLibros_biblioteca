package com.example.demo.Service;

import com.example.demo.model.LibroModel;

public interface LibroService {
	
	LibroModel getLibro(int libroID);
	
	LibroModel postLibro(LibroModel libro);
	
	LibroModel putLibro(int libroID,LibroModel libro);
	
	LibroModel deleteLibro(int libroID);
}
