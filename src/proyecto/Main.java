package proyecto;

import proyecto.exception.LibroNoDisponibleExcepcion;
import proyecto.model.*;

public class Main {
  public static void main(String[] args) {

    Libreria libreria = new Libreria();

    Libro novela = new Novela("AABB45TT", "Que culpa tiene Fatmagul?", 2013, 4000);
    Libro ciencia = new Ciencia("CCYY88PP", "Animal Chanel", 2024, 8500);
    Libro infantil = new Infantil("KK47DDFF", "La vida de Hector", 2025, 4500);

    libreria.agregarLibro(novela);
    libreria.agregarLibro(ciencia);
    libreria.agregarLibro(infantil);

    libreria.mostrarLibrosDisponibles();

    try {
      libreria.venderLibro("KK47DDFF");
      libreria.venderLibro("IIOO88RR");
    } catch (LibroNoDisponibleExcepcion l) {
      System.out.printf("ERROR: " + l.getMessage());
    }

    libreria.mostrarLibrosDisponibles();

  }
}