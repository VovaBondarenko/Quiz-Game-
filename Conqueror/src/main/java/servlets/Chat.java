package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import servlets.EmptyMessage ;

@WebServlet("/Chat")

public class Chat extends HttpServlet {

    public static ArrayList<String> list = new ArrayList<String>() ;
    String s ;

    public String getMassage(HttpServletRequest r) throws EmptyMessage{
        String s = r.getParameter("message") ;
        if (s=="" || s==null)
            throw new EmptyMessage() ;
        else  return s ;
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    //@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) {

        if (request.getParameter("type").equals("mes")) {

            try {
              String  message = getMassage(request);
              list.add(message) ;
            } catch (EmptyMessage e) {
                list.remove(list.size()) ;
            }
        } else {
            //System.out.println(request.getParameter("col"));
            for (int i=Integer.parseInt(request.getParameter("col")) ; i<list.size();i++) {
                 s = s + "<p>"+list.get(i)+"</p><br/>" ;
            }
        }
        response.setContentType("text");
        try {
            PrintWriter writer = response.getWriter() ;
            writer.print(s);
            s="" ;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
