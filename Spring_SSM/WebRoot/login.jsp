<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
	<style type="text/css">
		.title {
			margin: 10px auto;
		}
		.title h2{
			color: blue;
		}
		.table{
			margin-top: 20px;
		}
	</style>
	

  </head>
  
  <body>
  
		<div class="title">
			<h2 align="center">登录</h2>
		</div>
		<div class="table">
			<form action="login.action">
				<table align="center">
					
					<tr height="40px">
						<td>账号：</td>
						<td><input type="text" name="name" /></td>
					</tr>
					<tr height="40px">
						<td>密码：</td>
						<td><input type="password" name="pass" /></td>
					</tr>
				
					<tr height="40px">
						<td colspan="2" align="center">
							<input type="submit" value="登录" />
						</td>
					</tr>
				</table>
			</form>
		</div>

  </body>
</html>
