package servlets.paciente;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.PacienteStub;
import negocio.PacienteStub.ObtenerEspecialidad;
import negocio.PacienteStub.ObtenerEspecialidadResponse;

/**
 * Servlet implementation class ObtenerEspecialidades
 */
//@WebServlet(name = "ObtenerEspecialidades", urlPatterns = { "/paciente/ObtenerEspecialidades" })
public class SObtenerEspecialidades extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SObtenerEspecialidades() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PacienteStub pSt = new PacienteStub();
		
		ObtenerEspecialidad stObtenerEsp = new ObtenerEspecialidad();
		
		ObtenerEspecialidadResponse obtenerEspResponse = pSt.obtenerEspecialidad(stObtenerEsp);
		
		String s = obtenerEspResponse.get_return();
		
		//request.setAttribute("Especialidades", s);
		
		//getServletContext().getRequestDispatcher("/pEspecialidades.jsp").forward(request, response);
		response.getWriter().append(s);
	}

}
