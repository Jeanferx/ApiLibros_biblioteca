package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Controller.Dto.Request.LibroRequestDto;
import com.example.demo.Controller.DtoResponse.LibroResponseDto;
import com.example.demo.Controller.Mapper.LibroMapper;
import com.example.demo.Service.LibroService;
import com.example.demo.model.LibroModel;
import com.example.demo.model.UserModel;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/Libro")
public class LibroController {
	@Autowired
	public LibroService libroService;
	@Autowired
	public LibroMapper mapper;
	
	@GetMapping("/{libroID}")
	public LibroModel getLibro(@PathVariable ("libroID")int libroID) {
		return libroService.getLibro(libroID);
	}
	@PostMapping
	public LibroResponseDto postLibro(@Valid @RequestBody LibroRequestDto libro) {
		LibroModel model= libroService.postLibro(mapper.dtoToModel(libro));
		return mapper.modelToDto(model);
		
	}
	@PutMapping("/{libroID}")
	public LibroModel putLibro(@PathVariable("libroID") int libroID,@RequestBody LibroModel libro) {
		return libroService.putLibro(libroID,libro);
		
	}
	@DeleteMapping("/{libroID}")
	public LibroModel deleteLibro(@PathVariable("libroID") int libroID) {
		return libroService.deleteLibro(libroID);
		
	}
	
	
}
