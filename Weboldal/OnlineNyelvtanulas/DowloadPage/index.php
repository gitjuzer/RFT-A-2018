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
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Home - Angol Tanulás</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Catamaran:100,200,300,400,500,600,700,800,900">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Muli">
    <link rel="stylesheet" href="assets/fonts/fontawesome-all.min.css">
    <link rel="stylesheet" href="../css/indexStyle.css">
    <link rel="stylesheet" href="assets/fonts/font-awesome.min.css">
    <link rel="stylesheet" href="assets/fonts/simple-line-icons.min.css">
</head>

<body id="page-top">
    <header class="letolteshead">
        <div class="container">
            <div id="branding">
                <h1><span class="highlight">Játékos</span> nyelvtanulás</h1>
            </div>
            <nav>
                <ul>
                    <li class="current"><a href="../index.php">Kezdőlap</a></li>
                    <li><a href="../gallery.php">Galéria</a></li>
                    <li><a href="index.php">Letöltés</a></li>
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


    <div>
        <div class="container">
            <div class="row">
                <div class="col-md-6"><img src="assets/img/iconfinder_microsoft_246000.png" style="/*margin: 0 atuo;*/display: block;margin-left: auto;margin-right: auto;width: 50%;"></div>
                <div class="col-md-6">
                    <h1 class="text-center" style="margin-top: 15%;font-size: 95px;">Windows</h1>
                    <div class="container kozepre"><a href="https://github.com/gitjuzer/RFT-A-2018/raw/master/rftbeadando.exe" class="btn btn-success">Letöltés</a>
                    </div>
                </div>
            </div>
        </div>
    </div>


    <footer>
        <p>Responsive Web Design, Copyright &copy; 2018</p>
    </footer>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js"></script>
    <script src="assets/js/new-age.js"></script>
</body>

</html>