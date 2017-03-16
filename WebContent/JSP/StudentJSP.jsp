<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="java.util.*"%>
<%@ page import="Student.*"%>
<%@page import="java.util.HashMap"%>
<%@page import=" java.util.Iterator"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="styles/Style.css" />

     
<title>Data Entered</title>
</head>
<body>
<h1> Saved Form Data</h1>

<table align="center" border="1">
<tr><td><strong>Student Id:</strong><s:property value="stud_bean1.getStudentID()" /></td>
<td><strong>Name:</strong> <s:property value="stud_bean1.getFirstName()" /></td>
<td><strong>E-mail:</strong> <s:property value="stud_bean1.getEmail()" /></td>
<tr><td><strong>Telephone: </strong> <s:property value="stud_bean1.getTelephonenum()" /></td>
<td><strong>Street Address 1:</strong> <s:property value="stud_bean1.getStreet1()" /></td>
<td><strong>Street Address 2:</strong> <s:property value="stud_bean1.getStreet2()" /></td></tr>
<tr><td><strong>Zip Code:</strong> <s:property value="stud_bean1.getZip()" /></td>
<td><strong>City:</strong> <s:property value="stud_bean1.getCity()" /></td>
<td><strong>State:</strong> <s:property value="stud_bean1.getState()" /></td></tr>
<tr><td><strong>Date Of Survey:</strong> <s:property value="stud_bean1.getDate()" /></td>
<td><strong>Graduation Month:</strong> <s:property value="stud_bean1.getGradMonth()" /></td>
<td><strong>Graduation Year:</strong> <s:property value="stud_bean1.getYear()" /></td></tr>
<tr><td><strong>Data:</strong> <s:property value="stud_bean1.getData()" /></td>
<td><strong>Mean:</strong> <s:property value="stud_bean1.getMean()" /></td>
<td><strong>Standard Deviation:</strong> <s:property value="stud_bean1.getSd()" /></td></tr>
<tr><td><strong>How you got to our site:</strong> <s:property value="stud_bean1.getHowToSite()" /></td>
<td><strong>How likely you are to recommend GMU:</strong> <s:property value="stud_bean1.getLikelihood()" /></td>
<td><strong>What you like most about campus:</strong> <s:property value="stud_bean1.getLikeMost()" /></td></tr>
<tr><td><strong>URL:</strong> <s:property value="stud_bean1.getURL()" /></td>
<td><strong>Comments:</strong> <s:property value="stud_bean1.getComments()" /></td></tr>
</table>

</body>
</html>