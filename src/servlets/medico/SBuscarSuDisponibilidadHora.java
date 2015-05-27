package servlets.medico;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.MedicoStub;
import negocio.MedicoStub.BuscarSuDisponibilidadHora;
import negocio.MedicoStub.BuscarSuDisponibilidadHoraResponse;

/**
 * Servlet implementation class BuscarSuDisponibilidadHora
 */
public class SBuscarSuDisponibilidadHora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SBuscarSuDisponibilidadHora() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idMedico = Integer.parseInt(request.getParameter("idMedico"));
		@SuppressWarnings("deprecation")
		Date f1 = new Date(request.getParameter("fecha1"));
		@SuppressWarnings("deprecation")
		Date f2 = new Date(request.getParameter("fecha2"));
		
		MedicoStub mst = new MedicoStub();

		BuscarSuDisponibilidadHora stObtenerDispHor = new BuscarSuDisponibilidadHora();

		stObtenerDispHor.setIdMedico(idMedico);
		stObtenerDispHor.setF1(f1);
		stObtenerDispHor.setF2(f2);

		BuscarSuDisponibilidadHoraResponse obDispHorResponse = mst.buscarSuDisponibilidadHora(stObtenerDispHor);

		String s = obDispHorResponse.get_return();
		request.setAttribute("obDispHor", s);
		getServletContext().getRequestDispatcher("/mBuscarDisp.jsp")
				.forward(request, response);
	}

}
