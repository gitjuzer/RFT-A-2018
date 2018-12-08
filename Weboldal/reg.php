<?php echo (extension_loaded('openssl')?'SSL loaded':'SSL not loaded')."\n"; ?>
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
 $email = strip_tags($_POST['email']);

 $uname = $con->real_escape_string($uname);
 $teljes = $con->real_escape_string($teljes);
 $upass = $con->real_escape_string($upass);
 $email = $con->real_escape_string($email);

 $password = md5($upass);
 $hash = md5( rand(0,1000) );

 $check_uname = $con->query("SELECT teljes FROM users WHERE username='$uname'");
 $count=$check_uname->num_rows;
 $role="guest";

 if ($count==0) {

  $query = "INSERT INTO users(teljes,username,password, role,email, hash) VALUES('$teljes','$uname','$password', '$role','$email','$hash')";



     $to      = $email; // Send email to our user
     $subject = "Signup | Verification"; // Give the email a subject
     $message = '
         
        Thanks for signing up!
        Your account has been created, you can login with the following credentials after you have activated your account by pressing the url below.
         
        ------------------------
        Username: '.$uname.'
        Password: '.$upass.'
        ------------------------
         
        Please click this link to activate your account:
        http://localhost:63342/Weboldal/verify.php?email='.$email.'&hash='.$hash.'
         
        ';


     $mail = new PHPMailer();
     $mail-> isSMTP();
     $mail-> SMTPDebug = 0;
     $mail-> SMTPAuth = true;
     $mail->SMTPSecure = 'ssl';
     $mail->Host = 'smtp.gmail.com';
     $mail-> Port = 465;
     $mail->isHTML(true);
     $mail->Username = "rft2018a@gmail.com";
     $mail->Password = "RfTa2018";
     $mail->setFrom('rft2018a@gmail.com');
     $mail->Subject = $subject;
     $mail->Body= $message;
     $mail->addAddress($email);


     if ($mail->send())
         $msg1 = "You have been registered! Please verify your email!";
     else
         echo $msg1 = "fos";

  if ($con->query($query)) {
   $msg = "<p>Sikeresen regisztráltál ! Elküldtük  </p><a href=\"login.php\">Belépés!</a>";
  }else {
   $msg = "<p>Hiba a Regisztráció közben</p>";
  }

 } else {


  $msg = "<p>Név foglalt!</p>";

 }

 $con->close();
}
?>

<!DOCTYPE html>
<html>
<head>

	<title>Regisztráció</title>
</head>
<body>
	<form method="post" id="register-form">
	<h2>Regisztráció</h2><hr />

	<?php
  	if (isset($msg)) {
   	echo $msg;

  	}
    if (isset($msg1)) {
        echo $msg1;

    }
  	?>

	<input type="text" placeholder="Teljes Név:" name="teljes" required  />
    <input type="text" class="form-control" placeholder="Username" name="username" required  />
	<input type="password" class="form-control" placeholder="Password" name="password" required  />
    <input type="text" class="form-control" placeholder="Email" name="email" required  />
	<button type="submit" name="btn-signup">Felhasználó létrehozása</button>
	</form>



</body>
</html>