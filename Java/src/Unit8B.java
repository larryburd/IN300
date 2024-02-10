import java.io.File;
import java.util.Scanner;
import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import javafx.application.Application;

public class Unit8B extends Application {

@Override public void start(Stage stage) {

//Define the scatter chart
stage.setTitle("Scatter Chart Sample");
final NumberAxis yAxis = new NumberAxis(0, 180, 20);
final NumberAxis xAxis = new NumberAxis(0, 240, 20);
final ScatterChart scatterChart = new ScatterChart<>(xAxis, yAxis);

//Set the labels
xAxis.setLabel("Count_Female");
yAxis.setLabel("Count_Male");
scatterChart.setTitle("Demographic Scatter Graph");
XYChart.Series series = new XYChart.Series();

//Read the file
//NOTE: May have to change the path
try (Scanner dataReader = new Scanner(
new File("D:\\000000000000000000 - UNIVERSITIES\\Universities\\UNIVERSITIES\\Purdue\\IN300\\IN300_SolutionSet\\IN300_SolutionSet\\unit8\\Demographic_Statistics_By_Zip_Code.csv")))
{
dataReader.nextLine();
String line = null;
String[] row = null;

//Fill the scatter chart in loop
while (dataReader.hasNext()) {
line = dataReader.nextLine();
row = line.split(",");
int female = Integer.parseInt(row[2]);
int male = Integer.parseInt(row[4]);
series.getData().add(new XYChart.Data( female, male));
System.out.println("Female Count: " + female + " Male Count: " + male);
}
}
catch(Exception e) {
System.out.println(e);
}

scatterChart.getData().addAll(series);

//Show the chart
Scene scene = new Scene(scatterChart, 500, 400);
stage.setScene(scene);
stage.show();


}

public static void main(String[] args) {
launch(args);

}



}

