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
        <title>Játékos nyelvtanulás | Kezdőlap</title>
        <link rel="stylesheet" href="css/indexStyle.css">
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
                    <li><a href="../html/gallery.html">Galéria</a></li>
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

        <section id="showcase">
                <div class="container">
                    <h1>Játékos nyelvtanulás online</h1>
                    <p>Nyelvtanulás offline is. Töltsd le asztali alkalmazásunkat is, hogy tudásod mindig naprakész legyen. </p>
                </div>
        </section>

        <section id="boxes">
            <div class="containerBoxes">
                <div class="box">
                    <img src="pic/hagmann.jpg" alt="">
                    <h3>Akasztófa</h3>
                    <p>Tedd próbára az angol tudásod, az angolnyelvű szókereső akasztófa játékban.</p>
                    <a href="Hangmann/hagmann.php">Játék</a>
                </div>
                <div class="box">
                    <img src="pic/talaldki.JPG" alt="">
                    <h3>Találd Ki</h3>
                    <p>Légy vakmerő, és találd ki a szavak helyes alakját.</p>
                    <a href="TalaldKi/index.html">Játék</a>
                </div>
                <div class="box">
                    <img src="pic/london.png" alt="">
                    <h3>Graphic Design</h3>
                    <p>Teszteld le eddigi tudásodat és válj a kitalálás mesterévé</p>
                    <a href="">Játék</a>
                </div>
            </div>
            <
        </section>

        <section id="newsletter">
            <div class="containerNL">  
                <h1>Iratokozz fel a hírlevelünkre!</h1>    
                <form action="">
                    <input type="email" placeholder="Enter Email...">
                    <button type="submit" class="btn">Subscribe</button>
                </form>
            </div>
        </section>

        <footer>
            <p>Responsive Web Design, Copyright &copy; 2018</p>
        </footer>
    </body>
</html>