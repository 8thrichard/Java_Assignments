package src;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.Priority;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

/*
 *The JavaFXCalculator class is an implementation of a basic calculator using JavaFX.
 *The calculator can perform simple arithmetic operations, such as addition, subtraction,
 *multiplication, and division. It also has the ability to calculate square roots, powers,
 *and perform memory operations such as recall, addition, subtraction, and clear.
 *The class extends the JavaFX Application class and creates a graphical user interface (GUI) with
 *text fields, buttons, and labels. The EventHandler interface is implemented to handle button
 *click events.
 *@version 1.0
 *@since 2023-04-24
 *@author Richard Boamah
 */
public class JavaFXCalculator extends Application {

	/*
	 * Main fields are initialized here 
	 * text memoryTextused to display text 
	 */
	private Text memoryText;

	/*
	 * this is used to store output based on user input into computer and later used in M+, M-, MR, and MC
	 */
	private double memory;

	/*
	 * TextField tfDisplay used to display textField
	 */
	private TextField tfDisplay;    

	/*
	 * used to store and display all 24 buttons listed in the array below
	 */
	private Button[] btns;       

	/*
	 * this are the labels we expect to see on out calculator to be used
	 * \u2190 this represents key pointing backwards as a sort of backspace key
	 * \u221a this is the math square root uni-code 
	 */
	private String[] btnLabels = {  // Labels of 24 buttons
			"7",  "8",  "9",  "+",
			"4",  "5",  "6",  "-",
			"1",  "2",  "3",  "x",
			".",  "0",  "=",  "/",
			"C",  "\u2190", "^", "\u221a",
			"M+", "M-", "MR", "MC"
	};

	/*
	 * For computation
	 * Result of computation
	 */
	private double result = 0;      

	/*
	 *  Input number as String
	 */
	private String inStr = "0";  // 

	/*
	 *  Previous operator: ' '(nothing), '+', '-', '*', '/', '='
	 */
	private char lastOperator = ' ';

	/*
	 *The handle method is an implementation of the EventHandler interface and is used to handle
	 *button click events. The method retrieves the label of the button that was clicked and uses a switch
	 *statement to determine the appropriate action to take.
	 */
	EventHandler<ActionEvent> handler = evt -> {
		String currentBtnLabel = ((Button)evt.getSource()).getText();
		switch (currentBtnLabel) {

		/*
		 *  Number buttons
		 */
		case "0": case "1": case "2": case "3": case "4":
		case "5": case "6": case "7": case "8": case "9":
		case ".":

			/*
			 *  no leading zero
			 */
			if (inStr.equals("0")) {
				inStr = currentBtnLabel;  
			} else {
				/*
				 *  append input digit
				 */
				inStr += currentBtnLabel; 
			}
			tfDisplay.setText(inStr);

			/*
			 *  Resets the result variable and the lastOperator variable if the previous operator was "=".
			 *	This is useful when the user wants to continue computing with the result of the previous computation
			 *	without having to clear the result first.
			 */
			if (lastOperator == '=') {
				result = 0;
				lastOperator = ' ';
			}
			break;

			/*
			 * 
			 * Performs a computation with the current operator and operands, sets the last operator to addition, and clears the input text field.
			 * This method is called when the "+" button is pressed in the calculator.
			 */
		case "+":
			compute();
			lastOperator = '+'; 
			break;

			/*
			 * *
			Performs subtraction operation if a previous operator exists.
			Sets the last operator to subtraction.
			If no previous operator exists, simply stores the current number as the first operand.
			If this is a consecutive subtraction operation, it subtracts the current number from the result of the previous operation.
			 */
		case "-":
			compute();
			lastOperator = '-';
			break;

			/*
			 * Handles the multiplication operation when the 'x' button is pressed.
			 *Computes the result of the previous operation and the current value on the display,
			 *then sets the last operator to '*'.
			 */
		case "x":
			compute();
			lastOperator = '*';
			break;

			/*
			 *Performs division operation on the two operands and sets the last operator to '/'.
			 */
		case "/":
			compute();
			lastOperator = '/'; 
			break;

			/*
			 * Executes the computation of the arithmetic expression entered in the calculator display and sets the last operator used to '='.
			 */
		case "=":
			compute();
			lastOperator = '='; 
			break;

			/*
			 * 
			 *This method is called when the user clicks on the "^" button. It first performs the computation for the previous operation
			 *using the compute() method. Then, it sets the lastOperator variable to '^' to indicate that the current operation is an exponentiation.
			 */
		case "^":
			compute();
			lastOperator = '^';
			break;

			/*
			 * Square root configuration square root = \u221a                
			 */
		case "\u221a":
			if(lastOperator != '=')
				result = Math.sqrt(Double.parseDouble(inStr));
			else 
				result = Math.sqrt(result);

			inStr = String.valueOf(result);
			tfDisplay.setText(inStr);
			break;

			/*	It retrieves the value stored in the memory and displays it in the calculator's text field.
			 *	It sets the text field to display the retrieved memory value as a string.
			 *	@param memory The memory value to be retrieved and displayed in the text field.
			 */
		case "MR":
			inStr = String.valueOf(memory);
			tfDisplay.setText(memory + "");
			break;

			/*
			 * Memory Plus 
			 * Adds the current result to the memory value and updates the memory display.
			 */
		case "M+":
			memory += result;
			memoryText.setText("memory = " + memory);
			break;

			/*
			 * Represents a button on a calculator that subtracts the first memory value from the current one when clicked.
			 * Performs a basic subtraction of the memory values.
			 * @param memoryValue the value stored in memory when the button was first pressed
			 * @return the result of subtracting the memoryValue from the currentValue
			 */
		case "M-":
			memory -= result;
			memoryText.setText("memory = " + memory);
			break;

			/*
			 * Btn Name: Memory clear 
			 * This is used to clear the memory
			 */
		case "MC":
			memory = 0.0;
			memoryText.setText("memory = " + memory);
			break;

			/*
			 * Btn: Clear
			 * This button is used to clear everything back to zero.
			 */
		case "C":
			result = 0;
			inStr = "0";
			lastOperator = ' ';
			tfDisplay.setText("0");
			break;

			/*
			 *  Btn: Backspace one digit 
			 *  This Btn is used to delete one digit to the left.
			 */
		case "\u2190":
			if (inStr.length() > 0) {
				inStr = inStr.substring(0, inStr.length()-1);
			}
			if (inStr.length() == 0) {
				inStr = "0";
			}
			tfDisplay.setText(inStr);
			break;

		}
	};

