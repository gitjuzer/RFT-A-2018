<?php
  $con = new MySQLi('db4free.net','rft2018','rfta2018','felhasznalok');
    
     if ($con->connect_errno) {
         die("ERROR : -> ".$con->connect_error);
	 }
?>