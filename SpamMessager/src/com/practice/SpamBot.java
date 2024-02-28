package com.practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class SpamBot {
	
	public static void main(String[] args) throws AWTException, InterruptedException{
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Message to send : ");
		String message = scanner.nextLine();
		
		System.out.println("Enter no of times, want to send : ");
		int size = scanner.nextInt();
		
		scanner.close();
		
		
		
		StringSelection stringSelection = new StringSelection(message);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		
		Thread.sleep(5000);
		
		
		Robot robot = new Robot();
		
		for(int i=1; i<=size; i++) {
			
			// to press key - Ctrl + V
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			
			// to release key - Ctrl + V
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			
			// to press Enter so next message get pasted
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			Thread.sleep(1000);
		}
		
	}

}
