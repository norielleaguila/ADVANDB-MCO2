package view;

import controller.PivotController;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class PivotScreen extends Tab implements View{
	private static String[] FIELD_TITLES = new String[]{"Fields", "Values", "Columns", "Rows", "Filter"};
	
	private PivotController controller;
	
	private BorderPane layout;
	private VBox filterLayout;
	private TableView table;
	private VBox fieldListLayout;
	
	public PivotScreen(PivotController controller){
		super();
		this.controller = controller;
		
		initElements();
		
	}

	@Override
	public void initElements() {
		initFilterLayout();
	}

	@Override
	public void initLayout() {
		layout = new BorderPane();
		
		layout.setLeft(filterLayout);
//		layout.setCenter();
//		layout.setRight();
	}

	@Override
	public void addChildren() {
		
	}

	@Override
	public void update() {
		
	}
	
	public void initFilterLayout(){
		filterLayout = new VBox(10);
		
		HBox row1 = new HBox(10);
		Label filterLbl = new Label("Education Level");
		ChoiceBox<String> selection = new ChoiceBox<String>();
		selection.getItems().addAll("Primary", "Secondary", "Tertiary");
		row1.getChildren().addAll(filterLbl, selection);
		
		filterLayout.getChildren().add(row1);
	}
	
	public void initFieldListLayout(){
		fieldListLayout = new VBox(10);
		
		ScrollPane[] panes = new ScrollPane[5];
		
		for(int i = 0; i < panes.length; i++){
			panes[i] = new ScrollPane();
			
			VBox v = new VBox(5);
			Label lbl = new Label(FIELD_TITLES[i]);
			v.getChildren().add(lbl);
			
			panes[i].setContent(v);
		}
		
		fieldListLayout.getChildren().addAll(panes);
		
	}
}









