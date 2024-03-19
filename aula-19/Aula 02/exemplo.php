<form action method="POST">
    <label for="ano">digita a primeira nota</label>
    <input type="text" name="ano" id="ano"><br><br>

    <input type="submit" value="enviar">
</form>



<?php
if($_SERVER["REQUEST_METHOD"] == "POST"){

$not1 = $_POST['not1'];
$not2 = $_POST['not2'];
$not3 = $_POST['not3'];
$soma = $not1 + $not2 + $not3 ;
$media = $soma / 3;

if($idade > 16){
echo "<p>" ."legal ja pode votar"."</p>";
}
echo "<p>"."espere mais um pouco"."</p>";

}





?>