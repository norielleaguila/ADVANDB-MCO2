package view;

public interface View {
	public static String[] sheets = new String[] {
			"dashboard.css"
	};
	
	public void initElements();
	public void initLayout();
	public void addChildren();
	public void update();
	
}
