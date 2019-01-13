<?php
	$link = mysqli_connect("tsn.cvwzlkgkt9hx.ap-south-1.rds.amazonaws.com","tsn","12345678","tsn") or die("Sorry connection with database can't establishing");
	if($_POST['mybutton'] == 'Delete')
	{
	  $sql1 = "delete from s_info where sid=".$_POST['sid'].";";
	  $sql2 = "delete from e_info where sid=".$_POST['sid'].";";
	}
	elseif($_POST['mybutton'] == 'Update')
	{
		$sql1 = "UPDATE s_info SET fname='".$_POST['fname']."',lname='".$_POST['lname']."',mobile='".$_POST['mobile']."',address='".$_POST['address']."',dob='".$_POST['dob']."',gender='".$_POST['gender']."' where sid=".$_POST['sid'].";";
		$sql2 = "UPDATE e_info SET semester='".$_POST['semester']."',department='".$_POST['department']."',college='".$_POST['college']."',college_code='".$_POST['college_code']."' where sid=".$_POST['sid'].";";
	}

	mysqli_query($link,$sql1) or die('error in s_info connection');
	mysqli_query($link,$sql2) or die('error in e_info connection');
?>

<!DOCTYPE html>
<html>
<head>
	<title>Successful Registration</title>
</head>
<body bgcolor="orange" style="color: white; font-weight: bolder;font-family: sans-serif; font-size: 30px;">
	<br/><br/><br/><br/><br/><br/><br/>
	<center>
		<h1>Your Operation is done Successfully<br/>
	</center>
	<footer id="page_footer" style="clear:both;padding:10px;text-align:center;position: fixed;left: 0;bottom: 0;background-color: orange;color: white;font-weight: bolder;width: 100%">
				Developed by, Shinojiya Parth Kishorbhai (160470116050)
	</footer>
</body>
</html>

