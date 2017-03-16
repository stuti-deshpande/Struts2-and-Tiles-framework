<%@page import="Student.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import=" java.util.*"%>
<%@page import="java.util.HashMap"%>
<%@page import=" java.util.Iterator"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel = "stylesheet" type = "text/css" href = "styles/Style.css" />

    	
<title>Simple Acknowledgement</title>
</head>
<body>
	<h1>Acknowledgement</h1>
	

	<h2>Thank you for participating in the survey.</h2>

	<h3>
		<strong>Mean: </strong><s:property value="datab.getMean()"/>
	</h3>
	<h3>
		<strong>Standard Deviation: </strong><s:property value="datab.getSd()"/>
	</h3>
	<h3>
	Click on the Student ID's below to retreive the saved form data.
	</h3>
	<h3>
	<s:iterator value="id_string" >
	<a href="/Assignment05/list?id=<s:property/>"><s:property/></a>
	</s:iterator>
	</h3>
</body>
</html>
