
package LogicaNegocio;


public class RaizCuadrada {
    
     double numero;
     double calcular = 0;
       
       

   public void getNumero(double numero){
    this.numero = numero;
  }


  public double getCalcular(){
   calcular = Math.sqrt(numero);
        return calcular;
  }
  
}