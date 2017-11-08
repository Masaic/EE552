package main;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

public class WeiQiapp extends JFrame {
	//private boolean dirty;
	private Boardarea ba;
	
	private void handleEvents() {
		addWindowListener(new WindowListener() {

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
				int result = JOptionPane.showConfirmDialog(WeiQiapp.this, "Quit?", "alert",
						JOptionPane.OK_CANCEL_OPTION);
				//System.out.println(result);
				if (result == 0)
					System.exit(0);
				setVisible(true);
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

		});
	}
	
	public WeiQiapp() {
		super("WeiQi");
		handleEvents();
		ba = new Boardarea();
		add(ba);
		pack();
		setVisible(true);
	}

}
