
import model.Query;

public class TestDriver {

	public static void main(String[] ARG){
		Query q = new Query();
		
		q.addSelect("hehe", -1);
		
		q.constructQuery();
		
		System.out.println(q.getQuery());
		
	}
	
}
