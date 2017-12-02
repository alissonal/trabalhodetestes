package br.cesmac.robo;

public class Robo {
	public Posicao plano = new Posicao();
	public Posicao posicaoAtual = new Posicao();
	public Log roboLog = new Log();
	
	public Robo(int x, int y) {
		this.posicaoAtual.x = x;
		this.posicaoAtual.y = y;
	}
	
	public void setMapa(int tamX, int tamY) {
		this.plano.x = tamX;
		this.plano.y = tamY;
	}
	
	public void andar(Acao acao) {
		while(acao.passos > 0) {
			if(verificarSePodeMover(acao)) {
				if(acao.posicao.x > 0) {
					posicaoAtual.x++;	
					roboLog.escreverNoLog(this.posicaoAtual.x+ " : "+ this.posicaoAtual.y);
				} else if (acao.posicao.x < 0) {
					posicaoAtual.x--;		
					roboLog.escreverNoLog(this.posicaoAtual.x+ " : "+ this.posicaoAtual.y);
					//roboLog.escreverNoLog("Andou para esquerda");
				} else if (acao.posicao.y > 0) {
					posicaoAtual.y++;			
					roboLog.escreverNoLog(this.posicaoAtual.x+ " : "+ this.posicaoAtual.y);
					//roboLog.escreverNoLog("Andou para cima");
				} else if (acao.posicao.y < 0) {
					posicaoAtual.y--;			
					roboLog.escreverNoLog(this.posicaoAtual.x+ " : "+ this.posicaoAtual.y);
					//roboLog.escreverNoLog("Andou para baixo");
				}
				
			} else {
				roboLog.escreverNoLog(this.posicaoAtual.x+ " : "+ this.posicaoAtual.y);
			}
			acao.passos--;
		} 
	}
	
	public boolean verificarSePodeMover (Acao acao) {
		if(acao.posicao.x > 0) {
			if(posicaoAtual.x+1 >= plano.x)
				return false;			
		} else if (acao.posicao.x < 0) {
			if(posicaoAtual.x-1 < 0) 
				return false;			
		} else if (acao.posicao.y > 0) {
			if(posicaoAtual.y+1 >= plano.y)
				return false;			
		} else if (acao.posicao.y < 0) {
			if(posicaoAtual.y-1 < 0) 
				return false;			
		}
		return true;
	}
	

	
}
