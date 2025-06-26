package proyecto.model;

public class Novela extends Libro implements Vendible {

  public Novela(String ISBN, String titulo, int anioPublicado, float precio) {
    super(ISBN, titulo, anioPublicado, precio);
  }

  public String getGenero() {
    return "Novela";
  }

  @Override
  public float calcularPrecioFinal() {
    return (anioPublicado == 2024) ? precio * 0.85f : precio;
  }
}
