<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
<head>
<style type="text/css">
body {
	background: #F5F5F5;
	text-align: center;
}

table {
	text-align: center;
	margin: 0px auto;
}
th {
	background-color: silver;
}
</style>
<script type="text/javascript" src="${app}/js/jquery-1.4.2.js"></script>
<script type="text/javascript">
$(function(){
	//选择对应的输入框，并绑定失去焦点的事件
	$("input[name='pnum']").blur(function(){
		//获取输入框中内容
		var pnum = $(this).val();
		//获取当前商品对应的“旧的值”
		var oldPnum = $(this).next().val();
		//判断值是否被修改了
		if(pnum!=oldPnum){
			//判断修改后的值是否为正整数
			var reg = /^[1-9][0-9]*$/;
			if(!reg.test(pnum)){//不合法
				alert("请输入正确的数字");
				//还原原值
				$(this).val(oldPnum);
			}else{//异步提交数据
				//获取商品id ，修改输入框，添加属性id="${prod.id}"
				var pid = $(this).attr("id");
				var $oph = $(this).next();
				$.post("${app}/servlet/BackAjaxChangePnumServlet",{"pid":pid,"pnum":pnum},function(result){
					if("true" == result){
						alert("数量修改成功！");
						//修改隐藏域中的值
						$oph.val(pnum);
					}else{
						alert("数量修改失败");
					}
				});
			}
		}
	});
	
	$(".delete").click(function(){
		var id = $(this).parent().prev().prev().children("input[type='text']").attr("id");
		if(confirm("确认删除")){
			window.location.href = "${app}/servlet/BackProdDeleteServlet?id="+id;
		}
	});
});
</script>
</head>
<body>
	<h1>商品管理</h1>
	<a href="${app}/back/prod_add.jsp">添加商品</a>
	<hr>
	<table bordercolor="black" border="1" width="95%" cellspacing="0px" cellpadding="5px">
		<tr>
			<th>商品图片</th>
			<th>商品id</th>
			<th>商品名称</th>
			<th>商品种类</th>
			<th>商品单价</th>
			<th>库存数量</th>
			<th>描述信息</th>
			<th>操作</th>
		</tr>
	<c:forEach items="${requestScope.list}" var="prod">
		<tr>
			<td><img width="120px" height="120px" src="${app}/servlet/ProdImgServlet?imgurl=${prod.imgurl}"/></td>
			<td>${prod.id }</td>
			<td>${prod.name }</td>
			<td>${prod.category }</td>
			<td>${prod.price}</td>
			<td><input id="${prod.id}" name="pnum" type="text" value="${prod.pnum }" style="width: 50px"/>
				<input type="hidden" value="${prod.pnum }"> 
			</td>
			<td>${prod.description}</td>
			<td><a href="javascript:void(0)" class="delete">删除</a></td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>
