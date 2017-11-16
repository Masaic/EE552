package main;

import java.awt.*;
import main.Boardarea.*;

public class Chess {
	private int x, y, grid;
	private Boardarea ba;
	private boolean player1;

	public Chess(Boardarea ba, int x, int y) {
		this.ba = ba;
		grid = ba.getGrid();
		player1 = ba.getPlyaer();
		this.x = ba.transform(x);
		this.y = ba.transform(y);
	}

	public void drop(Graphics g) {
		/*
		 * if (ba.getPositionState(x, y) == PositionState.EMPTY) {
		 * g.setColor(ba.getPlyaer() ? Color.BLACK : Color.WHITE); ba.draw(g, x
		 * * grid , grid * y); ba.setPositionState(PositionState.BLACK, x, y);
		 * ba.setPlayer(false);
		 */
		if (player1 == true) {
			g.setColor(Color.BLACK);
			ba.draw(g, x * grid, grid * y);
			ba.setPositionState(PositionState.BLACK, x, y);
			ba.setPlayer(false);
		} else if (player1 == false) {
			g.setColor(Color.WHITE);
			ba.draw(g, x * grid, grid * y);
			ba.setPositionState(PositionState.WHITE, x, y);
			ba.setPlayer(true);
		}

	}
}
