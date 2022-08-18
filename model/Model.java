package convert.model;

public class Model {
	
	private String result;
	
	static final String[] values = {"Moeda", "Temperatura"};
	
	static  final String[] currencies = {
			"Real para Dolar Americano",
			"Real para Euro",
			"Real para Libras Esterlinas",
			"Real para Yene",
			"Real para Won Coreano",
			"Real para Peso Argentino",
			"Real para Peso Chileno",
			"Dolar Americano para Real",
			"Euro para Real",
			"Libras Esterlinas para Real",
			"Yene para Real",
			"Won Coreano para Real",
			"Peso Argentino para Real",
			"Peso Chileno para Real",
			};

	
	static  final String[] currenciesFactor = {
			"0.19", 
			"0.189",
			"0.16",
			"26.110",
			"254.00",
			"26.00",
			"174.00",
			"5.17",
			"5.27",
			"6.24",
			"0.04",
			"0.004",
			"0.04",
			"0.01"
			};
	
	static final String[] temperatures = {
			"Celsius para Kelvin", 
			"Celsius para Fahrenheit",
			"Kelvin para Celsius",
			"Kelvin para Fahrenheit",
			"Fahrenheit para Celsius",
			"Fahrenheit para Kelvin"
			};
	
	
	public String[] getValues() {
		return values;
	}
	
	public String[] getCurrencies() {
		return currencies;
	}
	
	public String[] getTemperatures() {
		return temperatures;
	}
	
	public String calcTemperature(String choice, String val) {
		System.out.println(choice + ":" + val);
		Double aux = 0.0;
		switch (choice) {
			case "Celsius para Kelvin":
				aux = Double.parseDouble(val) + 273.15;
				break;
			case "Celsius para Fahrenheit":
				aux = (Double.parseDouble(val) * 1.8) + 32;
				break;
			case "Kelvin para Celsius":
				aux = Double.parseDouble(val) - 273.15;
				break;
			case "Kelvin para Fahrenheit":
				aux = 1.8 * (Double.parseDouble(val) - 273) + 32;
				break;
			case "Fahrenheit para Celsius":
				aux = 0.56 * (Double.parseDouble(val) - 32);
				break;
			case "Fahrenheit para Kelvin":
				aux =  0.56 * (Double.parseDouble(val) + 459.67);
				break;
			default:
				aux = 0.0;
				break;
		}
		result = aux.toString();
		return result;
	}
	
	public String calcCurrency(String choice, String val) {
		int i = 0; 
		int idx = -1;
		Double aux = 0.0;
		System.out.println(choice + ":" + val);
		while(idx == -1 && i<currencies.length) {
			if(choice.equals(currencies[i])) {
				System.out.println(currencies[i] + " : " + idx);
				idx = i;
			}
			i++;
		}
		System.out.println(idx);
		aux = Double.parseDouble(val) * Double.parseDouble(currenciesFactor[idx]);
		result = aux.toString();
		return result;
	}
}
