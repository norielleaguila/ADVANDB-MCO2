package view;

import java.util.ArrayList;
import javafx.scene.control.*;

public class OperationsScreen implements View{
	
	private ArrayList<CheckBox>	rollUp;
	
	public OperationsScreen(){
		
	}

	@Override
	public void initElements() {
		initRollUp();
	}

	@Override
	public void initLayout() {
		
	}

	@Override
	public void addChildren() {
		
	}

	@Override
	public void update() {
		
	}

	private void initRollUp(){
		rollUp = new ArrayList<>();
		
		rollUp.add(new CheckBox());
	}
	
}
