package firstgui;
import java.io.*;
import java.awt.event.*;
import java.awt.*; //gives color, container and panel
import javax.swing.*; //access the Jframe 


public class gui {


	public static void main(String[] args) {
		JFrame firstgui = new JFrame();
		
		firstgui.setTitle("Drunkbot");//assign gui title
		
		firstgui.setSize(600, 300);
		
		firstgui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel(); //assigned Jpanel to the name panel in our program
		
		panel.setBackground(Color.pink); //set panel or container to blue
		
		Container pane = firstgui.getContentPane(); //adds the container/pane to the gui
		
		pane.add(panel); //adds the panel to the pane inside the gui
		
		firstgui.setVisible(true);// so the user can see the gui

		}
		
	}

