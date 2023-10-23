package calculator;

import java.util.Scanner;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        
        // Prompt the user to enter a mathematical expression
        System.out.print("Enter a mathematical expression: ");
        
        // Read the expression from the user
        String expression = scanner.nextLine();
        
        // Create a ScriptEngine to evaluate the expression
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        
        try {
            // Evaluate the expression
            Object result = engine.eval(expression);
            
            // Display the result
            System.out.println("Result: " + result);
        } catch (ScriptException e) {
            // Handle any exceptions that may occur during evaluation
            System.err.println("Error: " + e.getMessage());
        }
        
        // Close the scanner
        scanner.close();
    }
    
}

