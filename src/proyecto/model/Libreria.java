package proyecto.model;

import proyecto.exception.LibroNoDisponibleExcepcion;

import java.util.ArrayList;

public class Libreria {
  protected ArrayList<Libro> libros = new ArrayList<>();
  protected float ganancias;
  protected int cantidadDeVentas;

  public void Libreria() {
    this.libros = new ArrayList<>();
    this.ganancias = 0;
    this.cantidadDeVentas = 0;
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
    if (libros.size() >= 1000) {
      System.out.println("Supero el limite maximo del inventario");
    } else {
      libros.add(l);
    }

  }

  public void venderLibro(String ISBN) throws LibroNoDisponibleExcepcion {
    Libro encontrada = null;

    for (Libro l : libros) {
      if (l.getISBN().equals(ISBN)) {
        encontrada = l;
        break;
      }
    }

    if (encontrada != null) {
      libros.remove(encontrada);
      cantidadDeVentas++;
      ganancias += encontrada.calcularPrecioFinal();
      System.out.println("Bicicleta vendida: " + encontrada);
    } else {
      throw new LibroNoDisponibleExcepcion("No se encontro un libro con ISBN " + ISBN);
    }

  }

  public void mostrarLibrosDisponibles() {

    if (libros.isEmpty()) {
      System.out.println("El inventario esta vacio.");
      return;
    }

    System.out.println("Biblioteca:");
    for (Libro l : libros) {
      System.out.println(l);
    }

  }
}
