<form action method="POST">
    <label for="not1">digita a primeira nota</label>
    <input type="text" name="not1" id="not1"><br><br>

    <label for="not2">digita a segunda nota</label>
    <input type="text" name="not2" id="not2"><br><br>

    <label for="not3">digita a terceira nota</label>
    <input type="text" name="not3" id="not3"><br><br>

    <input type="submit" value="calcular">
</form>



<?php
if($_SERVER["REQUEST_METHOD"] == "POST"){

$not1 = $_POST['not1'];
$not2 = $_POST['not2'];
$not3 = $_POST['not3'];
$soma = $not1 + $not2 + $not3 ;
$media = $soma / 3;


echo "<p>" ."a soma das notas  do aluno é $not1 + $not2 + $not3 é  $soma"."</p>";
echo "<p>"."a media do aluno  é  $soma dividido pelo numero de nota é $media"."</p>";

}





?>