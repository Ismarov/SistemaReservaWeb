package servlets.director;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.DirectorStub;
import negocio.DirectorStub.ObtenerPorcentajeOcupacionBox;
import negocio.DirectorStub.ObtenerPorcentajeOcupacionBoxResponse;

/**
 * Servlet implementation class ObtenerPorcentajeOcupacionBox
 */
public class SObtenerPorcentajeOcupacionBox extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SObtenerPorcentajeOcupacionBox() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Date f1 = new Date(request.getParameter("fecha1"));
		
		Date f2 = new Date(request.getParameter("fecha2"));
		
		int idBox = Integer.parseInt(request.getParameter("idBox"));
		
		DirectorStub dSt = new DirectorStub();
		
		ObtenerPorcentajeOcupacionBox stObtenerPorBox = new ObtenerPorcentajeOcupacionBox();
		
		stObtenerPorBox.setF1(f1);
		stObtenerPorBox.setF2(f2);
		stObtenerPorBox.setBoxId(idBox);
		
		ObtenerPorcentajeOcupacionBoxResponse obtenerPorcBoxResp = dSt.obtenerPorcentajeOcupacionBox(stObtenerPorBox);
		
		int s = obtenerPorcBoxResp.get_return();
		response.getWriter().append(String.valueOf(s));
		
		
	}

}
