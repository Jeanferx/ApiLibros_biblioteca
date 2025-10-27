package com.example.demo.Dao.Dao.impl;

import java.util.Optional;

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
	public LibroModel deleteLibro(int LibroID) {
		Optional<LibroEntity>e=libroRepository.findById(LibroID);
		LibroModel model=new LibroModel();
		if(e.isPresent()) {
			libroRepository.deleteById(LibroID);
		}
		return null;
	}

	@Override
	public LibroModel postLibro(LibroModel libro) {
		LibroEntity Entity=new LibroEntity();
		Entity.setAutor(libro.getAutor());
		Entity.setDisponible(libro.getDisponible());
		Entity.setFecha(libro.getFecha());
		Entity.setName(libro.getName());
		Entity=libroRepository.save(Entity);
		libro.setId(Entity.getId());
		return libro;
		
	}

	@Override
	public LibroModel putLibro(int libroID, LibroModel libro) {
		Optional<LibroEntity>e=libroRepository.findById(libroID);
		if(e.isPresent()) {
			LibroEntity Entity=e.get();
			Entity.setAutor(libro.getAutor());
			Entity.setDisponible(libro.getDisponible());
			Entity.setFecha(libro.getFecha());
			Entity.setName(libro.getName());
			libroRepository.save(Entity);
			Entity.setId(libroID);
			return libro;
		}
		return null;
	}

}
