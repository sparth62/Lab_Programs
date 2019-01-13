<!DOCTYPE html>
<html>
<head>
	<title>Information</title>
</head>
<body bgcolor="orange" style="color: white;font-weight: bold;font-family: sans-serif;">
<center>
	<?php
		$link = mysqli_connect("tsn.cvwzlkgkt9hx.ap-south-1.rds.amazonaws.com","tsn","12345678","tsn") or die("Sorry connection with database can't establishing");
		$sql1 = "SELECT * FROM s_info WHERE mail='".$_POST['mail1']."' and password ='".$_POST['pass1']."';";
		$rec1=mysqli_query($link,$sql1);
		$result1 = mysqli_fetch_assoc($rec1);

		$sql2 = "SELECT * FROM e_info WHERE sid='".$result1['sid']."';";
		$rec2=mysqli_query($link,$sql2);
		$result2 = mysqli_fetch_assoc($rec2);

	echo "<h1>Welcome to Try Something new</h1>
	<br/>
	<br/>
	<form method='POST' action='modify.php'>
	<table border='0'>
		<tr>
			<td>S_id</td>
			<td>:<input type='text' name='sid' value='".$result1['sid']."'></td>
		</tr>
		<tr>
			<td>First Name</td>
			<td>:<input type='text' name='fname' value='".$result1['fname']."'></td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td>:<input type='text' name='lname' value='".$result1['lname']."'></td>
		</tr>
		<tr>
			<td>Mobile No.</td>
			<td>:<input type='text' name='mobile' value='".$result1['mobile']."'></td>
		</tr>
		<tr>
			<td>Address</td>
			<td>:<textarea rows=3 cols=30 name='address'>".$result1['address']."</textarea></td>
		</tr>
		<tr>
			<td>Date of Birth</td>
			<td>:<input type='text' name='dob' value='".$result1['dob']."'></td>
		</tr>
		<tr>
			<td>Gender</td>
			<td>:<input type='text' name='gender' value='".$result1['gender']."'></td>
		</tr>
		<tr>
			<td>E_id</td>
			<td>:<input type='text' name='eid' value='".$result2['eid']."' disabled></td>
		</tr>
		<tr>
			<td>Semester</td>
			<td>:<input type='text' name='semester' value='".$result2['semester']."'></td>
		</tr>
		<tr>
			<td>Department</td> 
			<td>:<input type='text' name='department' value='".$result2['department']."'></td>
		</tr>
		<tr>
			<td>College</td>
			<td>:<input type='text' name='college' value='".$result2['college']."'></td>
		</tr>
		<tr>
			<td>College code</td>
			<td>:<input type='text' name='college_code' value='".$result2['college_code']."'></td>
		</tr>
		<tr>
			<td><input type='submit' name='mybutton' value='Delete'></td>
			<td>:<input type='submit' name='mybutton' value='Update'></td>
		</tr>";

		?>
	</table>
</form>
</center>
<footer id="page_footer" style="clear:both;padding:10px;text-align:center;position: fixed;left: 0;bottom: 0;background-color: orange;color: white;font-weight: bolder;width: 100%">
				Developed by, Shinojiya Parth Kishorbhai (160470116050)
	</footer>
</body>
</html>