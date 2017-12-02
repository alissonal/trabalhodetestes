package br.cesmac.robo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Stack;

public class Log {
	Stack<String> logStack = new Stack<String>();
	
	void escreverNoLog(String log) {
		logStack.push(log);
	}
	
	void gravarLog() {	
		try {
	
			File arq = new File("log.txt");
			arq.createNewFile ();
			FileWriter fileW = new FileWriter (arq);;
			BufferedWriter buffW = new BufferedWriter (fileW);

	        for (String stringI : logStack) {
				//System.out.println(stringI);
				buffW.write(stringI);
				buffW.newLine ();				
			}	       
		
	        //fechar o buff
	        buffW.close ();
		} 
		catch (Exception e) {
			
		}
		
		
	}
}
