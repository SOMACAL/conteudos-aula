<?php

 function nomeBonito(){
    echo "Testando minnha função";
 } 
 nomeBonito();

 function criarTitulo($texto){
    echo"<h1>" . $texto . "</h1>";
 }
 
criarTitulo("Titulo aula 5 - Funções");

function tituloLegal($texto){
    echo"<h2>################</h2>";
    echo"<h2>" . $texto . "</h2>";
    echo"<h2> ###############</h2>";


 }
 tituloLegal("calcular media");

 function calcularMedia($nome, $nota1, $nota2){
    $media =  ($nota1 + $nota2) / 2;
    if($media >=7){
        echo"<p>Aluno {$nome} foi aprovado com media {$media}</p>";
    } else {
        echo"<p>Aluno {$nome} foi reprovado com media {$media}</p>";
    }
 }

 calcularMedia("Ryan", 6.0,8.0);
 calcularMedia("Pedro", 4.0,5.0);
 calcularMedia("Joao", 6.9,8.0);

 function somar($a, $b){
    $soma = $a + $b;
    echo"<li>{$a} + {$b} = {$soma}";
 }
    echo"lista de somas";
    somar(7,4);

function somarNumeros(...$numero){
    //echo print_r($numero)
    $soma  =0 ;
    echo"<li>";
    
}

    echo"<br><br>";
    somarNumeros(2,3,4,5,);
    function seila($nome, $numero, $texto, ...$numeros){
        echo"<br>";
    //echo var_dump($coisas);
}
seila("nome",30,"texto",10,"outro texto", 4,6 ,true,false,"texto");

tituloLegal("outras funcoes");
$verdadeiro= true;

function calcular($nome,$ano){
    $idade =2024 - $ano;
    echo"<p> o {$nome} tem {$idade} anos</p>";
    
}
calcular("José",1941);
echo"<p>divisao</p>;
function divsao($num1, $num2){
    $res= $num1 / $num2;
    return $res;
}
$div= divsao(40, 20);
echo "Conta" . $div;
    

    ?>