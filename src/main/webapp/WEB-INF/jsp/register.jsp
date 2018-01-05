<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Register</title>
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
                <li><a href="login1.html">登录</a></li>
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
            <h2>登记表</h2>
            <c:if test="${!empty error}">
                <font color="red"><c:out value="${error}"/></font>
            </c:if>
            <form action="<c:url value="/register_click.html" />" method="post">
                <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3 control-lable">姓名</label>
                        <div class="col-md-9">
                            <input type="text" name="userName"
                                   class="form-control input-sm" required/>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3 control-lable">密码</label>
                        <div class="col-md-9">
                            <input type="password" name="password"
                                   class="form-control input-sm" required/>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3 control-lable">手机号码</label>
                        <div class="col-md-9">
                            <input type="text" path="lastName" name="phone" class="form-control input-sm" required/>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3 control-lable">性别</label>
                        <div class="col-md-9" class="form-control input-sm">
                            <div class="radios">
                                <label class="label_radio">
                                    <input type="radio" name="sex" value="男" checked="" > 男
                                </label>
                                <label class="label_radio">
                                    <input value="女" name="sex" type="radio"> 女
                                </label>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3 control-lable">出生日期</label>
                        <div class="col-md-9">
                            <input type="text" path="dob" name="dob" class="form-control input-sm" required/>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3 control-lable">电子邮箱</label>
                        <div class="col-md-9">
                            <input type="text" path="email" name="email" class="form-control input-sm" required/>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3 control-lable">国家</label>
                        <div class="col-md-9">
                            <select path="country" name="country" class="form-control input-sm">
                                <option value="中国">选择</option>
                                <option value="日本">日本</option>
                                <option value="肯尼亚">肯尼亚</option>
                                <option value=迪拜"">迪拜</option>
                                <option value="意大利">意大利</option>
                                <option value="希腊">希腊</option>
                                <option value="冰岛">冰岛</option>
                                <option value="中国">中国</option>
                                <option value="多哈">多哈</option>
                                <option value="爱尔兰">爱尔兰</option>
                                <option value="斯里兰卡">斯里兰卡</option>
                                <option value="俄罗斯">俄罗斯</option>
                                <option value="香港">香港</option>
                                <option value="德国">德国</option>
                                <option value="加拿大">加拿大</option>
                                <option value="墨西哥">墨西哥</option>
                                <option value="尼珀尔">尼珀尔</option>
                                <option value="挪威">挪威</option>
                                <option value="阿曼">阿曼</option>
                                <option value="巴基斯坦">巴基斯坦</option>
                                <option value="科威特">科威特</option>
                                <option value="印度尼西亚">印度尼西亚</option>
                                <option value="西班牙">西班牙</option>
                                <option value="泰国">泰国</option>
                                <option value="沙特阿拉伯">沙特阿拉伯</option>
                                <option value="波兰">波兰</option>
                            </select>

                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3 control-lable">工作经验</label>
                        <div class="col-md-9">
                            <select path="country" name="work_time" class="form-control input-sm">
                                <option value="中国">选择</option>
                                <option value="新人">新人</option>
                                <option value="1年">1年</option>
                                <option value="2年">2年</option>
                                <option value="3年">3年</option>
                                <option value="4年">4年</option>
                                <option value="5年">5年</option>
                            </select>

                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3 control-lable">教育</label>
                        <div class="col-md-9">
                            <select path="country" name="jiaoyu" class="form-control input-sm">
                                <option value="Bsc">选择</option>
                                <option value="Bsc">Bsc</option>
                                <option value="技术学术">技术学术</option>
                                <option value="Mca">Mca</option>
                                <option value="BCA">BCA</option>
                                <option value="文凭">文凭</option>
                                <option value="其他">其他</option>
                            </select>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3 control-lable">自我介绍</label>
                        <div class="col-md-9 sm_1">
                            <textarea name="self_me" cols="77" rows="6" value=" " onfocus="this.value='';"
                                      onblur="if (this.value == '') {this.value = '';}" required> </textarea>

                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="form-actions floatRight">
                        <input type="submit" value="注 册" class="btn btn-primary btn-sm">
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
<div class="footer">
    <div class="container">
        <div class="col-md-3 grid_3">
            <h4>导航</h4>
            <ul class="f_list f_list1">
                <li><a href="index.html">主页面</a></li>
                <li><a href="login.html">登陆</a></li>
                <li><a href="login.html">加入我们</a></li>
                <li><a href="about.html">关于我们</a></li>
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