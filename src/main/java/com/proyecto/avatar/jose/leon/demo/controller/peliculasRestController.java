package com.proyecto.avatar.jose.leon.demo.controller;


import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.proyecto.avatar.jose.leon.demo.entity.Pelicula;
import com.proyecto.avatar.jose.leon.demo.service.PeliculaService;

@CrossOrigin(origins = {"http://localhost:8081"})
@RestController
@RequestMapping("/api")
public class peliculasRestController {
		
	@GetMapping("/peliculas")
	public List<Pelicula> getListaPeliculas() throws JsonMappingException, JsonProcessingException {
        String mStrPeliculas = PeliculaService.getServicePeliculas();
        
        List<Pelicula> listaPelicula = new ArrayList<>();
      
        JSONObject jsonObject = new JSONObject(mStrPeliculas);
        JSONArray jsonArray = jsonObject.getJSONArray("results");
        
        for (int i = 0; i < jsonArray.length(); i++) {
        	
        	Pelicula pelicula = new ObjectMapper().readValue(jsonObject.getJSONArray("results").get(i).toString(), Pelicula.class);
        	
        	listaPelicula.add(pelicula);
        }
        
        return listaPelicula;
    }
	
	@GetMapping("/actores")
	public List<Pelicula> getListaActores() throws JsonMappingException, JsonProcessingException {
        String mStrPeliculas = PeliculaService.getServicePeliculas();
        
        List<Pelicula> listaPelicula = new ArrayList<>();
      
        JSONObject jsonObject = new JSONObject(mStrPeliculas);
        JSONArray jsonArray = jsonObject.getJSONArray("results");
        
        for (int i = 0; i < jsonArray.length(); i++) {
        	
        	Pelicula pelicula = new ObjectMapper().readValue(jsonObject.getJSONArray("results").get(i).toString(), Pelicula.class);
        	
        	listaPelicula.add(pelicula);
        }
        
        return listaPelicula;
    }
	
	@GetMapping("/pelicula/actores")
	public List<Pelicula> getListaPeliculasActores() throws JsonMappingException, JsonProcessingException {
        String mStrPeliculas = PeliculaService.getServicePeliculas();
        
        List<Pelicula> listaPelicula = new ArrayList<>();
      
        JSONObject jsonObject = new JSONObject(mStrPeliculas);
        JSONArray jsonArray = jsonObject.getJSONArray("results");
        
        for (int i = 0; i < jsonArray.length(); i++) {
        	
        	Pelicula pelicula = new ObjectMapper().readValue(jsonObject.getJSONArray("results").get(i).toString(), Pelicula.class);
        	
        	listaPelicula.add(pelicula);
        }
        
        return listaPelicula;
    }
}
