package com.example.demo.Dao;

import com.example.demo.model.LibroModel;

public interface LibroDao {
	LibroModel getLibro(int LibroID);
	LibroModel postLibro(int LibroID);
	LibroModel putLibro(int LibroID);
	LibroModel deleteLibro(int LibroID);
}
