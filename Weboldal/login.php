<?php
error_reporting(0);
ob_start();
session_start();
require_once 'mydbms.php';
//$con=mysqli_connect('localhost','batab','kina','kina');
?>
<form  method="post" action="">
    <label>UserName  :</label><br/><input type="text" name="username" class="box"/><br /><br />
    <label>Password  :</label><br/><input type="password" name="password" class="box" /><br/><br />
    <input type="submit" value=" Submit "/><br />
    <a href="reg.php">Regisztráció</a>
</form>
