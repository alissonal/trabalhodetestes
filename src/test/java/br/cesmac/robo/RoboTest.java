package br.cesmac.robo;

import org.junit.Assert;
import org.junit.Test;

public class RoboTest  {
	
	@Test
	public void testarSetarMapa() {
		Robo robot = new Robo();
		robot.setMapa(5, 5);
		Assert.assertTrue(robot.plano != null);
	}
	
	@Test
	public void irPraCima() {
		Robo robot = new Robo();
		robot.setMapa(5, 5);
		//System.out.println("x: " + robot.posicaoAtual.x + " y: "+robot.posicaoAtual.y);
		
		Posicao acao = new Posicao();
		acao.x = 0;
		acao.y = 1;
		
		robot.andar(acao);
		robot.andar(acao);
		robot.andar(acao);
		robot.andar(acao);
		robot.andar(acao);
		robot.andar(acao);
		robot.andar(acao);
		
		Assert.assertEquals(4, robot.posicaoAtual.y); 
	}
	
	@Test
	public void irPraBaixo() {
		Robo robot = new Robo();
		robot.setMapa(5, 5);
		robot.posicaoAtual.y = 2;
				
		Posicao acao = new Posicao();
		acao.x = 0;
		acao.y = -1;
		
		robot.andar(acao);
		robot.andar(acao);
		robot.andar(acao);
		robot.andar(acao);
		robot.andar(acao);
		robot.andar(acao);
		robot.andar(acao);

		Assert.assertEquals(0, robot.posicaoAtual.y); 
	}
	
	@Test
	public void irPraEsquerda() {
		Robo robot = new Robo();
		robot.setMapa(5, 5);
		robot.posicaoAtual.x = 4;
				
		Posicao acao = new Posicao();
		acao.x = -1;
		acao.y = 0;
		
		System.out.println("x: " + robot.posicaoAtual.x + " y: "+robot.posicaoAtual.y);
		robot.andar(acao);
		System.out.println("x: " + robot.posicaoAtual.x + " y: "+robot.posicaoAtual.y);
		robot.andar(acao);
		System.out.println("x: " + robot.posicaoAtual.x + " y: "+robot.posicaoAtual.y);
		robot.andar(acao);
		System.out.println("x: " + robot.posicaoAtual.x + " y: "+robot.posicaoAtual.y);
		robot.andar(acao);
		System.out.println("x: " + robot.posicaoAtual.x + " y: "+robot.posicaoAtual.y);
		robot.andar(acao);
		System.out.println("x: " + robot.posicaoAtual.x + " y: "+robot.posicaoAtual.y);
		robot.andar(acao);
		System.out.println("x: " + robot.posicaoAtual.x + " y: "+robot.posicaoAtual.y);
		robot.andar(acao);
		System.out.println("x: " + robot.posicaoAtual.x + " y: "+robot.posicaoAtual.y);
		
		Assert.assertEquals(0, robot.posicaoAtual.x); 
	}
	
	@Test
	public void irPraDireita() {
		Robo robot = new Robo();
		robot.setMapa(5, 5);
		robot.posicaoAtual.x = 2;
				
		Posicao acao = new Posicao();
		acao.x = 1;
		acao.y = 0;
		
		//System.out.println("x: " + robot.posicaoAtual.x + " y: "+robot.posicaoAtual.y);
		robot.andar(acao);
		robot.andar(acao);
		robot.andar(acao);
		robot.andar(acao);
		robot.andar(acao);
		robot.andar(acao);
		robot.andar(acao);
		//System.out.println("x: " + robot.posicaoAtual.x + " y: "+robot.posicaoAtual.y);
		
		Assert.assertEquals(4, robot.posicaoAtual.x); 
	}
	

}
