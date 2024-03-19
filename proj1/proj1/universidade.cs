// ./universidade.cs
public class Universidade
{
    public string Nome { get; set; }

    public string Localizacao { get; set; }

    public int AnoFundacao { get; set; }

    public List<Curso> Cursos = new List<Curso>(); //esta propriedade requer refatoração


    public string ExibirInformaçoes()
    {
        return "";
    }
    //metodo que recebe um curso e o adiciona a lista cursos
    public void AdicionarCurso(Curso curso)
    {
        this.Cursos.Add(curso);
    }

    //metodo que retorna a lista cursos
    public List<Curso> GetCursos()
    {
        return this.Cursos;
    }
}