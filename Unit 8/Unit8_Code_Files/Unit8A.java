import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class Unit8A extends Application {


@SuppressWarnings({ "unchecked" })
@Override public void start(Stage stage) {

//Array of 9 columns and 1280 rows
//Method is down below and fills an array
String[][] dataArray = getMyData();

//Define the bar chart
stage.setTitle("Bar Chart for Traffic Counts");
final CategoryAxis xAxis = new CategoryAxis();
final NumberAxis yAxis = new NumberAxis();
final BarChart<String,Number> bc =
new BarChart<String,Number>(xAxis,yAxis);
bc.setTitle("Traffic Counts");
xAxis.setLabel("Street");
yAxis.setLabel("Value");

//Set the data to fill the bar chart
@SuppressWarnings("rawtypes")
XYChart.Series series1 = new XYChart.Series();
series1.setName(dataArray[1][2]);
series1.getData().add(new XYChart.Data<String, Integer>("count1", Integer.parseInt(dataArray[1][4])));
series1.getData().add(new XYChart.Data<String, Integer>("count2", Integer.parseInt(dataArray[2][4])));

@SuppressWarnings("rawtypes")
XYChart.Series series2 = new XYChart.Series();
series2.setName(dataArray[8][2]);
series2.getData().add(new XYChart.Data<String, Integer>("count1", Integer.parseInt(dataArray[8][4])));
series2.getData().add(new XYChart.Data<String, Integer>("count2", Integer.parseInt(dataArray[9][4])));

@SuppressWarnings("rawtypes")
XYChart.Series series3 = new XYChart.Series();
series3.setName(dataArray[40][2]);
series3.getData().add(new XYChart.Data<String, Integer>("count1", Integer.parseInt(dataArray[40][4])));
series3.getData().add(new XYChart.Data<String, Integer>("count2", Integer.parseInt(dataArray[41][4])));

//Show the bar chart
Scene scene = new Scene(bc,800,600);
bc.getData().addAll(series1, series2, series3);
stage.setScene(scene);
stage.show();
}

public static void main(String[] args) {
launch(args);

}


public String[][] getMyData() {

String[][] csvArray = null;

try {

//Read the data.
//NOTE: May have to change the path
Scanner csvData = new Scanner(new File("C:\\Users\\laure\\OneDrive\\Documents\\Purdue\\IN300 - Programming for Data Analysis\\Unit 8\\Average_Daily_Traffic_Counts.csv"));

//Fill the array list with the data
ArrayList<String> list = new ArrayList<String>();
while (csvData.hasNext()) {
list.add(csvData.nextLine());
}
String[] tempArray = list.toArray(new String[1]);
csvArray = new String[tempArray.length][];

for(int i=0; i < tempArray.length; i++) {
csvArray[i] = tempArray[i].split(",");
}

csvData.close();

}
catch (Exception ex) {
System.out.println(ex);
}

//Return the array with data
return csvArray;
}

}
