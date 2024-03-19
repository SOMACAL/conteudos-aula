<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Arrays</title>
</head>

<body>
    <h1>Arrays</h1>
    <?php 
    $comidas = array("batata","Miojo","Polenta");
   // echo var_dump($comidas);
    echo print_r($comidas);
    echo"<br>". $comidas [2];
    echo"<br>";
    
    $comidas[3] = "arroz";
    $comidas[] = 30.5;
    $comidas[3] = true;
    $comidas[4] = "feijão";
    echo print_r($comidas)

    $totalcomida = count($comidas);
    echo "<br> Total: {$totalcomida}"
    echo"<h4>lista de compras</h4>";
        for ($i=0; $i <$totalcomida ; $i++) { 
            
        }

        



   ?>


</body>

</html>