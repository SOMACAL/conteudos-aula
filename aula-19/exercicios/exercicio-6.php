<form action method="POST">
    <label for="n1">digite o primeiro numero</label>
    <input type="text" name="n1" id="n1"><br><br>

    <label for="n2">digite o segundo numero</label>
    <input type="text" name="n2" id="n2"><br><br>

    <label for="n3">digite o segundo numero</label>
    <input type="text" name="n3" id="n3"><br><br>


    <input type="submit" value="calcular">
</form>



<?php
if($_SERVER["REQUEST_METHOD"] == "POST"){

$n1 = $_POST['n1'];
$n2 = $_POST['n2'];
$n3 = $_POST['n3'];

$maior1 = $n1 < $n2;
$maior2 = $n1 > $n2;     





echo "<p>"."o numero 1 é maior $maior1"."</p>";
echo "<p>"."o numero 2 é maior $maior2"."</p>";



}





?>