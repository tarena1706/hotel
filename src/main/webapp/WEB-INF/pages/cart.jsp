<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>我的购物车</title>
  	<link href="${ app }/staticfile/css/cart.css" rel="stylesheet" type="text/css">
	<script type="text/javascript" src="${ app }/staticfile/js/jquery-1.4.2.js"></script>
	<script>
	$(function(){
		$(".prodDel").click(function(){
			if(confirm("确定删除？")){
				var id = $(this).parent().prev().prev().children("input[type='text']").attr("id");
				location.href="${ app }/servlet/CartDeleteServlet?id="+id;
			}
		});
		$(".delNum").click(function(){
			var id = $(this).next().attr("id");
			var pnum = $(this).next().val();
			pnum = parseInt(pnum) - 1;
			if(pnum>0){
				location.href="${ app }/servlet/CartEditServlet?id="+id+"&pnum="+pnum;
			}else{
				location.href="${ app }/servlet/CartDeleteServlet?id="+id;
			}
		});
		$(".addNum").click(function(){
			var id = $(this).prev().attr("id");
			var pnum = $(this).prev().val();
			pnum = parseInt(pnum) + 1;
			location.href="${ app }/servlet/CartEditServlet?id="+id+"&pnum="+pnum;
		});
		$(".buyNumInp1").blur(function(){
			var id = $(this).attr("id");
			var oldPnum = $("#hid_"+id).val();
			var newPnum = $(this).val();
			if(newPnum==0){
				location.href="${ app }/servlet/CartDeleteServlet?id="+id;
			}else if(newPnum!=oldPnum){
				var reg = /^[1-9][0-9]*$/;
				if(!reg.test(newPnum)){
					alert("请输入正确的数字!");
					$(this).val(oldPnum);
				}else{
					location.href="${ app }/servlet/CartEditServlet?id="+id+"&pnum="+newPnum;
				}
			}
		});
	});
	</script>
</head>
<body>
<%@include file="_head.jsp" %>
	<div class="warp">
	<h1 style='text-align:center;color:red'>${msg }</h1>"
		<!-- 标题信息 -->
	<div id="title">
		<input name="allC" type="checkbox" value="" onclick=""/>
		<span id="title_checkall_text">全选</span>
		<span id="title_name">商品</span>
		<span id="title_price">单价（元）</span>
		<span id="title_buynum">数量</span>
		<span id="title_money">小计（元）</span>
		<span id="title_del">操作</span>
	</div>
	<!-- 购物信息 -->
<c:set var="money" value="0"/>
<c:forEach items="${sessionScope.cart}" var="entry">
	<div id="prods">
		<input name="prodC" type="checkbox" value="" onclick=""/>
		<img src="${ app }/servlet/ProdImgServlet?imgurl=${entry.key.imgurl}" width="90" height="90" />
		<span id="prods_name">${entry.key.name }</span>
		<span id="prods_price">${entry.key.price }</span>
		<span id="prods_buynum"> 
			<input type="hidden" id="hid_${entry.key.id }" value="${entry.value }"></input>
			<a href="javascript:void(0)" class="delNum" >-</a>
			<input id="${entry.key.id }" class="buyNumInp1" type="text" value="${entry.value }" />
			<a href="javascript:void(0)" class="addNum" >+</a>
		</span>
		<span id="prods_money">${entry.key.price*entry.value}</span>
		<c:set var="money" value="${money+entry.key.price*entry.value}"/>
		<span id="prods_del"><a class="prodDel" href="javascript:void(0)">删除</a></span>
	</div>
</c:forEach>
	<!-- 总计条 -->
		<div id="total">
			<div id="total_1">
				<input name="allC" type="checkbox" value=""/> 
				<span>全选</span>
				<a id="del_a" href="#">删除选中的商品</a>
				<span id="span_1">总价：</span>
				<span id="span_2">￥${money }</span>
			</div>
			<div id="total_2">	
				<a id="goto_order" href="${ app }/order_add.jsp">去结算</a>
			</div>
		</div>
	</div>
<%@include file="_foot.jsp" %>
</body>
</html>