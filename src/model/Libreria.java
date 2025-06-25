package model;

import java.util.ArrayList;

public class Libreria {
  protected ArrayList<Libro> libros;
  protected float ganancias;
  protected int cantidadDeVentas;

  public void Libreria() {

  }

  public void Libreria(ArrayList<Libro> libros, float ganancias, int cantidadDeVentas) {
    this.libros = new ArrayList<>();
    this.ganancias = ganancias;
    this.cantidadDeVentas = cantidadDeVentas;
  }

  public ArrayList<Libro> getLibros() {
    return libros;
  }

  public void setLibros(ArrayList<Libro> libros) {
    this.libros = libros;
  }

  public float getGanancias() {
    return ganancias;
  }

  public void setGanancias(float ganancias) {
    this.ganancias = ganancias;
  }

  public int getCantidadDeVentas() {
    return cantidadDeVentas;
  }

  public void setCantidadDeVentas(int cantidadDeVentas) {
    this.cantidadDeVentas = cantidadDeVentas;
  }

  public void agregarLibro(Libro l) {

  }

  public void venderLibro(String ISBN) {

  }

  public void mostrarLibrosDisponibles() {

  }
}
