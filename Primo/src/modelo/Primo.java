package modelo;

public class Primo extends absPropriedades
{

    public Primo(int num)
    {
        super(num);
        this.verificarPrimo();
    }
    
    private void verificarPrimo()
    {
        this.setMensagem("É primo");
        for (int i = 2; i < this.getNum() / 2 + 1; i++)
        {
            if (this.getNum() % i == 0)
            {
                this.setMensagem("Não é primo");
                break;
            }
        }
    }
}
