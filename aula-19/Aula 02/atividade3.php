<form action method="POST">
    <label>digite os metros</label>
    <input type="text" name="metros"><br><br>
    <input type="submit" value="calcular"><br>
</form>

<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {

    $metros = $_POST['metros'];
    $centimetros = $metros * 100;


    echo "<p>" . "O resultado foi = $centimetros centimetros" . "</p>";
}





?>