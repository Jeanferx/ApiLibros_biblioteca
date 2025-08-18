package com.example.demo.Service.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Dao.LibroDao;
import com.example.demo.Service.LibroService;
import com.example.demo.model.LibroModel;
@Service
public class LibroServiceimpl implements LibroService{

	@Autowired 
	private LibroDao libroDao;
	public LibroServiceimpl(LibroDao libroDao) {
		super();
		this.libroDao = libroDao;
	}
	@Override
	@Transactional
	public LibroModel getLibro(int libroID) {
		LibroModel model=new LibroModel();
		return libroDao.getLibro(libroID);
	}

	@Override
	@Transactional
	public LibroModel postLibro(LibroModel libro) {
		LibroModel model=new LibroModel();
		return libroDao.postLibro(libro);
	}

	@Override
	@Transactional
	public LibroModel putLibro(int libroID,LibroModel libro) {
		LibroModel model=new LibroModel();
		return libroDao.putLibro(libroID, libro);
	}

	@Override
	@Transactional
	public LibroModel deleteLibro(int libroID) {
		LibroModel model=new LibroModel();
		return libroDao.deleteLibro(libroID);
	}

}
