<?php
	$link = mysqli_connect("tsn.cvwzlkgkt9hx.ap-south-1.rds.amazonaws.com","tsn","12345678","tsn") or die("Sorry connection with database can't establishing");
	$query = "insert into s_info(fname,lname,mobile,mail,address,dob,gender,password) values('".$_POST['fname']."','".$_POST['lname']."','".$_POST['mobile']."','".$_POST['mail']."','".$_POST['address']."','".$_POST['dob']."','".$_POST['gender']."','".$_POST['pass']."');";
	$query1= "insert into e_info(sid,semester,department,college,college_code) values (last_insert_id(),".$_POST['semester'].",'".$_POST['department']."','".$_POST['college']."','".$_POST['college_code']."');";

	mysqli_query($link,$query) or die('error in s_info connection');
	mysqli_query($link,$query1) or die('error in e_info connection');
?>
<!DOCTYPE html>
<html>
<head>
	<title>Successful Registration</title>
</head>
<body bgcolor="orange" style="color: white; font-weight: bolder;font-family: sans-serif; font-size: 30px;">
	<br/><br/><br/><br/><br/><br/><br/>
	<center>
		<h1>Your Registration is done Successfully<br/>
		<a href="index.php">Sign in</a> to Continue</h1>
	</center>
	<footer id="page_footer" style="clear:both;padding:10px;text-align:center;position: fixed;left: 0;bottom: 0;background-color: orange;color: white;font-weight: bolder;width: 100%">
				Developed by, Shinojiya Parth Kishorbhai (160470116050)
	</footer>
</body>
</html>