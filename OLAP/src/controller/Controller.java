package controller;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.View;

public abstract class Controller {
	protected static List<Controller> controllers = new ArrayList<>();
	
	protected Stage window;
	protected Scene scene;
	protected int currentView;
	protected List<View> views;
	
	public Controller (Stage stage) {
		this.window = stage;
		window.setMinWidth (1280);
		window.setMinHeight (720);
		
		scene = new Scene (new Group (), window.getWidth (), window.getHeight ());
		
		views = new ArrayList<View> ();
		initViews ();
		
		setScene (0);
		
		addController(this);
		stage.setScene (scene);
		stage.show ();
	}
	
	protected abstract void initViews ();
	
	public abstract void setScene (int n);
	
	protected void changeView () {
		scene.setRoot ((Parent) views.get(currentView));
	}
	
	public Stage getStage () {
		return window;
	}
	
	protected static void addController(Controller c){
		controllers.add(c);
	}
}
