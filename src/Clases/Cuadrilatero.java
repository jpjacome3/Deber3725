
package Clases;

/**
 *
 * @author JEAN_PIERRE
 */
public class Cuadrilatero {
  int altura;
  int base;
  int area;
  int perimetro;
  
  public int Area(){
      area = altura * base;
      return area;
  }
  
  public int Perimetro(){
      perimetro = 2 * (altura + base);
      return perimetro;
  }
  

}
