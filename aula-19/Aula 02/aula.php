<form action method="GET">
    <label for="num">digita um numero</label>
    <input type="number" id="num" name="num"><br><br>
    <input type="submit" value="calcular">
</form>



<?php
    $raio = $_GET['num'];
    
    $area = 2 * M_PI * pow($raio, 2);
    $perimetro =  M_PI * pow($raio, 2) ;

    echo "Perímetro do círculo: "  . number_format($perimetro, 2) . "<br>";
    echo "Área do círculo: " . number_format($area, 2);
    
    



?>