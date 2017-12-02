package br.cesmac.robo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

// Testar se arquivo foi escrito
public class LogTest  {
	
	public String lerUltimaLinhaArquivoLog() {
		
		try {
			File arq = new File("log.txt");
			FileReader fileR = new FileReader (arq);
	        BufferedReader buffR = new BufferedReader (fileR);
	        String lineRed = "";
	        String line;
	        while((line = buffR.readLine()) != null) {
	        	lineRed = line;
	        }
	        return lineRed;
	       // System.out.println(lineRed);
		} catch (Exception e) {
			
		}
		
		return "";
	}
	
	/*
	 * Testa se escreveu no arquivo
	 */
	
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
		
		robot.roboLog.gravarLog();
		
		//lerUltimaLinhaArquivoLog();
		
		String ultimaLinha = lerUltimaLinhaArquivoLog();
		
		Assert.assertTrue(ultimaLinha.equals("0 : 3")); 
	}
	
	/*
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
	
	*/

}
