//Classe cliente
// Autor: Julia
// Finalidade implementa os dados do cliente

public class cliente
{
    public string nome { set; get; }
   public string cpf { set; get; }

   public int idade {set; get; }

   public void salvar()
    {
            //somente salvar de a idade for maiior ou igual a 18
        if (idade>=18){
            Console.WriteLine("Salvando..");
        }
        else
        {
            Console.WriteLine("Não rola...");
        }
        
    }
}