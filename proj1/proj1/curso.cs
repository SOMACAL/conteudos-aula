// ./curso.cs

public class Curso{
    public string Nome { get; set; }

    public string Area { get; set; }
    public int Duracao { get; set; }
 
    public string Turmas { get; set; } //esta propriedade requer refatoração

    public string exibirInformaçoes()
    {
        return "";
    }

    public void adicionarTurma()
    {
        
    }
}