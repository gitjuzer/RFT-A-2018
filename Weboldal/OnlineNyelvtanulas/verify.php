<?php
require_once 'mydbms.php';

$msg ="";

if(isset($_GET['email']) && !empty($_GET['email']) AND isset($_GET['hash']) && !empty($_GET['hash'])){
    $email = strip_tags($_GET['email']); // Set email variable
    $hash = strip_tags($_GET['hash']); // Set hash variable
    $search = $con->query("SELECT email, hash, active FROM users WHERE email='".$email."' AND hash='".$hash."' AND active='0'");

    $match  = $search->num_rows;
    if($match > 0){
        // We have a match, activate the account
        $query ="UPDATE users SET active='1' WHERE email='".$email."' AND hash='".$hash."' AND active='0'";
        if ($con->query($query)) {
            $msg = "<section id=\"showcase\">
                        <div class=\"container\">
                            <h1>A fiókod aktiválása sikeres volt, most már bejelentkezhetsz</h1>
                        </div>
                    </section>";
        }
    }else{
        $msg = "<section id=\"showcase\">
                        <div class=\"container\">
                            <h1>Az URL hibás vagy már aktiváltad a fiókodat</h1>
                        </div>
                    </section>";
    }
}else{
    // Invalid approach
}

?>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width">
    <meta name="description" content="Affordable and professional web design">
    <meta name="keywords" content="web design, affordable web design, professional web design">
    <meta name="Affordable and professional web design">
    <meta name="author" content="malac">
    <title>Játékos nyelvtanulás | Regisztráció</title>
    <link rel="stylesheet" href="css/indexStyle.css">
    <link rel="stylesheet" href="css/loginstyle.css">
</head>
<body>
<header>
    <div class="container">
        <div id="branding">
            <h1><span class="highlight">Játékos</span> nyelvtanulás</h1>
        </div>
        <nav>
            <ul>
                <li class="current"><a href="index.html">Kezdőlap</a></li>
                <li><a href="../html/gallery.html">Galéria</a></li>
                <li><a href="about.html">Letöltés</a></li>
                <li><a href="reg.php">Regisztráció</a></li>
                <li><a href="login.php">Belépés</a></li>
            </ul>
        </nav>
    </div>
</header>
<?php
echo $msg;
?>

</body>
</html>
