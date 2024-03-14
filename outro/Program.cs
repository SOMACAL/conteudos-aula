// See https://aka.ms/new-console-template for more information
cliente objCliente = new cliente();
cliente objCliente2 = new cliente();

objCliente.nome = "Pedro de Lara";
objCliente.cpf = "777";
objCliente.idade = 21;

objCliente2.nome = "laura";
objCliente2.cpf = "159";
objCliente2.idade = 12;

Console.WriteLine(objCliente.nome);
Console.WriteLine(objCliente.cpf);
Console.WriteLine(objCliente2.nome);
Console.WriteLine(objCliente2.idade);



objCliente.salvar();
objCliente2.salvar();
//Console.WriteLine("Hello, World!");
// instanciar (criar) um objeto da classe cliente



