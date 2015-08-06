package servlets.paciente;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.PacienteStub;
import negocio.PacienteStub.ReservarHoraAps;
import negocio.PacienteStub.ReservarHoraApsResponse;

/**
 * Servlet implementation class ReservarHoraAps
 */
public class SReservarHoraAps extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SReservarHoraAps() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idHoraMedicaAPS = Integer.parseInt(request.getParameter("idHoraMedicaAPS"));
		int idPaciente = Integer.parseInt(request.getParameter("idPaciente"));
		
		PacienteStub pSt = new PacienteStub();

		ReservarHoraAps stReservarHoraAps = new ReservarHoraAps();
		stReservarHoraAps.setIdHoraMedicaAps(idHoraMedicaAPS);
		stReservarHoraAps.setIdPaciente(idPaciente);
		
		ReservarHoraApsResponse reservarHoraApsResp = pSt
				.reservarHoraAps(stReservarHoraAps);

		String s = reservarHoraApsResp.get_return();

		response.getWriter().append(s);
	}

}
