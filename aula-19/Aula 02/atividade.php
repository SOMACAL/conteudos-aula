<form action method="POST">
    <label for="num1">digita um numero</label>
    <input type="text" name="num1" id="num1"><br><br>

    <label for="num2">digita o 2 numero</label>
    <input type="text" name="num2" id="num2"><br><br>

    <input type="submit" value="calcular">
</form>



<?php
if($_SERVER["REQUEST_METHOD"] == "POST"){

$num1 = $_POST['num1'];
$num2 = $_POST['num2'];
$soma = $num1 + $num2;


echo "a soma de $num1 + $num2 é  $soma";
}





?>