package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.luca.logic.BibliotecaManager;
import org.luca.pojos.Biblioteca;

public class RestController {
	
	public void metodo1() {
		

		List<String> libri = new ArrayList<String>();
		libri.add("Pnl per il carisma");
		libri.add("Amore libero");
		libri.add("Cinciallegre");
		libri.add("Natura e civiltà");
		
		System.out.println(libri);
		
		Biblioteca b = new Biblioteca();
		BibliotecaManager bm = new BibliotecaManager();
		bm.ordinaAscendente(libri);
		
		System.out.println(libri);
		
	}

}
