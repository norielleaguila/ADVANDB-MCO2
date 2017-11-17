import javafx.application.Application;
import javafx.stage.Stage;
import testcharts.Line;

public class Driver extends Application{
	
	Stage window;

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
		window = arg0;
		window.setTitle("ADVANDB-MCO2");
		
		Line lineChart = new Line();
		
		window.setScene(lineChart.getScene());
		window.show();
	}

	public static void main(String[] ARG){
		launch(ARG);
	}
	
}
