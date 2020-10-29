import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Au
 */
public class servlet extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        double answer;
        double numOne = Double.parseDouble(request.getParameter("NumOne"));
        double numTwo = Double.parseDouble(request.getParameter("NumTwo"));
        if (request.getParameter("add") != null) {
            request.setAttribute("symbol", "+");
            answer = numOne + numTwo;
            request.setAttribute("answer", answer);
        }
        else if (request.getParameter("sub") != null) {
            request.setAttribute("symbol", "-");
            answer = numOne - numTwo;
            request.setAttribute("answer", answer);
        }
        else if (request.getParameter("mul") != null) {
            request.setAttribute("symbol", "*");
            answer = numOne * numTwo;
            request.setAttribute("answer", answer);
        }
        else {
            request.setAttribute("symbol", "/");
            if (numTwo == 0.0) request.setAttribute("answer", "Error divide by 0");
            else {
            answer = numOne / numTwo;
            request.setAttribute("answer", answer); }
        }
        request.getRequestDispatcher("/result.jsp").forward(request, response);
        return;
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
