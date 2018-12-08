<?php
require_once 'mydbms.php';

if(isset($_GET['email']) && !empty($_GET['email']) AND isset($_GET['hash']) && !empty($_GET['hash'])){
    $email = strip_tags($_GET['email']); // Set email variable
    $hash = strip_tags($_GET['hash']); // Set hash variable
    $search = $con->query("SELECT email, hash, active FROM users WHERE email='".$email."' AND hash='".$hash."' AND active='0'");

    $match  = $search->num_rows;
    if($match > 0){
        // We have a match, activate the account
        $query ="UPDATE users SET active='1' WHERE email='".$email."' AND hash='".$hash."' AND active='0'";
        if ($con->query($query)) {
            echo '<div>Your account has been activated, you can now login</div>';
        }
    }else{
        echo '<div class="statusmsg">The url is either invalid or you already have activated your account.</div>';
    }
}else{
    // Invalid approach
}

?>