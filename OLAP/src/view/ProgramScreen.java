package view;

import javafx.scene.control.TabPane;

import java.util.ArrayList;

import controller.DashboardController;
import controller.ProgramController;
import javafx.scene.control.Tab;

public class ProgramScreen extends TabPane implements View{

	private ArrayList<Tab> tabs;
	private DashboardController dashController;
	private ProgramController progController;
	
	public ProgramScreen(ProgramController progController, DashboardController dashController){
		tabs = new ArrayList<Tab>();
		this.progController = progController;
		this.dashController = dashController;
		
		initElements();
	}
	
	@Override
	public void initElements() {
		// TODO Auto-generated method stub
		tabs.add(new Dashboard(dashController));
//		tabs.add(new PivotScreen(pivotController));
	}

	@Override
	public void initLayout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addChildren() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
