package servlets.director;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import negocio.DirectorStub;
import negocio.DirectorStub.ObtenerMedicos;
import negocio.DirectorStub.ObtenerMedicosResponse;


/**
 * Servlet implementation class ObtenerMedico
 */
public class SObtenerMedico extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SObtenerMedico() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DirectorStub dSt = new DirectorStub();
		
		ObtenerMedicos stObtenerMed = new ObtenerMedicos();
		
		ObtenerMedicosResponse obtenerMedResponse = dSt.obtenerMedicos(stObtenerMed);
		
		String s = obtenerMedResponse.get_return();
		
		//request.setAttribute("Medicos", s);
		
		//getServletContext().getRequestDispatcher("/pMedicos.jsp").forward(request, response);
		
		response.getWriter().append(s);
	}

}
