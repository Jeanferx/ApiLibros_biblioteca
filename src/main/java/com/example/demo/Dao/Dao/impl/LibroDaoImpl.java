package com.example.demo.Dao.Dao.impl;

import java.util.Optional;

import org.aspectj.apache.bcel.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.LibroDao;
import com.example.demo.Dao.Dao.Jpa.Entity.LibroEntity;
import com.example.demo.Dao.Dao.Jpa.Repository.LibroRepository;
import com.example.demo.model.LibroModel;
@Service
public class LibroDaoImpl implements LibroDao {
	@Autowired
	private LibroRepository libroRepository;
	@Override
	public LibroModel getLibro(int LibroID) {
		Optional<LibroEntity>e=libroRepository.findById(LibroID);
		LibroModel model=new LibroModel();
		if(e.isPresent()) {
			model.setAutor(e.get().getAutor());
			model.setDisponible(e.get().getDisponible());
			model.setFecha(e.get().getFecha());
			model.setName(e.get().getName());
			model.setId(e.get().getId());
		}
		else {
			String errorMsg = "The user with id %s was not found";
		}
		return model;
	}

	@Override
	public LibroModel postLibro(int LibroID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LibroModel putLibro(int LibroID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LibroModel deleteLibro(int LibroID) {
		// TODO Auto-generated method stub
		return null;
	}

}
