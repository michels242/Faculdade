package modelo;

public class Triangulos extends absPropriedades
{
    public Triangulos(Double l1, Double l2, Double l3)
    {
        super(l1, l2, l3);
        this.Verificar();
    }

   
    private void Verificar()
    {
      this.setMensagem("");
      
      double x = this.getL1();
      double y = this.getL2();
      double z = this.getL3();
      
      if((x < y + z) && (y < x + z) && (z < x+y))
      {
        if(x == y && x == z)
        {
          this.setResposta("Triângulo Equilátero");
        }
        else if((x == y) || (x == z))
        {
          this.setResposta("Triângulo Isósceles");
        }
        else
        {
          this.setResposta("Triângulo Escaleno");
        }  
      }
      else
      {
         this.setResposta("Não é um Triângulo!"); 
      }
    }
}
