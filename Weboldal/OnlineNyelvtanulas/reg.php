<?php
use PHPMailer\PHPMailer\PHPMailer;
use PHPMailer\PHPMailer\Exception;

require 'PHPMailer/Exception.php';
require 'PHPMailer/PHPMailer.php';
require 'PHPMailer/SMTP.php';
require_once 'mydbms.php';

if(isset($_POST['btn-signup'])) {

    $teljes = strip_tags($_POST['teljes']);
    $uname = strip_tags($_POST['username']);
    $upass = strip_tags($_POST['password']);
    $upass2 = strip_tags($_POST['password2']);
    $email = strip_tags($_POST['email']);

    $uname = $con->real_escape_string($uname);
    $teljes = $con->real_escape_string($teljes);
    $upass = $con->real_escape_string($upass);
    $email = $con->real_escape_string($email);
    if ($upass != $upass2) {
        $msg = "<div class=\"hiba\">Nem egyezik a két jelszó</div>";
    } else {
        $password = md5($upass);
        $hash = md5(rand(0, 1000));

        $check_uname = $con->query("SELECT teljes FROM users WHERE username='$uname'");
        $count = $check_uname->num_rows;
        $role = "guest";

        if ($count == 0) {

            $query = "INSERT INTO users(teljes,username,password, role,email, hash) VALUES('$teljes','$uname','$password', '$role','$email','$hash')";


            if ($con->query($query)) {
                $to = $email; // Send email to our user
                $subject = "Signup | Verification"; // Give the email a subject
                $message = '
         
        Thanks for signing up!
        Your account has been created, you can login with the following credentials after you have activated your account by pressing the url below.
         
        ------------------------
        Username: ' . $uname . '
        Password: ' . $upass . '
        ------------------------
         
        Please click this link to activate your account:
        http://localhost:63342/OnlineNyelvtanulas/verify.php?email=' . $email . '&hash=' . $hash . '
         
        ';


                $mail = new PHPMailer();
                $mail->isSMTP();
                $mail->SMTPDebug = 0;
                $mail->SMTPAuth = true;
                $mail->SMTPSecure = 'ssl';
                $mail->Host = 'smtp.gmail.com';
                $mail->Port = 465;
                $mail->isHTML(true);
                $mail->Username = "rft2018a@gmail.com";
                $mail->Password = "RfTa2018";
                $mail->setFrom('rft2018a@gmail.com');
                $mail->Subject = $subject;
                $mail->Body = $message;
                $mail->addAddress($email);


                if ($mail->send())
                    $msg1 = "You have been registered! Please verify your email!";
                else
                    echo $msg1 = "Hiba az aktiváló email küldése közben.";
            } else {
                $msg = "<p>Hiba a Regisztráció közben</p>";
            }

        } else {


            $msg = "<div class=\"hiba\">Sajnos a név már foglalt.</div>";

        }

        $con->close();
    }
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




    </form>
    <div class="logcontainer">

            <section id="content">
                <form method="post" id="register-form">
                    <h1>Regisztráció</h1>
                    <div>
                        <input type="text" placeholder="Teljes Név" name="teljes" required  />
                    </div>
                    <div>
                        <input type="text" class="form-control" placeholder="Username" name="username" required  />
                    </div>
                    <div>
                        <input type="password" class="form-control" placeholder="Password" name="password" required  />
                    </div>
                    <div>
                        <input type="password" class="form-control" placeholder="Password" name="password2" required  />
                    </div>
                    <div>
                        <input type="text" class="form-control" placeholder="Email" name="email" required  />
                    </div>
                    <div>
                        <button type="submit" class="button" name="btn-signup">Felhasználó létrehozása</button>
                    </div>
                    <?php
                    if (isset($msg)) {
                        echo $msg;

                    }
                    if (isset($msg1)) {
                        echo $msg1;

                    }
                    ?>
                </form>
            </section>
        </div>
	</form>


    <footer>
        <p>Responsive Web Design, Copyright &copy; 2018</p>
    </footer>
</body>
</html>