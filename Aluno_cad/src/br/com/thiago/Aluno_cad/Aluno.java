package br.com.thiago.Aluno_cad;



public final class Aluno {
	
	String[] nomes;
	
	
	double [][] notas;
	
	public void SetNomes(String[] nomes) {
		this.nomes =nomes;
	}
	
	public String[] GetNomes() {
		return nomes;
		
	}
	
	public void SetNotas(double [][] notas) {
		this.notas = notas;
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
