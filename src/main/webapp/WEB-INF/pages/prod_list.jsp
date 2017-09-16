<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
  <head>
    <title>全部商品</title>
 	<link href="${ app }/staticfile/css/prodList.css" rel="stylesheet" type="text/css">
</head>
<body>
<%@include file="_head.jsp" %>
	<div id="content">
		<div id="search_div">
			<form method="post" action="${ app }/prodlist">
				<span class="input_span">商品名：<input type="text" name="nameStr" value="${name}"/></span>
				<span class="input_span">商品种类：<input type="text" name="cateStr" value="${cate }"/></span>
				<span class="input_span">商品价格区间：<input type="text" name="minpriceStr" value="${min}"/> -
				<input type="text" name="maxpriceStr" value="${max }"/></span>
				<input type="submit" value="查询">
			</form>
		</div>
		<div id="prod_content">
	<c:forEach items="${requestScope.list}" var="prod">
			<div id="prod_div">
				<a href="${ app }/servlet/ProdInfoServlet?id=${prod.id}">
				<img src="${ app }/servlet/ProdImgServlet?imgurl=${prod.imgurl}"></img>
				</a>
				<div id="prod_name_div">
				<a href="${ app }/prodinfo?id=${prod.id}">
					${prod.name}
				</a>
				</div>
				<div id="prod_price_div">
					￥${prod.price}元
				</div>
				<div>
					<div id="gotocart_div">
						<a href="${ app }/servlet/CartAddServlet?id=${prod.id}">加入购物车</a>
					</div>					
					<div id="say_div">
						库存：${prod.pNum }
					</div>					
				</div>
			</div>
		</c:forEach>
		</div>
		<div style="clear: both"></div>
	</div>
<%@include file="_foot.jsp" %>
</body>
</html>
