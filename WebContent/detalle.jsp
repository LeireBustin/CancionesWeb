<%@page import="com.ipartek.formacion.canciones.pojo.Cancion"%>
<%@page import="java.util.ArrayList"%>

<h1>Detalle cancion</h1>
<%
	//recoger atributos
	String nombre;
	ArrayList<Cancion> canciones = (ArrayList<Cancion>) request.getAttribute("nombre");//
%>

<%=canciones%>


<hr>
<ol>
	<%
		for (Cancion c : canciones) {
	%>

	<li><%=c.getTitulo()%> - <%=c.getArtista()%> <b><%=c.getDuracion()%></b></li>

	<%
		}
	%>
</ol>

<h2>Crear cancion</h2>

<form action="crear" method="post">

	<input type="text" name="nombre" placeholder="Nombre de la cancion" required>
	<!PLACEHOLDER pista pal user>

	<input type="submit" value="crear cancion nueva">
	

</form>

</h2>