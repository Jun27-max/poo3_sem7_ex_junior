package application;

import java.lang.reflect.InvocationTargetException;

import javax.swing.SwingUtilities;

import entities.JanelaUI;

public class Main {

	public static void main(String[] args) {
		
		try {
			SwingUtilities.invokeAndWait(JanelaUI::new);
			
		} catch (InvocationTargetException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
