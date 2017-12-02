package br.cesmac.robo;

public class Robo {
	//public int[][] plano;
	//public int tamPlanoX;
	//public int tamPlanoY;
	public Posicao plano = new Posicao();
	public Posicao posicaoAtual = new Posicao();
	
	public Robo() {
		this.posicaoAtual.x = 0;
		this.posicaoAtual.y = 0;
	}
	
	public void setMapa(int tamX, int tamY) {
		this.plano.x = tamX;
		this.plano.y = tamY;
	}
	
	public void andar(Posicao acao) {
		if(verificarSePodeMover(acao)) {
			if(acao.x > 0) {
				posicaoAtual.x++;		
			} else if (acao.x < 0) {
				posicaoAtual.x--;		
			} else if (acao.y > 0) {
				posicaoAtual.y++;			
			} else if (acao.y < 0) {
				posicaoAtual.y--;			
			}
		}
	}
	
	public boolean verificarSePodeMover (Posicao acao) {
		if(acao.x > 0) {
			if(posicaoAtual.x+1 >= plano.x)
				return false;			
		} else if (acao.x < 0) {
			if(posicaoAtual.x-1 < 0) 
				return false;			
		} else if (acao.y > 0) {
			if(posicaoAtual.y+1 >= plano.y)
				return false;			
		} else if (acao.y < 0) {
			if(posicaoAtual.y-1 < 0) 
				return false;			
		}
		return true;
	}
	

	
}
