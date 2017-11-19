
import java.sql.ResultSet;

import controller.ProgramController;
import javafx.application.Application;
import javafx.stage.Stage;
import model.DBConnector;
import testcharts.Line;

public class Driver extends Application{
	
	Stage window;

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
		window = arg0;
		window.setTitle("ADVANDB-MCO2");
		
		DBConnector.getInstance ()
		.setConnection 
			("localhost", 3306, "teacher", 
			"root", "0825");
		
//		ResultSet rs = DBConnector.getInstance().query("countryd");
//		
//		while (rs.next ()) {
//			   // for example you have a string country code
//			   String code = rs.getString ("CountryCode");
//			   System.out.println(code);
//			}
//		
//		new ProgramController(window);
		
		window.setScene(new Line().getScene());
		window.show();
		
	}

	public static void main(String[] ARG){
		launch(ARG);
	}
	
}
