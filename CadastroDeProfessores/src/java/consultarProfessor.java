/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Rafael.Soares
 */
public class consultarProfessor extends HttpServlet {

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
            
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            
            String nome = request.getParameter("nome");
            String sobrenome = request.getParameter("sobrenome");
            String disciplina = request.getParameter("disciplina");
            
            Criteria c = sessao.createCriteria(Professor.class);
            
            if(nome != null && !nome.trim().equals("")){
                c.add(Restrictions.eq("nome", nome));
            }
            if(sobrenome != null && !sobrenome.trim().equals("")){
                c.add(Restrictions.eq("sobrenome", sobrenome));
            }
            if(disciplina != null && !disciplina.trim().equals("")){
                c.add(Restrictions.eq("disciplina", disciplina));
            }
            
            List<Professor> result = c.list();
            if(result != null && result.size() > 0) {
                for(Professor prof : result){
                    out.println("<br><a href=\"formEditar?nome="+ prof.getNome() + "\">editar</a>  : " + prof.getNome() + " "+ prof.getSobrenome()) ;
                }
            } else {
                out.println("Nenhum resultado encontrado para esse criterio de busca: " + nome + "|" + sobrenome + "|" + disciplina);
            }
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
