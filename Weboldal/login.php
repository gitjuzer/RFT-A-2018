<?php
error_reporting(0);
ob_start();
session_start();
require_once 'mydbms.php';
//$con=mysqli_connect('localhost','batab','kina','kina');
?>
<form  method="post" action="">
    <?php
    if($_SERVER["REQUEST_METHOD"] == "POST")
    {
        $myusername1=mysqli_real_escape_string($con,$_POST['username']);
        $mypassword1=mysqli_real_escape_string($con,$_POST['password']);
        $mypassword=MD5($mypassword1);

        $sql="SELECT * FROM users WHERE username='$myusername1' and password='$mypassword'";
        $result=mysqli_query($con,$sql);
        $row=mysqli_fetch_array($result);
        $_SESSION['userid']=$row['user_id'];
        $_SESSION['role']=$row['role'];
        $count=mysqli_num_rows($result);
        if($count==1)
        {
                header ("location: index.html");
        }
        else
        {
            $error="Felhasználónév vagy a jelszó hibás";
        }
    }
    ?>
    <label>Felhasználónév  :</label><br/><input type="text" name="username" class="box"/><br /><br />
    <label>Jelszó  :</label><br/><input type="password" name="password" class="box" /><br/><br />
    <input type="submit" value=" Submit "/><br />
    <a href="reg.php">Regisztráció</a>
</form>
<div><?php echo $error; ?></div>