	/*User pushes '+', '-', '*', '/' or '=' button.
	 *Perform computation on the previous result and the current input number,
	 * based on the previous operator.
	 */
	private void compute() {
		double inNum = Double.parseDouble(inStr);
		inStr = "0";
		if (lastOperator == ' ') {
			result = inNum;
		} else if (lastOperator == '+') {
			result += inNum;
		} else if (lastOperator == '-') {
			result -= inNum;
		} else if (lastOperator == '*') {
			result *= inNum;
		} else if (lastOperator == '/') {
			result /= inNum;
		} else if (lastOperator == '^') {
			result = Math.pow(result, inNum);
		} else if (lastOperator == '=') {
			result /= inNum;
		}

		/*
		 * Keep the result for the next operation
		 */
		tfDisplay.setText(result + "");
	}

	/* 
	 * Setup the UI
	 */
	@Override
	public void start(Stage primaryStage) {

		/*
		 * Setup the Display TextField
		 */
		tfDisplay = new TextField("0");
		tfDisplay.setEditable(false);
		tfDisplay.setAlignment(Pos.CENTER_RIGHT);

		/*
		 *  Setup a GridPane for 4x4 Buttons
		 */
		int numCols = 4;
		GridPane paneButton = new GridPane();
		paneButton.setPadding(new Insets(15, 0, 15, 0));  // top, right, bottom, left
		paneButton.setVgap(5);  // Vertical gap between nodes
		paneButton.setHgap(5);  // Horizontal gap between nodes
		// Setup 4 columns of equal width, fill parent
		ColumnConstraints[] columns = new ColumnConstraints[numCols];
		for (int i = 0; i < numCols; ++i) {
			columns[i] = new ColumnConstraints();
			columns[i].setHgrow(Priority.ALWAYS) ;  // Allow column to grow
			columns[i].setFillWidth(true);  // Ask nodes to fill space for column
			paneButton.getColumnConstraints().add(columns[i]);


		}

		/*
		 *  Setup 24 Buttons and add to GridPane; and event handler
		 */
		btns = new Button[24];
		for (int i = 0; i < btns.length; ++i) {
			btns[i] = new Button(btnLabels[i]);
			btns[i].setOnAction(handler);  // Register event handler
			btns[i].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);  // full-width
			paneButton.add(btns[i], i % numCols, i / numCols);  // control, col, row

			/*
			 * This is for design purposes
			 * 
			 * */
			// Set button color based on label 
			// Operations
			if (btnLabels[i].equals("+")) {
				btns[i].setStyle("-fx-background-color: #f09a06;");

			} else if (btnLabels[i].equals("-")) {
				btns[i].setStyle("-fx-background-color: #f09a06;");
			}

			else if (btnLabels[i].equals("x")) {
				btns[i].setStyle("-fx-background-color: #f09a06;");
			}

			else if (btnLabels[i].equals("/")) {
				btns[i].setStyle("-fx-background-color: #f09a06;");
			}

			else if (btnLabels[i].equals("\u221a")) {
				btns[i].setStyle("-fx-background-color: #f09a06;");
			}

			else if (btnLabels[i].equals("=")) {
				btns[i].setStyle("-fx-background-color: #259595;");
			}

			else if (btnLabels[i].equals(".")) {
				btns[i].setStyle("-fx-background-color:  #d2d7da;");
			}


			// C and MC Buttons

			else if (btnLabels[i].equals("C")) {
				btns[i].setStyle("-fx-background-color:  #fbd40c;");
			}

			else if (btnLabels[i].equals("\u2190")) {
				btns[i].setStyle("-fx-background-color:  #fbd40c;");
			}

			else if (btnLabels[i].equals("^")) {
				btns[i].setStyle("-fx-background-color:  #fbd40c;");
			}

			else if (btnLabels[i].equals("C")) {
				btns[i].setStyle("-fx-background-color:  #fbd40c;");
			}


			// Numbers 0-9
			else if (btnLabels[i].equals("1")) {
				btns[i].setStyle("-fx-background-color: #d2d7da;");
			}

			else if (btnLabels[i].equals("2")) {
				btns[i].setStyle("-fx-background-color: #d2d7da;");
			}

			else if (btnLabels[i].equals("3")) {
				btns[i].setStyle("-fx-background-color: #d2d7da;");
			}

			else if (btnLabels[i].equals("4")) {
				btns[i].setStyle("-fx-background-color: #d2d7da;");
			}

			else if (btnLabels[i].equals("5")) {
				btns[i].setStyle("-fx-background-color: #d2d7da;");
			}

			else if (btnLabels[i].equals("6")) {
				btns[i].setStyle("-fx-background-color: #d2d7da;");
			}

			else if (btnLabels[i].equals("7")) {
				btns[i].setStyle("-fx-background-color: #d2d7da;");
			}

			else if (btnLabels[i].equals("8")) {
				btns[i].setStyle("-fx-background-color: #d2d7da;");
			}
			else if (btnLabels[i].equals("9")) {
				btns[i].setStyle("-fx-background-color: #d2d7da;");
			}

			else if (btnLabels[i].equals("0")) {
				btns[i].setStyle("-fx-background-color: #d2d7da;");
			}

			// M+ , M- , MR and MC buttons
			else if (btnLabels[i].equals("M+")) {
				btns[i].setStyle("-fx-background-color: #75cd56;");
			}

			else if (btnLabels[i].equals("M-")) {
				btns[i].setStyle("-fx-background-color: #75cd56;");
			}
			else if (btnLabels[i].equals("MR")) {
				btns[i].setStyle("-fx-background-color: #75cd56;");
			}

			else if (btnLabels[i].equals("MC")) {
				btns[i].setStyle("-fx-background-color: #75cd56;");
			}

		}

		/*
		 * 
		 *	The start method of the JavaFX application.
		 *	Sets up the UI with a BorderPane containing a TextField at the top, a GridPane of Buttons at the center,
		 *	and a Text object to display memory at the bottom.
		 *	@param primaryStage the primary stage of the JavaFX application
		 */

		BorderPane root = new BorderPane();
		root.setPadding(new Insets(15, 15, 15, 15));  // top, right, bottom, left
		root.setTop(tfDisplay);     // Top zone contains the TextField
		root.setCenter(paneButton); // Center zone contains the GridPane of Buttons

		memoryText = new Text("Memory = 0");

		root.setBottom(memoryText);
		primaryStage.setScene(new Scene(root, 300, 280));
		primaryStage.setTitle("JAVAFX CALCULATOR");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}// End of JavaFxCalculator class program 