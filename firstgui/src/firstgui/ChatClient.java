package firstgui;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.lang.Math;

public class ChatClient extends JFrame
	implements WindowListener, MouseListener, KeyListener{
		
		JPanel p = new JPanel();
		JTextArea dialog = new JTextArea(20,50);
		JTextArea input = new JTextArea(1,50);
		JScrollPane scroll = new JScrollPane(
				dialog,
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
				);
		
		
		
		String[][] chatClient = {
				{"What should I drink", "I'm thirsty", "Tell me what to drink"},
				{"What do you have?", "What do you feel like?"},
				//
				{"Vodka", "Gin", "Beer"},
				{"Make a Caesar", "Mmmm how about a Gin and Tonic"},
				//
				{"I like to drink", "huh?", "I'm drunk", "buy me another drink", "call a taxi"}
		};
		
		public static void main(String[] args){
			new ChatClient();
		}
		
		public ChatClient(){
			super("Drunk Bot");
			setSize(600,400);
			setResizable(false);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			dialog.setEditable(false);
			input.addKeyListener(this);
			
			p.add(scroll);
			p.add(input);
			p.setBackground(new Color(150, 100, 0));
			add(p);
			
			setVisible(true);
		}
		
		public void keyPressed(KeyEvent e){
			if(e.getKeyCode() == KeyEvent.VK_ENTER){
				input.setEditable(false);
				//grab quote
				String quote = input.getText();
				input.setText("");
				addText("--->User:\t" + quote);
				quote.trim();
				while(
						quote.charAt(quote.length()-1)=='!' ||
								quote.charAt(quote.length()-1)=='.' ||
										quote.charAt(quote.length()-1)=='?'){
					quote = quote.substring(0,quote.length()-1);
					}
				
				quote.trim();
				byte response = 0;
				
				int j=0;
				while(response==0){
					if(inArray(quote.toLowerCase(), chatClient[j*2])){
						response = 2;
						int r = (int)Math.floor(Math.random()*chatClient[(j*2)-1].length);
						addText("\n--->Drunk Bot:\t" + chatClient[(j*2)-1][r]);
					}
					j++;
					if(j*2==chatClient.length-1 && response == 0){
						response = 1;
					}
				}
				if(response == 1){
					int r = (int)Math.floor(Math.random()*chatClient[chatClient.length-1].length);
					addText("\n--->Drunk Bot:\t" + chatClient[chatClient.length-1][r]);
				}
				
				addText("\n");
				//check for matches
				//default
			}
		}
		
		private boolean inArray(String in, String[] str) {
			boolean match = false;
			for(int i= 0; i<str.length-1; i++){
				if(str[i].equals(in)){
					match = true;
				}
			}
			return match;
		}

		public void keyReleased(KeyEvent e){
			if(e.getKeyCode () == KeyEvent.VK_ENTER ){
				input.setEditable(true);
			}
		}
		
		public void keyTyped(KeyEvent e){
			
		}
		
		public void addText(String str){
			dialog.setText(dialog.getText() +str);
	}

		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowActivated(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosed(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosing(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeactivated(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowOpened(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}
}
	


