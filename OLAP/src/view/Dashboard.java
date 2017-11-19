package view;

import controller.DashboardController;
import javafx.scene.Node;
import javafx.scene.control.Tab;
import javafx.scene.layout.FlowPane;

public class Dashboard extends Tab implements View{
	private FlowPane layout;
	private DashboardController controller;
	
	public Dashboard(DashboardController controller){
		this.controller = controller;
		
		initElements();
		initLayout();
		addChildren();
	}

	@Override
	public void initElements() {
		
	}

	@Override
	public void initLayout() {
		this.layout = new FlowPane();
		
		this.layout.getStylesheets().add(sheets[0]);
	}
	
	@Override
	public void addChildren() {
		
	}

	@Override
	public void update() {
		layout.getChildren().clear();
	}

	

}
