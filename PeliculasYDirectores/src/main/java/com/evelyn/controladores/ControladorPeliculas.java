package com.evelyn.controladores;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorPeliculas {

	private static HashMap<String, String> listaPeliculas = new HashMap<String, String>();

	public ControladorPeliculas() {
		listaPeliculas.put("Winnie the Pooh", "Don Hall");
		listaPeliculas.put("El zorro y el sabueso", "Ted Berman");
		listaPeliculas.put("Tarzán", "Kevin Lima");
		listaPeliculas.put("Mulán", "Barry Cook");
		listaPeliculas.put("Oliver", "Kevin Lima");
		listaPeliculas.put("Big Hero 6", "Don Hall");
	}

	@GetMapping("/peliculas")
	public String obtenerTodasLasPeliculas() {
		String resultado = "Lista de películas disponibles:<br>";
		for (String nombre : listaPeliculas.keySet()) {
			resultado = resultado + "- " + nombre + "<br>";
		}
		return resultado;
	}

	@GetMapping("/peliculas/{nombre}")
	public String obtenerPeliculaPorNombre(@PathVariable String nombre) {
		if (listaPeliculas.containsKey(nombre)) {
			String director = listaPeliculas.get(nombre);
			return "Película: " + nombre + "<br>Director: " + director;
		} else {
			return "La película no se encuentra en nuestra lista.";
		}
	}

	@GetMapping("/peliculas/director/{nombre}")
	public String obtenerPeliculasPorDirector(@PathVariable String nombre) {
		String resultado = "Películas dirigidas por " + nombre + ":<br>";
		boolean encontrado = false;
		for (String pelicula : listaPeliculas.keySet()) {
			if (listaPeliculas.get(pelicula).equals(nombre)) {
				resultado = resultado + "- " + pelicula + "<br>";
				encontrado = true;
			}
		}
		if (encontrado) {
			return resultado;
		} else {
			return "No contamos con películas con ese director en nuestra lista.";
		}
	}

}