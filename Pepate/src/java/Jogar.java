
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ra21606437
 */
public class Jogar extends HttpServlet {

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

            String opcoes[] = {"pedra", "papel", "tesoura", "spock", "lagarto"};
            int numeroAleatorio = new Random().nextInt(5);
            String opcao = opcoes[numeroAleatorio];
            String escolha = request.getParameter("escolha");
            String resultado = "Empatou";

            if (opcao.equals("pedra")) {
                if (escolha.equals("tesoura") || escolha.equals("lagarto")) {
                    resultado = "Perdeu";
                } else if (escolha.equals("spock") || escolha.equals("papel")) {
                    resultado = "Ganhou";
                }
            }
            if (opcao.equals("papel")) {
                if (escolha.equals("pedra") || escolha.equals("spock")) {
                    resultado = "Perdeu";
                } else if (escolha.equals("lagarto") || escolha.equals("tesoura")) {
                    resultado = "Ganhou";
                }
            }
            if (opcao.equals("tesoura")) {
                if (escolha.equals("papel") || escolha.equals("lagarto")) {
                    resultado = "Perdeu";
                } else if (escolha.equals("spock") || escolha.equals("pedra")) {
                    resultado = "Ganhou";
                }
            }
            if (opcao.equals("spock")) {
                if (escolha.equals("pedra") || escolha.equals("tesoura")) {
                    resultado = "Perdeu";
                } else if (escolha.equals("lagarto") || escolha.equals("papel")) {
                    resultado = "Ganhou";
                }
            }
            if (opcao.equals("lagarto")) {
                if (escolha.equals("papel") || escolha.equals("spock")) {
                    resultado = "Perdeu";
                } else if (escolha.equals("tesoura") || escolha.equals("pedra")) {
                    resultado = "Ganhou";
                }
            }

            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Jogar</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Voce escolheu: " + escolha + "</h1>");
            out.println("<h2>Eu escolhi: " + opcao + "</h2>");
            out.println("<h3>Voce:  " + resultado + "</h3>");
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
