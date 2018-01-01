import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Point;
import java.util.Random;

public class JavaGraphics extends JFrame {

	int width = 600;
	int height = 400;

	public JavaGraphics() throws HeadlessException {
		setSize(width, height);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(new DrawArea());
		setVisible(true);
	}

	class DrawArea extends JPanel {
		Point a = null;
		Point b = null;
		Point c = null;

		public DrawArea() {
			// Defines the upper left location of a square
			a = new Point(width / 7, height / 3);
			b = new Point(3 * width / 7, height / 3);
			c = new Point(5 * width / 7, height / 3);
		}

		@Override
		protected void paintComponent(Graphics g) {
			
			// Set the background colour:
			g.setColor(Color.white);
			g.fillRect(0, 0, width, height);

			// Make the rectangles:
			g.setColor(getRandomColor());
			g.fillRect(a.x, a.y, width / 7, height / 4);
			g.setColor(getRandomColor());
			g.fillRect(b.x, b.y, width / 7, height / 4);
			g.setColor(getRandomColor());
			g.fillRect(c.x, c.y, width / 7, height / 4);
			
			g.setColor(Color.black);
			g.drawRect(a.x, a.y, width / 7, height / 4);
			g.drawRect(b.x, b.y, width / 7, height / 4);
			g.drawRect(c.x, c.y, width / 7, height / 4);
			
			// Draw the text: 
			g.setColor(Color.gray);
			g.setFont(new Font("Verdana", Font.PLAIN, 21));
			g.drawString("Use the following colours for your design!", width/7, height/4);
		}

		private Color getRandomColor() {
			Random random = new Random();

			int r = random.nextInt(255) + 1;
			int g = random.nextInt(255) + 1;
			int b = random.nextInt(255) + 1;

			return new Color(r, g, b);

		}

	}

}
