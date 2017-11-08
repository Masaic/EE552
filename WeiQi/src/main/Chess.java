package main;

import java.awt.*;
import main.Boardarea.*;

public class Chess {
	private int x, y;
	private int grid;
	private Boardarea ba;

	public Chess(Boardarea ba, int x, int y) {
		this.ba = ba;
		grid = ba.getGrid();
		this.x = ba.transform(x);
		this.y = ba.transform(y);
	}

	public void drop(Graphics g) {
		if (ba.getPositionState(x, y) == PositionState.EMPTY) {
			if (ba.getPlyaer() == true) {
				g.setColor(Color.BLACK);
				ba.draw(g, x * grid , grid * y);
				ba.setPositionState(PositionState.BLACK, x, y);
				ba.setPlayer(false);
			} else if (ba.getPlyaer() == false) {
				g.setColor(Color.WHITE);
				ba.draw(g, x * grid , grid * y);
				ba.setPositionState(PositionState.WHITE, x, y);
				ba.setPlayer(true);
			}
		}
	}

}
