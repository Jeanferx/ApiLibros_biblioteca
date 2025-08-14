package com.example.demo.Service;


import com.example.demo.model.LibroModel;

public interface LibroService {
	LibroModel getLibro(int libroID);
	LibroModel postLibro(int libroID);
	LibroModel putLibro(int libroID);
	LibroModel deleteLibro(int libroID);
}
