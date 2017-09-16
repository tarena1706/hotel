<%@page import="java.net.URLDecoder"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
	<head>
		<meta http-equiv="Content-type" content="text/html; charset=UTF-8" />
		<link rel="stylesheet" href="${ app }/staticfile/css/login.css"/>
		<title>EasyMall欢迎您登陆</title>
		<script type="text/javascript">
			window.onload = function(){
				var oUsername = document.getElementsByName("username")[0];
				oUsername.value = decodeURI("${ cookie.remname.value }");
			};
		</script>
		<script type="text/javascript" src="${ app }/staticfile/js/jquery-1.4.2.js"></script>
	</head>
	<body>
		<h1>欢迎登陆EasyMall</h1>
		<form action="${ app }/servlet/LoginServlet" method="POST">
			<table>
			<%--保存用户名--%>
				<tr>
					<td class="tdx" colspan="2" style="color:red;text-align:center">
						${ requestScope.msg }
					</td>
				</tr>
				<tr>
					<td class="tdx">用户名：</td>
					<td><input type="text" name="username" value="${ cookie.remname.value }"/></td>
				</tr>
				<tr>
					<td class="tdx">密&nbsp;&nbsp; 码：</td>
					<td><input type="password" name="password"/></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="checkbox" name="remname" value="true"
						${ cookie.remname==null?"" :"checked='checked'"};
						/>记住用户名
						<input type="checkbox" name="autologin" value="true"/>30天内自动登陆
					</td>
				</tr>
				<tr>
					<td colspan="2" style="text-align:center">
						<input type="submit" value="登 陆"/>
					</td>
				</tr>
			</table>
		</form>		
	</body>
</html>
