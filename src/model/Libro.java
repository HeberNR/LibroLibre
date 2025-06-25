package model;


public abstract class Libro {
  private String ISBN;
  private String titulo;
  private int anioPublicado;
  private float precio;

  public void Libro() {

  }

  public void Libro(String ISBN, String titulo, int anioPublicado, float precio) {
    this.ISBN = ISBN;
    this.titulo = titulo;
    this.anioPublicado = anioPublicado;
    this.precio = precio;
  }

  
}
