<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="">

    <title>로그인 화면</title>
    <!-- Bootstrap core CSS -->
    <link href="/resources/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="/resources/signin.css" rel="stylesheet">
  </head>
<script>
	
</script>
  <body class="text-center">
    <form class="form-signin" action="/emp/login" method="post">
      <img class="mb-4" src="/resources/bootstrap-solid.svg" alt="" width="72" height="72">
      <h1 class="h3 mb-3 font-weight-normal">정보를 입력하세요</h1>
      
      <select id="dept" name="dept" class="form-control">
      <c:forEach items="${deptList }" var="dept">
      <option value="${dept.DEPTNO}">${dept.DNAME}</option>
      
     </c:forEach>
      
     </select>
      
      <label for="inputEmail" class="sr-only">name</label>
      <input type="text" id="name" class="form-control" placeholder="사원명" required autofocus
      name="name">  
      
      <label for="inputPassword" class="sr-only">job</label>
      <input type="text" id="job" class="form-control" placeholder="직급" required
      name="job">   
        
       <label for="inputPassword" class="sr-only">mgr</label>
      <input type="text" id="mgr" class="form-control" placeholder="상사" required
      name="mgr">   
      
       <label for="inputPassword" class="sr-only">hiredate</label>
      <input type="date" id="hiredate" class="form-control" placeholder="입사일" required
      name="hiredate">
      
       <label for="inputPassword" class="sr-only">sal</label>
      <input type="text" id="sal" class="form-control" placeholder="급여" required
      name="sal">
   
      
       <label for="inputPassword" class="sr-only">id</label>
      <input type="id" id="id" class="form-control" placeholder="id" required
      name="id">
      
       <label for="inputPassword" class="sr-only">pwd</label>
      <input type="password" id="pwd" class="form-control" placeholder="Password" required
      name="pwd">
      
      
     
      <button class="btn btn-lg btn-primary btn-block" type="button" id="signinBtn">Sign up</button>
      <p class="mt-5 mb-3 text-muted">&copy; 2019</p>
    </form>
  </body>
</html>