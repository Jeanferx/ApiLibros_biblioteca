package com.example.demo.Controller.Mapper;

import com.example.demo.Controller.Dto.Request.LibroRequestDto;
import com.example.demo.Controller.DtoResponse.LibroResponseDto;
import com.example.demo.model.LibroModel;

public interface LibroMapper {
	LibroModel dtoToModel (LibroRequestDto dto);
	LibroResponseDto modelToDto(LibroModel model);
}
