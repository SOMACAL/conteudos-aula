<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>
        exercicio-13
    </title>
</head>

<body>

    <form action="" method="GET">
        <label for="numdia">Digite um numero de 1 a 7</label>
        <input name="numdia" id="numdia" type="number">
        <button type="submit">Enviar</button>
    </form>

    <?php 
    
    
        $numdia = $_Post['numdia'];
        echo "<br>O dia da semana " . $numdia;
        
        switch ($dia) {
            case '1':
                echo "<br>Domingo";
                break;
            
            case '2':
                echo "<br>Segunda-feira";
                break;
                
                case '3':
                    echo "<br>Terça-feira";
                    break;
                
                case '4':
                    echo "<br>Quarta-feira";
                    break;
                    case '5':
                        echo "<br>Quinta-feira";
                        break;
                    
                    case '6':
                        echo "<br>Sexta-feira";
                        break;
                        case '7':
                            echo "<br>Sabado";
                            break;

            default:
                echo "<br>Numero invalido por favor insira um numero de 1 a 7";
                break;
        }


    
    ?>


</body>

</html>