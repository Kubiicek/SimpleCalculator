package entites;

import view.JApplication;
import java.util.List;
import java.util.ArrayList;

public class Proceed {

	    private final List<String> listExpression;

	    public Proceed() {
	        this.listExpression = new ArrayList<>();
	    }

	    public void addPart(String part) {
	        listExpression.add(part);
	    }
	    
	    public void clean() {
	    	listExpression.clear();
	    }
	    
	    public void removeLastPart() {
	    	if (!listExpression.isEmpty()) {
	    		listExpression.remove(listExpression.size() - 1);
	    	}
	    }

	    public String getExpression() {
	        return String.join("", listExpression);
	    }

	    public double calculateResult() {
	        String expression = getExpression();
	        return evaluteExpression(expression);
	    }

	    private double evaluteExpression(String expression) {
	        expression = expression.replaceAll("\s", "");
	        double result = 0;
	        char operation = '+';
	        StringBuilder currentNumber = new StringBuilder();

	        for (int i = 0; i < expression.length(); i++) {
	            char c = expression.charAt(i);

	            if (Character.isDigit(c) || c == '.') {
	                currentNumber.append(c);
	            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
	                result = applyOperation(result, Double.parseDouble(currentNumber.toString()), operation);
	                operation = c;
	                currentNumber.setLength(0);
	            }
	        }

	        result = applyOperation(result, Double.parseDouble(currentNumber.toString()), operation);
	        return result;
	    }

	    private double applyOperation(double num1, double num2, char operation) {
	        return switch (operation) {
	            case '+' -> num1 + num2;
	            case '-' -> num1 - num2;
	            case '*' -> num1 * num2;
	            case '/' -> num1 / num2;
	            default -> throw new IllegalArgumentException("Invalid Operation: " + operation);
	        };
	    }
	
	public static int storeNumber(String input) {
		try {
			return 1;
		} catch (NumberFormatException e) {
			return 0;
		}
	}
	
	public void imprimirFeijao() {
		while (JApplication.value) {
			System.out.println("");
		}
	}
}
