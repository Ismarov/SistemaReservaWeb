package servlets.director;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.DirectorStub;
import negocio.DirectorStub.ObtenerBoxs;
import negocio.DirectorStub.ObtenerBoxsResponse;
import negocio.DirectorStub.ObtenerMedicos;
import negocio.DirectorStub.ObtenerMedicosResponse;

/**
 * Servlet implementation class ObtenerBox
 */
public class SObtenerBox extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SObtenerBox() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DirectorStub dSt = new DirectorStub();
		
		ObtenerBoxs stObtenerBox = new ObtenerBoxs();
		
		ObtenerBoxsResponse obtenerBoxResponse = dSt.obtenerBoxs(stObtenerBox);
		
		String s = obtenerBoxResponse.get_return();
		
		response.getWriter().append(s);
	}

}
