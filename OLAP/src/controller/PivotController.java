package controller;

import javafx.stage.Stage;
import view.Dashboard;
import view.PivotScreen;

public class PivotController extends Controller{

	public PivotController(Stage stage) {
		super(stage);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void initViews() {
		views.add(new PivotScreen(this));
	}

	@Override
	public void setScene(int n) {
		switch (n) {
		case 0:
			currentView = n;
			break;
			
		default:
			currentView = 0;
		}
	changeView ();
	}

}
