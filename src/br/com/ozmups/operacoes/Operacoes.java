package br.com.ozmups.operacoes;

public class Operacoes {

	private static double[][] resposta;

	public static double[][] getResposta() {
		return resposta;
	}

	public static double[][] soma(double[][] a, double[][] b) {

		resposta = new double[a.length][a[0].length];

		for (int i = 0; i < resposta.length; i++) {
			for (int j = 0; j < resposta.length; j++) {

			}
		}

		return resposta;
	}

	public static double[][] subtracao(double[][] a, double[][] b) {

		resposta = new double[a.length][a[0].length];

		for (int i = 0; i < resposta.length; i++) {
			for (int j = 0; j < resposta.length; j++) {

			}
		}

		return resposta;
	}

	public static double[][] multplicacaoPorReal(double a, double[][] b) {

		resposta = new double[b.length][b[0].length];

		for (int i = 0; i < resposta.length; i++) {
			for (int j = 0; j < resposta.length; j++) {

			}
		}

		return resposta;
	}

	public static double[][] multplicacaoPorMatriz(double[][] a, double[][] b) {

		resposta = new double[a.length][b[0].length];

		for (int i = 0; i < resposta.length; i++) {
			for (int j = 0; j < resposta.length; j++) {
				for (int k = 0; k < b.length; k++) {

					resposta[i][j] += a[i][k] * b[k][j];

				}
			}
		}

		return resposta;
	}

	public static double detLaplace(double[][] a) {
		double det = 0;
		int kAux = 0;
		double[][] aux = new double[a.length-1][a[0].length-1];
		
		if(a.length == 1 && a[0].length==1)
			return a[0][0];
		
		for (int i = 0; i < a[0].length; i++) {
			
			for (int j = 1; j < a.length; j++) {
				
				for (int k = 0; k < a[0].length; k++) {
					if(k==i)
						continue;
					
					aux[j-1][kAux] = a[j][k];
					kAux++;
				}
				kAux = 0;
			}
			
			det += (Math.pow(-1, 1+(i+1)))*detLaplace(aux);
			
		}

		return det;
	}
}
