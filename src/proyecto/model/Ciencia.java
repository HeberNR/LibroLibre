package proyecto.model;

public class Ciencia extends Libro implements Vendible {

  public Ciencia(String ISBN, String titulo, int anioPublicado, float precio) {
    super(ISBN, titulo, anioPublicado, precio);
  }

  @Override
  public String getGenero() {
    return "Ciencia";
  }

  @Override
  public float calcularPrecioFinal() {
    return (anioPublicado == 2024) ? precio * 0.89f : precio;
  }
}
