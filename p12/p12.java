import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.GridPane;

import javafx.stage.Stage;

public class p12 extends Application implements EventHandler<ActionEvent> {

	Button button = new Button("Calculate");
	GridPane layout = new GridPane();
	Scene content = new Scene(layout, 280, 350);
	ComboBox<String> year1ComboBox = new ComboBox<String>();
	ComboBox<String> month1ComboBox = new ComboBox<String>();
	ComboBox<String> day1ComboBox = new ComboBox<String>();
	
	ComboBox<String> year2ComboBox = new ComboBox<String>();
	ComboBox<String> month2ComboBox = new ComboBox<String>();
	ComboBox<String> day2ComboBox = new ComboBox<String>();
	Label entered1 = new Label();
	Label entered2 = new Label();

	String theYear1 = "";
	String theMonth1 = "";
	String theDay1 = "";
	
	String theYear2 = "";
	String theMonth2 = "";
	String theDay2 = "";

	Label amountOfYears = new Label();
	Label errorMessage = new Label();

	Label amountOfMonths = new Label();
	Label amountOfWeeks = new Label();
	Label amountOfDays = new Label();
	Label amountOfHours = new Label();
	Label amountOfMinutes = new Label();
	Label amountOfSeconds = new Label();

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage window) throws Exception {
		window.setTitle("Time Difference Calculator");

		button.setOnAction(this);

		year1ComboBox.getItems().addAll(allYears());
		month1ComboBox.getItems().addAll(allMonths());
		day1ComboBox.getItems().addAll(allDays());
		
		year2ComboBox.getItems().addAll(allYears());
		month2ComboBox.getItems().addAll(allMonths());
		day2ComboBox.getItems().addAll(allDays());

		layout.setVgap(4);
		layout.setHgap(10);
		layout.setPadding(new Insets(5, 5, 5, 5));
		layout.add(new Label("Year: "), 0, 0);
		layout.add(year1ComboBox, 1, 0);
		layout.add(year2ComboBox, 2, 0);
		layout.add(new Label("Month: "), 0, 5);
		layout.add(month1ComboBox, 1, 5);
		layout.add(month2ComboBox, 2, 5);
		layout.add(new Label("Day: "), 0, 10);
		layout.add(day1ComboBox, 1, 10);
		layout.add(day2ComboBox, 2, 10);
		layout.add(new Separator(), 0, 12);
		layout.add(new Label("You entered: "), 0, 15);
		layout.add(entered1, 1, 15);
		layout.add(entered2, 1, 16);
		layout.add(errorMessage, 1, 17);
		layout.add(button, 0, 20);
		layout.add(new Label("Years: "), 0, 25);
		layout.add(amountOfYears, 1, 25);
		layout.add(new Label("Months: "), 0, 26);
		layout.add(amountOfMonths, 1, 26);
		layout.add(new Label("Weeks: "), 0, 27);
		layout.add(amountOfWeeks, 1, 27);
		layout.add(new Label("Days: "), 0, 28);
		layout.add(amountOfDays, 1, 28);
		layout.add(new Label("Hours: "), 0, 29);
		layout.add(amountOfHours, 1, 29);
		layout.add(new Label("Minutes: "), 0, 30);
		layout.add(amountOfMinutes, 1, 30);
		layout.add(new Label("Seconds: "), 0, 31);
		layout.add(amountOfSeconds, 1, 31);

		window.setScene(content);
		window.show();
	}

	public void handle(ActionEvent event) {
		if (event.getSource() == button) {
			theYear1 = year1ComboBox.getValue();
			theMonth1 = month1ComboBox.getValue();
			theDay1 = day1ComboBox.getValue();
			
			theYear2 = year2ComboBox.getValue();
			theMonth2 = month2ComboBox.getValue();
			theDay2 = day2ComboBox.getValue();
			
			entered1.setText(theDay1 + " - " + theMonth1 + " - " + theYear1);
			entered2.setText(theDay2 + " - " + theMonth2 + " - " + theYear2);

			Computation c = new Computation(Integer.parseInt(theYear1), Integer.parseInt(theMonth1),
					Integer.parseInt(theDay1), Integer.parseInt(theYear2), Integer.parseInt(theMonth2), Integer.parseInt(theDay2));

			if (c.isValidDate()) {
				int[] returnValues = c.returnCalculations();

				amountOfYears.setText(Integer.toString(returnValues[0]));
				amountOfMonths.setText(Integer.toString(returnValues[1]));
				amountOfWeeks.setText(Integer.toString(returnValues[2]));
				amountOfDays.setText(Integer.toString(returnValues[3]));
				amountOfHours.setText(Integer.toString(returnValues[4]));
				amountOfMinutes.setText(Integer.toString(returnValues[5]));
				amountOfSeconds.setText(Integer.toString(returnValues[6]));
			} else {
				errorMessage.setText("Incorrecte datum ingevoerd!");
			}

		}
	}

	public void addComboBox(ComboBox<String> name, String[] allYears) {
		name = new ComboBox<String>();
		name.getItems().addAll(allYears);
		name.setEditable(true);
	}

	public String[] allYears() {
		String[] years = new String[100];
		int startingYear = 2016;
		for (int i = 0; i < years.length; i++)
			years[i] = Integer.toString(startingYear - i);
		return years;
	}

	public String[] allMonths() {
		String[] months = new String[12];
		int startingMonth = 1;
		for (int i = 0; i < months.length; i++)
			months[i] = Integer.toString(startingMonth + i);
		return months;
	}

	public String[] allDays() {
		String[] days = new String[31];
		int startingday = 1;
		for (int i = 0; i < days.length; i++)
			days[i] = Integer.toString(startingday + i);
		return days;
	}

}
