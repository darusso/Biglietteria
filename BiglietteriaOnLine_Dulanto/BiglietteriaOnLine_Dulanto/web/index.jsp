<!DOCTYPE html>

<html>
    <head>
        <title>Biglietteria OnLine</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
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
                    <a class="navbar-brand" href="#">Biglietteria OnLine</a>
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
                        <%@include file="corpo.jsp" %>
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
<script   src="https://code.jquery.com/jquery-2.2.4.min.js"   integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44="   crossorigin="anonymous"></script>
        <!-- Bootstrap Core JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>


    </body>


</html>
