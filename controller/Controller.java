package convert.controller;

import javax.swing.JOptionPane;

import convert.model.Model;
import convert.view.View;

public class Controller{
	
	private String[] data;
	private String result;
	private String choice;
	private String mode;
	private String val;
	private View view;
	private Model model;

	public Controller() {
		model = new Model();
		data = model.getValues();
		view = new View(model, data, "Menus", "Escolha uma op��o", 3);
		mode = view.createView();
		System.out.println(mode);
		if(mode =="Moeda") {
			view = new View(model, model.getCurrencies(), "Moeda", "Escolha uma op��o", 3);
			choice = view.createViewOptions();
			val = (String) JOptionPane.showInputDialog(null, "Digite ao valor para convers�o");
			if(val == null) {
				view.terminateView(true);
			} else {
				result = "O valor da convers�o de " + val + " " + choice + " �:" + model.calcCurrency(choice, val);
				view.resultView(result);
				view.terminateView(true);
			}
		}
		
		if(mode == "Temperatura") {
			view = new View(model, model.getTemperatures(), "Temperatura", "Escolha uma op��o", 3);
			choice = view.createViewOptions();
			val = (String) JOptionPane.showInputDialog(null, "Digite ao valor para convers�o");
			if(val == null) {
				view.terminateView(true);
			}
			System.out.println(model.calcTemperature(choice, val));
		}
		
		if(mode == null) {
			view.terminateView(true);
		} else {
			result = "O valor da convers�o de " + val + " " + choice + " �: " + model.calcTemperature(choice, val);
			view.resultView(result);
			view.terminateView(true);
		}
	}
}
