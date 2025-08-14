package com.example.demo.Controller.Mapper.Mapper.impl;

import org.springframework.stereotype.Component;

import com.example.demo.Controller.Dto.Request.LibroRequestDto;
import com.example.demo.Controller.DtoResponse.LibroResponseDto;
import com.example.demo.Controller.Mapper.LibroMapper;
import com.example.demo.model.LibroModel;
@Component
public class LibroMapperImpl implements LibroMapper{

	@Override
	public LibroModel dtoToModel(LibroRequestDto dto) {
		if(dto==null) 
			return null;
		LibroModel model=new LibroModel();
		model.setName(dto.getName());
		model.setAutor(dto.getAutor());
		model.setDisponible(dto.getDisponible());
		model.setFecha(dto.getFecha());
		return model;
	}

	@Override
	public LibroResponseDto modelToDto(LibroModel model) {
		if(model==null)
			return null;
		LibroResponseDto dto=new LibroResponseDto();
		dto.setID(model.getId());
		return dto;
	}

}
