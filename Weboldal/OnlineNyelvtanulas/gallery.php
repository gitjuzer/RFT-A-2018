<?php
 session_start();
?>

<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width">
    <meta name="description" content="Affordable and professional web design">
    <meta name="keywords" content="web design, affordable web design, professional web design">
    <meta name="Affordable and professional web design">
    <meta name="author" content="malac">
    <title>Responsive Web Design | Galéria</title>
    <link rel="stylesheet" href="css/galleryStyle.css">
</head>

<body>

    <header>
        <div class="container">
            <div id="branding">
                <h1><span class="highlight">Játékos</span> nyelvtanulás</h1>
            </div>
            <nav>
                <ul>
                    <li class="current"><a href="kezdolap.php">Kezdőlap</a></li>
                    <li><a href="gallery.php">Galéria</a></li>
                    <li><a href="DowloadPage/index.php">Letöltés</a></li>
                    <li><a href="reg.php">Regisztráció</a></li>
                    <li>
                        <?php
                        if($_SESSION['logged']==true)
                        {
                            echo "Szia ";
                            echo $_SESSION["username"];
                            echo "! ";
                            echo '<a href="logout.php"><span>Kilépés</span></a></li>';
                        }
                        elseif($_SESSION['logged']==false)
                        {

                            echo '<a href="login.php"><span>Belépés</span></a></li>';
                        }
                        ?></li>
                </ul>
            </nav>
        </div>
    </header>
    <section>
        <div class="responsive">
            <div class="gallery">
                <a target="_blank" href="pic/akasztófa.png">
                    <img class="imgStyle" src="pic/akasztófa.png" alt="">
                </a>
                <div class="desc">Szókitaláló</div>
            </div>
        </div>
        <div class="responsive">
            <div class="gallery">
                <a target="_blank" href="pic/Whatsonpicture.png">
                    <img class="imgStyle" src="pic/Whatsonpicture.png" alt="">
                </a>
                <div class="desc">Mi van a képen?</div>
            </div>
        </div>
        <div class="responsive">
            <div class="gallery">
                <a target="_blank" href="pic/main.png">
                    <img class="imgStyle" src="pic/main.png" alt="">
                </a>
                <div class="desc">Főablak</div>
            </div>
        </div>
        <div class="responsive">
            <div class="gallery">
                <a target="_blank" href="pic/akasztofa_web.png">
                    <img class="" src="pic/akasztofa_web.png" alt="">
                </a>
                <div class="desc">Akasztófa</div>
            </div>
        </div>
        <div class="responsive">
            <div class="gallery">
                <a target="_blank" href="pic/easygames.png">
                    <img class="" src="pic/easygames.png" alt="">
                </a>
                <div class="desc">Játékok fajtái</div>
            </div>
        </div>
      



        <div class="clearfix"></div>

    </section>



</body>

</html>