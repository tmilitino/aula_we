package br.com.thiago.Aluno_cad;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Telacadastro extends HttpServlet {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		PrintWriter out = response.getWriter(); 
		DecimalFormat df = new DecimalFormat("0.00");
		df.setRoundingMode(RoundingMode.HALF_UP);
		
		out.println("<html>");
		
		out.println("<style>  table, th, td {\r\n" + 
				"  border: 1px solid black;\r\n" + 
				"}</style>");
		
		out.println("<body>");
		
		out.println("<h1>Tabela</h1>");
		out.println("<form action=\"/werqwrt/CadastraTabela\">");
		out.println("<table>");
		out.println("<tr>");
		out.println("<th></th>");		
		out.println("<th>Aluno</th>");
		out.println("<th>Nota 1</th>");
		out.println("<th>Nota 2</th>");
		out.println("<th>Nota 3</th>");
		out.println("<th>Nota 4</th>");
		out.println("<th>Media</th>");
		out.println("<th>Situacao</th>");
		out.println("</tr>");
		
		
		
		int i = 0;
		for(int a=0;a<6;a++) {
			out.println("<tr>");
			out.println("<td>"+(i+1)+"</td>");
			out.println("<td><input type=\"text\" name=\"aluno_"+a+"\"></td>");
			
			for (int n1=0;n1<6;n1++) {
				for(int n2=0;n2<4;n2++) {
				out.println("<td><input type=\"text\" name=\"nota_"+n1+"_"+n2+"></td>");
				}	
			}
			
			
			out.println("<td>-,--</td>");
			out.println("<td>-----</td>");
			
			i++;
			
		out.println("</tr>");
		}
		out.println("<tr>");
		out.println("<td></td>");
		out.println("<td>Media das Notas</td>");
		for (int x=0;x<6;x++) {
			for(int i1=0; i1<4;i1++) {
				out.println("<td>-,--</td>");
			}
		}
		
		out.println("<td>-,--</td>");
		out.println("</tr>");
		out.println("</table>");	
		
		
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}
}
