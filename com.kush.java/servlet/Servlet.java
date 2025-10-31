//package servlet.servlet;
//
//import jakarta.servlet.RequestDispatcher;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.*;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.Arrays;
//
//public class Servlet extends HttpServlet {
//    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
//        int k = Integer.parseInt(req.getParameter("num"));
//      //int j= Integer.parseInt(req.getParameter("num2"));
//        k = k * k;
//        //Return response to client
//        PrintWriter out = res.getWriter();
//        System.out.println("Square is : " + k);
//        out.println("Square is : " + k);
//
//
//        //Forward data via request to another servlet
//        req.setAttribute("k", k);
//        RequestDispatcher rd = req.getRequestDispatcher("cube");
//        rd.forward(req, res);
//        //Another Servlet
//        int k = (int) req.getAttribute("k");
//
//
//        //Forward data via path variable to another servlet ("cube?k="+k)
//        RequestDispatcher rd = req.getRequestDispatcher("cube?k="+k);
//        rd.forward(req, res);
//        //Another Servlet
//        int k = (int) req.getAttribute("k");
//
//
//        //Forward data via session another servlet
//        HttpSession session = req.getSession();
//        session.setAttribute("k", k);
//        res.sendRedirect("cube");
//        //Another Servlet
//        HttpSession session1 = req.getSession();
//        int k1 = (int) session1.getAttribute("k");
//        session1.removeAttribute("k");
//
//
//        //Forward data via cookie to another servlet
//        Cookie cookie = new Cookie("k", k+"");
//        res.addCookie(cookie);
//        res.sendRedirect("cube");
//        //Another Servlet
//        //Read cookie in CubeServlet
//        int k2 = Arrays.stream(req.getCookies()).filter(c -> c.getName().equals("k")).findFirst().map(c -> Integer.parseInt(c.getValue())).orElse(0);
//    }
//}