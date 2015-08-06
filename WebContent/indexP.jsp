<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sistema de reservas</title>
</head>
<body>
<form action="ObtenerEspecialidades" method="GET">
<button type="submit">Ver Especialidades</button></form>

<form action="ObtenerMedico" method="GET">
<button type="submit">Ver Médicos</button></form>

<form action="BuscarHoraAps" method="GET">
<input type="hidden" value="1" name="idMedico">
<input type="hidden" value="01/01/1999 00:00:00" name="fecha1">
<input type="hidden" value="01/01/2016 00:00:00" name="fecha2">
<button type="submit">Buscar Hora APS</button></form>

<form action="ObtenerMedicosDeUnaEspecialidad" method="GET">
<input type="hidden" value="1" name="idEspecialidad">
<button type="submit">Obtener Médicos de una Especialidad</button></form>

<form action="ObtenerBox" method="GET">
<button type="submit">Ver Boxs</button></form>
</body>
</html>