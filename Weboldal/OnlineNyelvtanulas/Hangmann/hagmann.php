<?php
session_start();
?>
<!DOCTYPE html>
<html>

<head>
    <style type="text/css">
        #branding h1 {
            color: white;
        }
        .legyfeher{
            color: white;
        }
    </style>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Akasztófa játék</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="../css/hagmannStyle.css" />

    <script src="hagmann.js"></script>
</head>
<body onload="startUp()">
<header>
    <div class="container">
        <div id="branding">
            <h1><span class="highlight">Játékos</span> nyelvtanulás</h1>
        </div>
        <nav>
            <ul>
                <li class="current"><a href="../kezdolap.php">Kezdőlap</a></li>
                <li><a href="../gallery.php">Galéria</a></li>
                <li><a href="../DowloadPage/index.php">Letöltés</a></li>
                <li><a href="../reg.php">Regisztráció</a></li>
                <li class="legyfeher">
                    <?php
                    if($_SESSION['logged']==true)
                    {
                        echo "Szia ";
                        echo $_SESSION["username"];
                        echo "! ";
                        echo '<a href="../logout.php"><span>Kilépés</span></a></li>';
                    }
                    elseif($_SESSION['logged']==false)
                    {

                        echo '<a href="../login.php"><span>Belépés</span></a></li>';
                    }
                    ?></li>
            </ul>
        </nav>
    </div>
</header>
    <section class="container">
        <h1>Akasztófa</h1>
        <h3>Találd ki a megfelelő szót! De vigyázz csak 10 életed van!</h3>
        <div class="holderStyle">
            <p>
                <button type="button" id="btn_a" name="letter" onclick="Letter('A')">A</button>
                <button type="button" id="btn_a" name="letter" onclick="Letter('B')">B</button>
                <button type="button" id="btn_c" name="letter" onclick="Letter('C')">C</button>
                <button type="button" id="btn_d" name="letter" onclick="Letter('D')">D</button>
                <button type="button" id="btn_e" name="letter" onclick="Letter('E')">E</button>
                <button type="button" id="btn_f" name="letter" onclick="Letter('F')">F</button>
                <button type="button" id="btn_g" name="letter" onclick="Letter('G')">G</button>
                <button type="button" id="btn_h" name="letter" onclick="Letter('H')">H</button>
                <button type="button" id="btn_i" name="letter" onclick="Letter('I')">I</button>
                <button type="button" id="btn_j" name="letter" onclick="Letter('J')">J</button>
                <button type="button" id="btn_k" name="letter" onclick="Letter('K')">K</button>
                <button type="button" id="btn_L" name="letter" onclick="Letter('L')">L</button>
                <button type="button" id="btn_m" name="letter" onclick="Letter('M')">M</button>
            </p>
            <p>
                <button type="button" id="btn_n" name="letter" onclick="Letter('N')">N</button>
                <button type="button" id="btn_o" name="letter" onclick="Letter('O')">O</button>
                <button type="button" id="btn_p" name="letter" onclick="Letter('P')">P</button>
                <button type="button" id="btn_q" name="letter" onclick="Letter('Q')">Q</button>
                <button type="button" id="btn_r" name="letter" onclick="Letter('R')">R</button>
                <button type="button" id="btn_s" name="letter" onclick="Letter('S')">S</button>
                <button type="button" id="btn_t" name="letter" onclick="Letter('T')">T</button>
                <button type="button" id="btn_u" name="letter" onclick="Letter('U')">U</button>
                <button type="button" id="btn_v" name="letter" onclick="Letter('V')">V</button>
                <button type="button" id="btn_w" name="letter" onclick="Letter('W')">W</button>
                <button type="button" id="btn_x" name="letter" onclick="Letter('X')">X</button>
                <button type="button" id="btn_y" name="letter" onclick="Letter('Y')">Y</button>
                <button type="button" id="btn_z" name="letter" onclick="Letter('Z')">Z</button>
            </p>


        </div>
        <div>
            <canvas id="hagmannCanvas" class="canvasStyle">

            </canvas>
        </div>
        <p id="answer" class="pStyle"></p>
        <div class="pContainer">

            <p id="counter" class="pStyle"></p>
            <p id="stat" class="pStyle"></p>
            <p id="wrongletters" class="pStyle"></p>
        </div>

    </section>
    <footer>
        <div>   
            <a href="hangmann.php">Új játék</a>
        </div>
    </footer>

</body>



</html>