package testcharts;

import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class Line{
	
	private final NumberAxis xAxis;
	private final NumberAxis yAxis;
	
	private VBox layout;
	
	private Scene scene;
	
	public Line(){
		
		xAxis = new NumberAxis();
		yAxis = new NumberAxis();
		
		xAxis.setLabel("Number of Month");
        //creating the chart
        final LineChart<Number,Number> lineChart = 
                new LineChart<Number,Number>(xAxis,yAxis);
                
        lineChart.setTitle("Stock Monitoring, 2010");
        
        //defining a series
        XYChart.Series series = new XYChart.Series();
        series.setName("My portfolio");
        //populating the series with data
        
        series.getData().add(new XYChart.Data(1, 23));	// new XYChart.Data(xAxis, yAxis)
        series.getData().add(new XYChart.Data(2, 14));
        series.getData().add(new XYChart.Data(3, 15));
        series.getData().add(new XYChart.Data(4, 24));
        series.getData().add(new XYChart.Data(5, 34));
        series.getData().add(new XYChart.Data(6, 36));
        series.getData().add(new XYChart.Data(7, 22));
        series.getData().add(new XYChart.Data(8, 45));
        series.getData().add(new XYChart.Data(9, 43));
        series.getData().add(new XYChart.Data(10, 17));
        series.getData().add(new XYChart.Data(11, 29));
        series.getData().add(new XYChart.Data(12, 25));
		
        lineChart.getData().add(series);
        
        layout = new VBox(10);
        
        Button b = new Button("Run");
        
        b.setOnAction(e -> {
            series.getData().add(new XYChart.Data(13, 10));
        	
        });
        
        layout.getChildren().addAll(lineChart, b);
        
        scene = new Scene(layout, 800, 600);
		
	}
	
	public Scene getScene(){
		return scene;
	}
	
}
