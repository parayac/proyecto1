/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author hp
 */
public class Libro {

  private Integer idLibro;

  private String Titulo;

  private String Autor;

  private Integer Estado;

  public void Libro() {
  }

  public void setIdLibro(Integer idLibro) {
      this.idLibro=idLibro;
  }

  public Integer getidLibro() {
  return this.idLibro;
  }

  public void setTitulo(String Titulo) {
      this.Titulo=Titulo;
  }

  public String getTitulo() {
  return this.Titulo;
  }

  public void setAutor(String Autor) {
      this.Autor=Autor;
  }

  public String getAutor() {
  return this.Autor;
  }

  public void setEstado(Integer Estado) {
      this.Estado=Estado;
  }

  public Integer getEstado() {
  return this.Estado;
  }

}
