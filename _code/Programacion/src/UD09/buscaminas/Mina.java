package UD09.buscaminas;

/**
 *
 * @author David Martínez (wwww.martinezpenya.es|www.ieseduardoprimo.es)
 */

import javafx.scene.control.Button;

public class Mina extends Button {
// Atributos
  private int estado;
  private boolean esMina;
  private int contador;
  private boolean casillaVisible;

  // Constructor
  Mina() { 
    setEstado(0);
    setEsMina(false);
    setContador(0);
    setCasillaVisible(false);
  }

  public int getEstado() {
    return estado;
  }

  public boolean isEsMina() {
    return esMina;
  }

  private void setEstado(int estado) {
    this.estado = estado;
  }

  void setEsMina(boolean esMina) {
    this.esMina = esMina;
  }

  public int getContador() {
    return contador;
  }

  void setContador(int contador) {
    this.contador = contador;
  }
  
  public boolean isCasillaVisible() {
    return casillaVisible;
  }

  public void setCasillaVisible(boolean minaVisible) {
    this.casillaVisible = minaVisible;
  }

  public void cambiarEstado() {
      setEstado((getEstado()+1)%2);
/*      switch (getEstado()) {
          case 0:
              setEstado(1);
              break;
          case 1:
              setEstado(2);
              break;
          default:
              setEstado(0);
              break;
      }*/
  }
}
