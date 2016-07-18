<%-- 
    Document   : login
    Created on : 18-lug-2016, 15.09.05
    Author     : javamdl
--%>
<%@page import="model.Cliente" %>
<%@page import="model.ClienteDAL" %>


<!--
<script>
var foo = '${somebean.someproperty}';
doSomething(foo);

var bar = '<%--= somepagevariable --%>';
doSomething(bar);
</script>
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Biglietteria</title>
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">
                <!-- jQuery Version  -->
        <script   src="https://code.jquery.com/jquery-2.2.4.min.js"   
        integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44="   crossorigin="anonymous"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
        <script src="js/myscript.js" />


    </head>
    <body>
        <%
    if (request.getParameter("login") != null) {
        ClienteDAL dal = new ClienteDAL();
        Cliente cli = dal.LoginWithCodCliente(request.getParameter("codCliente"));

        /*out.println(request.getParameter("email"));
                out.println(request.getParameter("pw"));
                out.println(acc);*/
        if (cli != null) {
            session.setAttribute("cliente", cli);
            response.sendRedirect("index.jsp");
        } else {
        // When the user clicks the button, open the modal
        %>
          <script>
              $(document).ready(function() {
    function showModal( testo) {
          $('#messageSpan').text(testo);
         modal.style.display = "block";
        };
            var message = '<%=request.getParameter("codCliente")%>';
                showModal(message);
});
        
            
        </script>
            <%
        }

    }

%>
        <header>
            <div id="header">
                <%@include file="header.jsp" %>               
            </div>
        </header>
        <nav id="nav" class="navbar navbar-inverse navbar-fixed-top " role="navigation">
            <div class="container">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index.jsp">Biglietteria OnLine</a>
                </div>
                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <%@include file="nav.jsp" %>
                </div>
            </div>
        </nav>
        <!-- Page Content -->
        <div class="container" id="corpo">

            <div class="row">
                <div class="col-lg-12 text-center">
                    <ul class="list-unstyled">
                        <form action="login.jsp" method="post">
                            Codice Cliente:
                            <input name="codCliente" type="text" >
                            <input type="submit" name="login" value="login">

                        </form>

                    </ul>

                </div>

            </div>
            <!-- /.row -->

        </div>
        <!-- /.container -->    

        <!-- The Modal -->
        <!-- Trigger/Open The Modal -->
<button id="myBtn">Open Modal</button>

<!-- The Modal -->
<div id="myModal" class="modal">

  <!-- Modal content -->
  <div class="modal-content">
    <span class="close">×</span>
    <span id='messageSpan' ></span>
  </div>

        <footer id="footer" class="footer navbar-inverse navbar-fixed-bottom">
            <%@include file="footer.jsp" %>             
        </footer>



    </body>
</html>
