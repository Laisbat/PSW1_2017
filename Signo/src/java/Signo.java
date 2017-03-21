import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ra21606437
 */
public class Signo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String dtNascimento = request.getParameter("nasc");
            System.out.println(dtNascimento);
            //TODO: Criptografar o texto recebido

            
            
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Signo </title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Sua data de nascimento é: " + dtNascimento + "</h1>");
            out.println("<h1>Seu Signo é: " + SignoMain.verificaSigno(dtNascimento) + "</h1>");
            
            if(SignoMain.verificaSigno(dtNascimento) == Signos.AQUARIO){
                out.println("<img src=\"http://vignette1.wikia.nocookie.net/saintseya/images/b/b7/Mu_De_%C3%81ries.jpg/revision/latest?cb=20131126151046&path-prefix=pt\">");
            }
             if(SignoMain.verificaSigno(dtNascimento) == Signos.ARIES){
                out.println("<img src=\"http://vignette1.wikia.nocookie.net/saintseya/images/b/b7/Mu_De_%C3%81ries.jpg/revision/latest?cb=20131126151046&path-prefix=pt\">");
            }
             
            out.println("</body>");
            out.println("</html>");
        }
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
