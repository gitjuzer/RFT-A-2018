<?php
session_start();
$_SESSION['logged']=false;
header("Location: kezdolap.php");
exit();

?>