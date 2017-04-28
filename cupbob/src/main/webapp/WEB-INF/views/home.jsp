<%@page import="com.spring.dto.MemberDTO"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%
	List<MemberDTO> list = (List<MemberDTO>)request.getAttribute("list");
%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<%
	for(MemberDTO a : list){
		out.println(a.getMem_name());

	}
%>
<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
