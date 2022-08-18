package convert;

import javax.swing.SwingUtilities;

import convert.controller.Controller;

public class Convert {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					createAndShowView();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static void createAndShowView() throws Exception {
		try {
			while(true) {
				new Controller();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}
}