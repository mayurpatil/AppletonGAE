<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MainPage</title>
</head>
<body background="C:/Users/Karan/workspace/MyProject/IMAGES/h.jpg">
<%!public int flag=0;%>
<form action="FinancialApp" name="f1" method=post>
<center>
<table cellpadding=8 cellspacing=8 border="10" bgcolor="transparent">
<tr>
<th bgcolor="white" colspan=2>
<font size=10 face="Times New Roman" color=black>FINANCIAL APPLICATION </font>
</th> 
</tr>
<tr>
 
</tr>
</table>
</center>
</form>
<center>
<br><br>
<input type="button"value="           Annuity for an Investment          "onclick="window.location='AfI.jsp'" ><br><BR>
 <input type="button"value="          Investment for an Annuity          "onclick="window.location='IfA.jsp'" ><br><BR>
 <input type="button"value="                CLOSE                     "onclick="window.close()" ><br><BR>

</center>
</body>
</html>