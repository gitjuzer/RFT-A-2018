<?php
session_start();
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <style type="text/css">
        #branding h1 {
            color: white;
        }
        .legyfeher{
            color: white;
        }
    </style>
    <meta charset="UTF-8">
    <title>Fejtörő</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="theme-color" content="#000000">
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="../css/indexStyle.css">
</head>
<body>
<header>
    <div class="container">
        <div id="branding">
            <h1><span class="highlight">Játékos</span> nyelvtanulás</h1>
        </div>
        <nav>
            <ul>
                <li class="current"><a href="../kezdolap.php">Kezdőlap</a></li>
                <li><a href="../html/gallery.html">Galéria</a></li>
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
<div id="root"></div>
<script src='https://cdnjs.cloudflare.com/ajax/libs/react/16.4.2/umd/react.production.min.js'></script>
<script src='https://cdnjs.cloudflare.com/ajax/libs/react-dom/16.4.2/umd/react-dom.production.min.js'></script>
<script src='https://cdnjs.cloudflare.com/ajax/libs/redux/4.0.1/redux.min.js'></script>
<script src='https://cdnjs.cloudflare.com/ajax/libs/react-redux/5.1.0/react-redux.min.js'></script>
<script src='https://cdnjs.cloudflare.com/ajax/libs/styled-components/3.4.10/styled-components.min.js'></script>

<script  src="js/index.js"></script>

</body>
</html>