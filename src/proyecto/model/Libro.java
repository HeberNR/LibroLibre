package proyecto.model;

public abstract class Libro implements Vendible {
  protected String ISBN;
  protected String titulo;
  protected int anioPublicado;
  protected float precio;

  public Libro(String ISBN, String titulo, int anioPublicado, float precio) {
    this.ISBN = ISBN;
    this.titulo = titulo;
    this.anioPublicado = anioPublicado;
    this.precio = precio;
  }

  public void Libro() {

  }

  public String getISBN() {
    return ISBN;
  }

  public void setISBN(String ISBN) {
    this.ISBN = ISBN;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public int getAnioPublicado() {
    return anioPublicado;
  }

  public void setAnioPublicado(int anioPublicado) {
    this.anioPublicado = anioPublicado;
  }

  public float getPrecio() {
    return precio;
  }

  public void setPrecio(float precio) {
    this.precio = precio;
  }

  public String getGenero() {
    return "";
  }
}
