package main;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class Boardarea extends JPanel {

	public enum PositionState {
		EMPTY, BLACK, WHITE
	};

	private ArrayList<Chess> chesses;
	private PositionState[][] board = new PositionState[20][20];
	private int grid = 40;
	private boolean player1 = true;

	public boolean getPlyaer() {
		return player1;
	}

	public void setPlayer(boolean player) {
		player1 = player;
	}

	public int getGrid() {
		return grid;
	}

	public void setPositionState(PositionState p, int x, int y) {
		board[x][y] = p;
	}

	public PositionState getPositionState(int x, int y) {
		return board[x][y];
	}

	public int locate(int a) {
		return (a - grid / 2) / grid * grid + grid / 2;
	}

	public int transform(int a) {
		return locate(a) / grid + 1;
	}

	public void draw(Graphics g, int x, int y) {
		g.fillOval(locate(x), locate(y), getGrid(), getGrid());
	}

	public Boardarea() {
		for (int i = 1; i < 20; i++) {
			for (int j = 1; j < 20; j++) {
				setPositionState(PositionState.EMPTY, i, j);
			}
		}
		setPreferredSize(new Dimension(grid * 21, grid * 21));
		MyMouseListener ml = new MyMouseListener();
		addMouseListener(ml);
		addMouseMotionListener(ml);
	}

	public void paint(Graphics g) {
		chesses = new ArrayList<>(1024);
		for (int i = grid; i < grid * 20; i = i + grid) {
			g.drawLine(i, grid, i, grid * 19);
			g.drawLine(grid, i, grid * 19, i);
		}
		for (Chess s : chesses) {
			s.drop(g);
		}
	}

	class MyMouseListener implements MouseListener, MouseMotionListener {
		private int x, y;
		private Chess current;

		@Override
		public void mouseDragged(MouseEvent e) {
			Graphics g = getGraphics();
			g.setColor(getBackground());
			if (getPositionState(transform(x), transform(y)) == PositionState.EMPTY) {
				draw(g, x, y);
				g.setColor(Color.BLACK);
				g.drawLine(locate(x), locate(y) + grid / 2, locate(x) + grid, locate(y) + grid / 2);
				g.drawLine(locate(x) + grid / 2, locate(y), locate(x) + grid / 2, locate(y) + grid);
				g.setColor(Color.GRAY);
				draw(g, e.getX(), e.getY());
			}
			x = e.getX();
			y = e.getY();
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent e) {
			x = e.getX();
			y = e.getY();

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			Graphics g = getGraphics();
			x = e.getX();
			y = e.getY();
			current = new Chess(Boardarea.this, x, y);
			current.drop(g);
			chesses.add(current);

		}

	}
}
