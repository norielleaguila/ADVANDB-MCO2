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
		
		xAxis.setLabel("Year");
        //creating the chart
        final LineChart<Number,Number> lineChart = 
                new LineChart<Number,Number>(xAxis,yAxis);
        
        //defining a series
        XYChart.Series series = new XYChart.Series();
        series.setName("Compensation %");
        //populating the series with data
        
        series.getData().add(new XYChart.Data(1998, 63.31));	// new XYChart.Data(xAxis, yAxis)
        series.getData().add(new XYChart.Data(1999, 66.10));
        series.getData().add(new XYChart.Data(2000, 71.71));
        series.getData().add(new XYChart.Data(2001, 73.41));
        series.getData().add(new XYChart.Data(2002, 74.49));
        series.getData().add(new XYChart.Data(2003, 74.49));
        series.getData().add(new XYChart.Data(2004, 74.49));
        series.getData().add(new XYChart.Data(2005, 74.49));
        series.getData().add(new XYChart.Data(2006, 70.97));
        series.getData().add(new XYChart.Data(2007, 70.97));
        series.getData().add(new XYChart.Data(2008, 71.71));
        series.getData().add(new XYChart.Data(2009, 70.97));
        series.getData().add(new XYChart.Data(2010, 70.97));
        series.getData().add(new XYChart.Data(2011, 70.97));
        series.getData().add(new XYChart.Data(2012, 71.71));
        series.getData().add(new XYChart.Data(2013, 71.71));
        series.getData().add(new XYChart.Data(2014, 74.51));
        
        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Teacher %");
        
        series2.getData().add(new XYChart.Data(1998, 31.94));	// new XYChart.Data(xAxis, yAxis)
        series2.getData().add(new XYChart.Data(1999, 41.86));
        series2.getData().add(new XYChart.Data(2000, 40.65));
        series2.getData().add(new XYChart.Data(2001, 33.62));
        series2.getData().add(new XYChart.Data(2002, 30.31));
        series2.getData().add(new XYChart.Data(2003, 33.56));
        series2.getData().add(new XYChart.Data(2004, 30.34));
        series2.getData().add(new XYChart.Data(2005, 30.61));
        series2.getData().add(new XYChart.Data(2006, 36.23));
        series2.getData().add(new XYChart.Data(2007, 36.35));
        series2.getData().add(new XYChart.Data(2008, 41.36));
        series2.getData().add(new XYChart.Data(2009, 36.52));
        series2.getData().add(new XYChart.Data(2010, 43.19));
        series2.getData().add(new XYChart.Data(2011, 43.28));
        series2.getData().add(new XYChart.Data(2012, 42.22));
        series2.getData().add(new XYChart.Data(2013, 33.62));
        series2.getData().add(new XYChart.Data(2014, 44.74));

		
		xAxis.setAutoRanging(false);
		xAxis.setLowerBound(1997);
		xAxis.setUpperBound(2015);
		
        lineChart.getData().addAll(series, series2);
        
        layout = new VBox(10);
        
        Button b = new Button("Run");
        
        layout.getChildren().addAll(lineChart, b);
        
        scene = new Scene(layout, 800, 600);
		
	}
	
	public Scene getScene(){
		return scene;
	}
	
}
