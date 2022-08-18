package convert.view;

import javax.swing.JOptionPane;

import convert.controller.Controller;
import convert.model.Model;

public class View {
	
	private int option;
	private String message;
	private String title;
	private String mode;
	private String[] data;
	
	private Model model;
	private Controller controller;
	

	public View() {
	}

	public View(Model model, String[] data,  String title, String message, int option) {
		this.model = model;
		this.data = data;
		this.title = title;
		this.message = message;
		this.option = option;
	}
	
	public String createView() {
		mode = (String) JOptionPane.showInputDialog(null, 
				message, 
				title, 
				option, 
				null, 
				data, 
				data[0]);
		if(mode == null) {
			terminateView(true);
		}
		return mode;
	}
	
	public String createViewOptions() {
		mode = (String) JOptionPane.showInputDialog(null, 
				message, 
				title, 
				option, 
				null, 
				data, 
				data[0]);
		if(mode == null) {
			terminateView(true);
		}
		return mode;
	}
	
	public void resultView(String message) {
		JOptionPane.showMessageDialog(null,
			    message,
			    "Conversor Alura Oracle Next One F2T2",
			    JOptionPane.PLAIN_MESSAGE);
	}
	
	public boolean terminateView(boolean boo) {
		int i  = JOptionPane.showOptionDialog(null, 
				"Voce gostaria de finalizar?",
				"Finalizar",
				JOptionPane.YES_NO_OPTION, 
				JOptionPane.QUESTION_MESSAGE,
				null,
				new Object[] { "Yes", "No" },
				JOptionPane.YES_OPTION);
		if(i == 0) {
			System.out.println(i);
			System.exit(0);
		} 
		return boo;
	}

	public int getOption() {
		return option;
	}

	public void setOption(int option) {
		this.option = option;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public Model getModel() {
		return model;
	}

	public Controller getController() {
		return controller;
	}

}
