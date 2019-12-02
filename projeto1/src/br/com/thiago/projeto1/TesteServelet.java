package br.com.thiago.projeto1;

import java.io.IOException;
import java.io.PrintWriter;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TesteServelet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7323992434405583525L;

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse response) throws ServletException, IOException {
	
		Alunos alunos = new Alunos();
		PrintWriter out = response.getWriter(); 
		DecimalFormat df = new DecimalFormat("0.00");
		df.setRoundingMode(RoundingMode.HALF_UP);
		
		out.println("<html>");
		
		out.println("<style>  table, th, td {\r\n" + 
				"  border: 1px solid black;\r\n" + 
				"}</style>");
		
		out.println("<body>");
		
		out.println("<h1>Tabela</h1>");
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
		
		double media_total = 0;
		double[][] notas = alunos.GetNotas();
		int i = 0;
		for(String aluno: alunos.GetNomes()) {
			out.println("<tr>");
			out.println("<td>"+(i+1)+"</td>");
			out.println("<td>"+aluno+"</td>");
			
			for (double nota: notas[i]) {
				out.println("<td>"+df.format(nota)+"</td>");
				
			}
			
			double media = alunos.nota_media(notas[i]);
			media_total += media;
			out.println("<td>"+df.format(media)+"</td>");
			out.println("<td>"+alunos.situacao(media)+"</td>");
			
			i++;
			
		out.println("</tr>");
		}
		out.println("<tr>");
		out.println("<td></td>");
		out.println("<td>Media das Notas</td>");
		for (int x=0;x<notas[0].length;x++) {
			double nota = 0;
		for(int i1=0; i1<notas.length;i1++) {
			nota = notas[i1][x]+nota;
		}
		out.println("<td>"+df.format(nota/alunos.GetNomes().length)+"</td>");
		}
		out.println("<td>"+df.format(media_total/alunos.GetNomes().length)+"</td>");

		out.println("</tr>");
		out.println("</table>");
		
		out.println("</body>");
		out.println("</html>");
	}
	
	

}
