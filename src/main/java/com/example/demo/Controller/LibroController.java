package com.example.demo.Controller;

import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Controller.DtoResponse.LibroResponseDto;
import com.example.demo.Service.LibroService;
import com.example.demo.model.LibroModel;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/Libro")
public class LibroController {
	@Autowired
	public LibroService libroService;
	@Autowired
	public Mapper mapper;
	
	@GetMapping("/{libroID}")
	public LibroModel getLibro(@PathVariable ("libroID")int libroID) {
		return libroService.getLibro(libroID);
	}
	@PostMapping
	public LibroResponseDto postLibro(@RequestBody @Valid int libroID) {
		return null;//Temporal
		
	}
	@PutMapping("/{libroID}")
	public LibroModel putLibro(@RequestBody @PathVariable("libroID") int libroID) {
		return libroService.putLibro(libroID);
		
	}
	@DeleteMapping("/{libroID}")
	public LibroModel deleteLibro(@PathVariable("libroID") int libroID) {
		return libroService.deleteLibro(libroID);
		
	}
	
	
}
