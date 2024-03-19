<form action method="POST">
    <label for="n1">digite o primeiro numero</label>
    <input type="text" name="n1" id="n1"><br><br>



    <input type="submit" value="enviar">
</form>



<?php
if($_SERVER["REQUEST_METHOD"] == "POST"){

$n1 = $_POST['n1'];






echo "<p>"."o numero informado é $n1"."</p>";



}





?>