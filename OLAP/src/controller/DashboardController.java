package controller;

import javafx.stage.Stage;
import view.Dashboard;

public class DashboardController extends Controller{

	public DashboardController(Stage stage) {
		super(stage);
	}

	@Override
	protected void initViews() {
		views.add(new Dashboard(this));
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
