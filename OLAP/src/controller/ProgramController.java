package controller;

import javafx.stage.Stage;
import view.Dashboard;
import view.ProgramScreen;

public class ProgramController extends Controller{
	private DashboardController dashController;
	
	public ProgramController(Stage stage) {
		super(stage);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void initViews() {
		views.add(new ProgramScreen(this, new DashboardController(this.getStage())));
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
