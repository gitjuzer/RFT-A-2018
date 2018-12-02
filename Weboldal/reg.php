<?php 
require_once 'mydbms.php';

if(isset($_POST['btn-signup'])) {
 
 $teljes = strip_tags($_POST['teljes']);
 $uname = strip_tags($_POST['username']);
 $upass = strip_tags($_POST['password']);
 
 $uname = $con->real_escape_string($uname);
 $teljes = $con->real_escape_string($teljes);
 $upass = $con->real_escape_string($upass);
 
 $password = md5($upass); 
 
 $check_uname = $con->query("SELECT teljes FROM users WHERE username='$uname'");
 $count=$check_uname->num_rows;
 $role="guest";
 
 if ($count==0) {
  
  $query = "INSERT INTO users(teljes,username,password, role) VALUES('$teljes','$uname','$password', '$role')";

  if ($con->query($query)) {
   $msg = "<p>Sikeresen regisztráltál ! </p><a href=\"login.php\">Belépés!</a>";
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
  	?>

	<input type="text" placeholder="Teljes Név:" name="teljes" required  />
    <input type="text" class="form-control" placeholder="Username" name="username" required  />
	<input type="password" class="form-control" placeholder="Password" name="password" required  />
	<button type="submit" name="btn-signup">Felhasználó létrehozása</button>   
	</form>



</body>
</html>