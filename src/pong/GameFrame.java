package pong;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GameFrame extends JFrame{
	
	
	GameFrame() {
		this.add(new GamePanel());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Ping pong");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
	}
}
