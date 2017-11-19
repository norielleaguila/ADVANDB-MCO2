import java.util.Arrays;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
 
public class StackedBar extends Application {
 
    final static String eastAsia = "East Asia";
    final static String europe = "Europe";
    final static String latinAmerica = "Latin America";
    final static String middleEast = "Middle East";
    final static String northAmerica = "North America";
    final static String africa = "Sub-Saharan Africa";
    final CategoryAxis xAxis = new CategoryAxis();
    final NumberAxis yAxis = new NumberAxis();
    final StackedBarChart<String, Number> sbc =
            new StackedBarChart<>(xAxis, yAxis);
    final XYChart.Series<String, Number> series1 =
            new XYChart.Series<>();
    final XYChart.Series<String, Number> series2 =
            new XYChart.Series<>();
    final XYChart.Series<String, Number> series3 =
            new XYChart.Series<>();
 
    @Override public void start(Stage stage) {
        stage.setTitle("Bar Chart Sample");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String,Number> bc = 
            new BarChart<>(xAxis,yAxis);
        bc.setTitle("Region Summary");
        xAxis.setLabel("Region");       
        yAxis.setLabel("Teacher %");
 
        XYChart.Series series1 = new XYChart.Series();
        series1.setName(eastAsia);       
        series1.getData().add(new XYChart.Data("Primary", 18.695420895887164));
        series1.getData().add(new XYChart.Data("Secondary", 18.730170659490046));
        series1.getData().add(new XYChart.Data("Tertiary", 18.602041171882114));
        
        XYChart.Series series2 = new XYChart.Series();
        series2.setName(europe);
        series2.getData().add(new XYChart.Data("Primary", 24.438844750055868));
        series2.getData().add(new XYChart.Data("Secondary", 22.42071925070424));
        series2.getData().add(new XYChart.Data("Tertiary", 19.662409416635104));
        
        XYChart.Series series3 = new XYChart.Series();
        series3.setName(latinAmerica);
        series3.getData().add(new XYChart.Data("Primary", 18.168685267133068));
        series3.getData().add(new XYChart.Data("Secondary", 17.782413750797215));
        series3.getData().add(new XYChart.Data("Tertiary", 17.413984750462255));
        
        XYChart.Series series4 = new XYChart.Series();
        series4.setName(middleEast);
        series4.getData().add(new XYChart.Data("Primary", 15.676222515605925));
        series4.getData().add(new XYChart.Data("Secondary", 20.04537775063787));
        series4.getData().add(new XYChart.Data("Tertiary", 25.305466290213626));
        
        XYChart.Series series5 = new XYChart.Series();
        series5.setName(northAmerica);
        series5.getData().add(new XYChart.Data("Primary", 26.564304442900195));
        series5.getData().add(new XYChart.Data("Secondary", 23.921256241613072));
        series5.getData().add(new XYChart.Data("Tertiary", 22.357158627129454));
        
        XYChart.Series series6 = new XYChart.Series();
        series6.setName(africa);
        series6.getData().add(new XYChart.Data("Primary", 28.517473566030663));
        series6.getData().add(new XYChart.Data("Secondary", 34.89431265158735));
        series6.getData().add(new XYChart.Data("Tertiary", 34.192926683546524));
        
        Scene scene  = new Scene(bc,800,600);
        bc.getData().addAll(series1, series2, series3, series4, series5, series6);
        stage.setScene(scene);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}