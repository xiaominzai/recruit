<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Resume</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="keywords" content="Seeking Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design"/>
    <script type="application/x-javascript"> addEventListener("load", function () {
        setTimeout(hideURLbar, 0);
    }, false);

    function hideURLbar() {
        window.scrollTo(0, 1);
    } </script>
    <link href="css/bootstrap-3.1.1.min.css" rel='stylesheet' type='text/css'/>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <!-- Custom Theme files -->
    <link href="css/style.css" rel='stylesheet' type='text/css'/>
    <link href='http://fonts.useso.com/css?family=Roboto:100,200,300,400,500,600,700,800,900' rel='stylesheet'
          type='text/css'>
    <!----font-Awesome----->
    <link href="css/font-awesome.css" rel="stylesheet">
    <!----font-Awesome----->
</head>
<body>
<nav class="navbar navbar-default" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                    data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="index.html"><img src="images/logo.png" alt=""/></a>
        </div>
        <!--/.navbar-header-->
        <div class="navbar-collapse collapse" id="bs-example-navbar-collapse-1" style="height: 1px;">
            <ul class="nav navbar-nav">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">工作类型<b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">IT·互联网</a></li>
                        <li><a href="#">房地产</a></li>
                        <li><a href="#">金融</a></li>
                        <li><a href="#">消费品</a></li>
                        <li><a href="#">汽车·制造</a></li>
                        <li><a href="#">医疗·化工</a></li>
                    </ul>
                </li>
                <li><a href="login1.html">登陆</a></li>
                <li><a href="resume.html">上传简历</a></li>
            </ul>
        </div>
        <div class="clearfix"></div>
    </div>
    <!--/.navbar-collapse-->
</nav>
<div class="banner_1">
    <div class="container">
        <div id="search_wrapper1">
            <div id="search_form" class="clearfix">
                <h1>开始你的寻工之旅...</h1>
                <p>
                    <input type="text" class="text" placeholder=" " value="Enter Keyword(s)" onfocus="this.value = '';"
                           onblur="if (this.value == '') {this.value = 'Enter Keyword(s)';}">
                    <input type="text" class="text" placeholder=" " value="Location" onfocus="this.value = '';"
                           onblur="if (this.value == '') {this.value = 'Location';}">
                    <label class="btn2 btn-2 btn2-1b"><input type="submit" value="寻找工作"></label>
                </p>
            </div>
        </div>
    </div>
</div>
<div class="container">
    <div class="single">
        <div class="form-container">
            <h2>上传你的简历</h2>
            <div class="search_form1">
                <c:if test="${!empty error}">
                    <font color="red"><c:out value="${error}"/></font>
                </c:if>
                <form action="<c:url value="/jianli.html" />" method="post" enctype="multipart/form-data">

                    <input type="text" name="name" class="text"><br>
                    <input type="file" name="file">
                    <input type="submit" value="提交简历">
                </form>
            </div>
        </div>
    </div>
</div>
<div class="footer">
    <div class="container">
        <div class="col-md-3 grid_3">
            <h4>导航</h4>
            <ul class="f_list f_list1">
                <li><a href="#">主页面</a></li>
                <li><a href="#">登陆</a></li>
                <li><a href="#">加入我们</a></li>
                <li><a href="#">关于我们</a></li>
            </ul>
            <ul class="f_list">
                <li><a href="#">详情</a></li>
                <li><a href="#">使用条款</a></li>
                <li><a href="#">联系我们</a></li>
                <li><a href="#">发布工作</a></li>
            </ul>
            <div class="clearfix"></div>
        </div>
        <div class="col-md-3 grid_3">
            <h4>友情链接</h4>
            <div class="footer-list">
                <ul>
                    <li><i class="fa fa-twitter tw1"> </i>
                        <p><span class="yellow"><a href="#">领英招聘网</a></span> 点击跳转</p></li>
                    <li><i class="fa fa-twitter tw1"> </i>
                        <p><span class="yellow"><a href="#">58同城招聘网</a></span> 点击跳转</p></li>
                    <li><i class="fa fa-twitter tw1"> </i>
                        <p><span class="yellow"><a href="#">赶集网招聘网</a></span> 点击跳转</p></li>
                </ul>
            </div>
        </div>
        <div class="col-md-3 grid_3">
            <h4>寻找</h4>
            <p>我们正在寻找志同道合的你加入我们公司，如果你有兴趣，请在最右注册我们的通讯录，成为我们当中的一员。了解我们更多的故事，正在等待你的到来！</p>
        </div>
        <div class="col-md-3 grid_3">
            <h4>注册会员</h4>
            <p>请填写你的邮箱</p>
            <form>
                <input type="text" class="form-control" placeholder="Enter your email">
                <button type="button" class="btn red">订阅我们！</button>
            </form>
        </div>
        <div class="copy">
            <p>Copyright &copy; 2018.小小小小小模仿团队.</p>
        </div>
        <div class="clearfix"></div>
    </div>
</div>
</body>
</html>	