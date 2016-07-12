<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html> 
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="./resources/app/css/bootstrap.min.css" rel="stylesheet"> 
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.7/angular.min.js"></script> 

</head> 
<body>
<div id="container">
<div class="row">
	<div class="col-md-2">
		<p>Hello: ${greeting}</p>
		<p>
			<label>Skriv ditt Namn h�r:</label> 
			<input type="text" class="form-control" ng-model="name" /> 
		</p>
		 <!-- ng-model �r v�r data, det vi vill visa, det intressanta. Textrutan binds till v�r model som binds till v�r HTML -->
		 <hr> <h1>Hej {{name}}!</h1> 
		  <!-- ng-model skrivs ut h�r. Kallas f�r directive --> 
	</div>
</div>
</div>
    <script src="./resources/app/js/bootstrap.min.js"></script> 
    <script src="./resources/app/js/app.js"></script>
 </body> 
 </html>