package br.com.thiago.projeto1;

public final class Alunos {

	
	String[] nomes = { "Ana", "Maria", "João", "José", "Pedro", "Felipe"};
	
	
	double [][] notas = { {7, 8, 5, 6},
	{4, 8, 4, 2},
	{9,10, 7, 8},
	{2.5, 3, 4, 3.4},
	{10, 9.5, 8, 7},
	{9, 8, 8, 9} };
	
	public String[] GetNomes() {
		return nomes;
		
	}
	
	public double[][] GetNotas(){
		return notas;
	}
	
	public double nota_media(double[] notas) {
	double media = 0;
		for(double nota: notas) {
			media = media + nota;
		}
		
		return media/notas.length;
		
	}
	
	public String situacao(double media) {
		
		if (media<4.00) {
			return "Reprovado";
		}
		else if(media>=4.00 && media<7.00) {
			return "Final";
		}
		else if(media>=7.00) {
			return "Aprovado";
		}
		return "";
		
	}
	
	
	
	
}
