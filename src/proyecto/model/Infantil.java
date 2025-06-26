package proyecto.model;

public class Infantil extends Libro implements Vendible {

  public Infantil(String ISBN, String titulo, int anioPublicado, float precio) {
    super(ISBN, titulo, anioPublicado, precio);
  }

  @Override
  public String getGenero() {
    return "Infantil";
  }

  @Override
  public float calcularPrecioFinal() {
    return (anioPublicado == 2024) ? precio * 0.75f : precio;
  }
}
