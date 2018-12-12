<?php
error_reporting(0);
ob_start();
session_start();
require_once 'mydbms.php';

//$con=mysqli_connect('localhost','batab','kina','kina');
?>
<!DOCTYPE html>

<head>
    <meta charset="UTF-8">
    <title>Login form using HTML5 and CSS3</title>
    <link rel="stylesheet" href="css/indexStyle.css">
    <link rel="stylesheet" href="css/loginstyle.css">
    <title>Játékos nyelvtanulás | Belépés</title>

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
                    <li><a href="login.php">Belépés</a></li>
                </ul>
            </nav>
        </div>
    </header>
    <div class="logcontainer">

        <section id="content">
            <form method="post" action="">
                <?php
                if($_SERVER["REQUEST_METHOD"] == "POST")
                {
                    $myusername1=mysqli_real_escape_string($con,$_POST['username']);
                    $mypassword1=mysqli_real_escape_string($con,$_POST['password']);
                    $mypassword=MD5($mypassword1);
                    $sql="SELECT * FROM users WHERE username='$myusername1' and password='$mypassword' and active='1'";
                    $result=mysqli_query($con,$sql);
                    $row=mysqli_fetch_array($result);
                    $_SESSION['userid']=$row['user_id'];
                    $_SESSION['role']=$row['role'];
                    $count=mysqli_num_rows($result);
                    if($count==1)
                    {
                        $_SESSION['logged']=true;
                        $_SESSION['username']=$myusername1;
                        header("Location: kezdolap.php");
                        exit();
                    }
                    else
                    {
                        $_SESSION['logged']=false;
                        $error="<div class=\"hiba\">Győződj meg róla, hogy jól írtad-e be a 
                            felhasználó nevet és a jelszót és hogy aktiváltad a felhasználói fiókod</div>";
                    }
                }
                ?>
                <h1>Belépés</h1>
                <div>
                    <input type="text" placeholder="Felhasználónév" required="" name="username" />
                </div>
                <div>
                    <input type="password" placeholder="Jelszó" required="" name="password" />
                </div>
                <div>
                    <input type="submit" value="Log in" />
                    <a href="reg.php" class="regbutton">Regisztráció</a>
                </div>
                <div>
                    <?php echo $error; ?>
                </div>
            </form>
        </section>
    </div>

</form>
        <footer>
            <p>Responsive Web Design, Copyright &copy; 2018</p>
        </footer>

</body>
</html>

