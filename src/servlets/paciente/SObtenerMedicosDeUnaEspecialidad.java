package servlets.paciente;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.PacienteStub;
import negocio.PacienteStub.ObtenerMedicosDeUnaEspecialidad;
import negocio.PacienteStub.ObtenerMedicosDeUnaEspecialidadResponse;

/**
 * Servlet implementation class ObtenerMedicosDeUnaEspecialidad
 */
public class SObtenerMedicosDeUnaEspecialidad extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SObtenerMedicosDeUnaEspecialidad() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int idEsp = Integer.parseInt(request.getParameter("idEspecialidad"));
		
		PacienteStub stPac = new PacienteStub();
		ObtenerMedicosDeUnaEspecialidad obtMedEsp = new ObtenerMedicosDeUnaEspecialidad();
		
		obtMedEsp.setIdEspecialidad(idEsp);
		
		ObtenerMedicosDeUnaEspecialidadResponse respObtMedEsp = stPac.obtenerMedicosDeUnaEspecialidad(obtMedEsp);
		String s = respObtMedEsp.get_return();
		
		response.getWriter().append(s);
	}

}
