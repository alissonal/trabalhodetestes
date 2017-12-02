package br.cesmac.robo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class RoboTest  {
	
	@Test
	public void testarSetarMapa() {
		Robo robot = new Robo(0,0);
		robot.setMapa(5, 5);
		Assert.assertTrue(robot.plano != null);
	}
	
	@Test
	public void irPraCima() {
		Robo robot = new Robo(0,0);
		robot.setMapa(5, 5);
		robot.posicaoAtual.y = 0;
		//System.out.println("x: " + robot.posicaoAtual.x + " y: "+robot.posicaoAtual.y);
		
		Acao acao = new Acao();
		acao.posicao.x = 0;
		acao.posicao.y = 1;
		acao.passos = 3;
		
		robot.andar(acao);
		
		Assert.assertEquals(3, robot.posicaoAtual.y); 
	}
	
	@Test
	public void irPraBaixo() {
		Robo robot = new Robo(0,0);
		robot.setMapa(5, 5);
		robot.posicaoAtual.y = 2;
				
		Acao acao = new Acao();
		acao.posicao.x = 0;
		acao.posicao.y = -1;
		acao.passos = 4;
		
		robot.andar(acao);
		
		Assert.assertEquals(0, robot.posicaoAtual.y); 
	}
	
	@Test
	public void irPraEsquerda() {
		Robo robot = new Robo(0,0);
		robot.setMapa(5, 5);
		robot.posicaoAtual.x = 4;
				
		Acao acao = new Acao();
		acao.posicao.x = -1;
		acao.posicao.y = 0;
		acao.passos = 3;
		
		System.out.println("x: " + robot.posicaoAtual.x + " y: "+robot.posicaoAtual.y);
		robot.andar(acao);
		System.out.println("x: " + robot.posicaoAtual.x + " y: "+robot.posicaoAtual.y);
		
		
		Assert.assertEquals(1, robot.posicaoAtual.x); 
	}
	
	@Test
	public void irPraDireita() {
		Robo robot = new Robo(0,0);
		robot.setMapa(5, 5);
		robot.posicaoAtual.x = 2;
				
		Acao acao = new Acao();
		acao.posicao.x = 1;
		acao.posicao.y = 0;
		acao.passos = 3;
		
		//System.out.println("x: " + robot.posicaoAtual.x + " y: "+robot.posicaoAtual.y);
		robot.andar(acao);
		//System.out.println("x: " + robot.posicaoAtual.x + " y: "+robot.posicaoAtual.y);
		//robot.roboLog.recuperarLog();
		robot.roboLog.gravarLog();
		Assert.assertEquals(4, robot.posicaoAtual.x); 
	}

	@After
	public void lol() {
		
	}
	
	

}
