// See https://aka.ms/new-console-template for more information
Console.WriteLine("Hello, World!");
//instanciar uma universidade
Universidade UP = new Universidade();
UP.Nome = "Universidade Positivo";
UP.Localizacao  = "Praça Osório";
UP.AnoFundacao = 2016;

Console.WriteLine (UP.Nome);

//instanciar um curso
Curso ADS = new Curso();
ADS.Nome = "Analise e desenvolvimento de sistemas";
ADS.area = "computacao";
ADS.duracao = 2;

//adicionar o curso na universidade
UP.AdicionarCurso(ADS);

foreach(var Curso in UP.Cursos){
    Console.WriteLine(Curso.Nome);
}

