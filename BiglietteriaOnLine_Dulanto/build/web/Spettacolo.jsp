<%-- 
    Document   : SpettacoloDAL
    Created on : 18-lug-2016, 17.32.17
    Author     : javamdl
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.SpettacoloDAL"%>
<%@page import="model.Spettacolo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spettacoli Biglietteria</title>
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">


    </head>
    <body>

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
                            
                        <div class="grid">
                            <table class="table">
    <tr>
             <td>Prodotto</td>
             <td>Descrizione</td>
             <td>Prezzo</td>
             <td>Qta &AMP; Acquista</td>               
    </tr>
    <%
        
      
            SpettacoloDAL dal=new SpettacoloDAL();
            ArrayList<Spettacolo> listaSpett =dal.getAllSpettacolo();
            
            
            for(Spettacolo spettac : listaSpett){
                
         %>
         <tr>
             <td><%= spettac.getCodSpettacolo() %></td>
             <td><%= r.getString("descrizione") %></td>
             <td><%= r.getDouble("prezzo") %></td>
             <td>
                 <form method="post" action="inserisci.jsp">
                    <input type="number" name="qt" value="1"/>
                    <input type="hidden" name="pid"  value="<%=r.getInt(1)%>"/>             
                    <input type="submit" name="ordina" value="buy">
                 </form>
             </td>
             
         </tr>         
         <!--
         <tr>
             <td><%= r.getString(2) %></td>
             <td><%= r.getString(3) %></td>
             <td><%= r.getDouble(4) %></td>
             <td>
                 <input type="number" name="qt" value="1"/>
             </td>
         </tr>
         -->
        <%}
       

        %>
    
</table>

                            
                            
                        </div>
                    </ul>

                </div>

            </div>
            <!-- /.row -->
            
        </div>
        <!-- /.container -->    
        

            
        <footer id="footer" class="footer navbar-inverse navbar-fixed-bottom">
            <%@include file="footer.jsp" %>             
        </footer>

                <!-- jQuery Version  -->
        <script   src="https://code.jquery.com/jquery-2.2.4.min.js"   
        integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44="   crossorigin="anonymous"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
        <script src="js/myscript.js" />


    </body>
</html>