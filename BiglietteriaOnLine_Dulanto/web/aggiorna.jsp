<%-- 
    Document   : aggiorna
    Created on : 19-lug-2016, 9.57.25
    Author     : javamdl
--%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<h1>Update On Work...</h1>
<%
    int numeroRighe = 0;

    try {
        numeroRighe = Integer.parseInt(request.getParameter("righe"));
    } catch (NullPointerException e) {
        numeroRighe = 0;
    } catch (NumberFormatException e) {
        numeroRighe = 0;
    }

    Biglietto biglietto = null;

    if (session.getAttribute("biglietto") == null) {
        biglietto = new Biglietto();
    } else {
        biglietto = (Biglietto) session.getAttribute("biglietto");
    }
    String codClient= request.getParameter("clienteCodice");
    String codReplica= request.getParameter("codReplica");
    
    /*
    GregorianCalendar data=new GregorianCalendar();
    SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    String d=sdf.format(data.getTime());
    Date dataOraPrenotazione= new Date(d);
    */
    
    
    String TipoPagamento = request.getParameter("tipoPagamento").equals("0") ? "Carta di Credito" : "Bonifico";
    int quantita = Integer.parseInt(request.getParameter("qt"));
    
    String codTeatro ="T001";
    
    TeatroDAL dalTeatro=new TeatroDAL();
    Teatro teatro=dalTeatro.getTeatroByCodTeatro(codTeatro);
    
    BigliettoDAL dal=new BigliettoDAL();
    dal.PrenotaBiglietto(codClient, codReplica, TipoPagamento, quantita);


%>


