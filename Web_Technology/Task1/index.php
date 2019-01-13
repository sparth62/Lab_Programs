<!DOCTYPE html>
<html>
<head>
	<title>Welcome</title>
	<style type="text/css">
		#signup input { margin-bottom: 6px; }
	</style>
</head>
<body>
	<header style="background-color: orange;padding: 3px; float: right;clear: both;width: 100%">
			<img src="images/logo.png" style="width: 80px;height: 80px; margin-bottom: 0px; vertical-align: middle;">
			
			<h1 style="color: white;display: inline;font-family: sans-serif; vertical-align: middle;">Try Something New</h1>
			<div style="clear:both;float: right;">
			<form method="POST" action="info.php" style="display: inline;">
				<input type="email" name="mail1" placeholder="Enter Email" size=25 style="margin-bottom: 10px;">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="password" name="pass1" placeholder="Enter password (minimum 6 digit)" size="25" minlength="6" style="margin-bottom: 10px;" required>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="submit" name="signin" value="Sign in" style="color: orange; background-color: white; height: 35px; width: 100px; font-size: 16px;font-weight: bold;">
			</form>
		</div>
	</header>
	<div style="float: right;" id='signup'>
		<h1>Create account</h1>
		<h3>It's free and always will be.</h3>
		<form method="post" action="signin.php">
			<input type="text" name="fname" placeholder="First Name" />&nbsp;&nbsp;&nbsp;
			<input type="text" name="lname" placeholder="Surname" /><br />
			<input type="tel" name="mobile" placeholder="Mobile number" /><br />
			<input type="email" name="mail" placeholder="Email" /><br />
			<input type="password" name="pass" placeholder="Enter password (minimum 6 digit)" size="25" minlength="6" required><br />
			<textarea rows="3" cols="30" placeholder="Permenant address" name="address"></textarea><br />
			Date of Birth <input type="date" name="dob"><br />
			Gender&nbsp;&nbsp;&nbsp;<input type="radio" name="gender" value="m" checked>M&nbsp;&nbsp;&nbsp;<input type="radio" name="gender" value="f">F<br />
			<select style="margin-bottom: 6px;" name="semester">
				<option value="-1">Semester</option>
				<option value="1">1</option>
				<option value="2">2</option>
				<option value="3">3</option>
				<option value="4">4</option>
				<option value="5">5</option>
				<option value="6">6</option>
				<option value="7">7</option>
				<option value="8">8</option>
			</select><br />
			<select style="margin-bottom: 6px;" name="department">
				<option value="-1">Department</option>
				<option value="it">IT</option>
				<option value="it">CE</option>
				<option value="it">EC</option>
				<option value="it">EE</option>
			</select><br />
			<input type="text" name="college" placeholder="College"><br />
			<input type="text" name="college_code" placeholder="College code"><br />
			<input type="submit" name="signup" value="Sign up" style="color: white; background-color: orange; height: 50px; width: 150px;font-size: 16px;font-weight: bold;">
		</form>
	</div>
	<footer id="page_footer" style="clear:both;padding:10px;text-align:center;position: fixed;left: 0;bottom: 0;background-color: orange;color: white;font-weight: bolder;width: 100%">
				Developed by, Shinojiya Parth Kishorbhai (160470116050)
	</footer>
</body>
</html>