package model;

import java.util.ArrayList;

public class Query {
	protected ArrayList<String> select;
	protected ArrayList<String> from;
	protected ArrayList<String> where;
	protected ArrayList<String> groupBy;
	protected ArrayList<String> having;
	protected ArrayList<String> orderBy;

	protected String query;
	

	public Query() {
		select = new ArrayList<>();
		from = new ArrayList<>();
		where = new ArrayList<>();
		groupBy = new ArrayList<>();
		having = new ArrayList<>();
		orderBy = new ArrayList<>();
		
		this.query = "";
	}
	
	public Query(ArrayList<String> select, ArrayList<String> from, ArrayList<String> where, ArrayList<String> groupBy,
			ArrayList<String> having, ArrayList<String> orderBy) {
		super();
		this.select = select;
		this.from = from;
		this.where = where;
		this.groupBy = groupBy;
		this.having = having;
		this.orderBy = orderBy;
	}

	public void constructQuery(){
		
		query += "SELECT ";
		constructClause(select);

		query += "\nFROM ";
		constructClause(from);
		
		if(!where.isEmpty()){
			query += "\nWHERE ";
			constructClause(where);
		}
		
		if(!groupBy.isEmpty()){
			query += "\nGROUP BY ";
			constructClause(groupBy);
			query += "\nHAVING ";
			constructClause(having);
		}

		if(!orderBy.isEmpty()){
			query += "\nORDER BY ";
			constructClause(orderBy);
		}
		
		query += ";";	// end query
	}
	
	private void constructClause(ArrayList<String> clause){
		for(String a: clause){
			query += a + ", ";
		}
		
		if(clause.size() != 0){
			query = query.substring(0, query.length() - 2); // cuts out the last , 
			query += "\n";
		}
	}
	
	/**
	 * OLAP operation roll up. Reduces the number of times the data is grouped.
	 * @param n number of times to roll up
	 */
	public void rollUp(int n){
		for(int i = 0; i < n; i++)
			from.remove(from.size());
		
		constructQuery();
	}
	
	/**
	 * OLAP operation drill down. Increases the number of times the data is grouped.
	 * @param attrs attributes to group the data by
	 */
	public void drillDown(String[] attrs){
		for(int i = 0; i < attrs.length; i++){
			groupBy.add(attrs[i]);
		}	
		
		constructQuery();
	}
	
	public void slice(String attr, String filter){
		if(where.contains(attr)){
			
		}
	}
	
	public void addSelect(String a, int index){
		addToClause(select, a, index);
	}
	
	public void addFrom(String a, int index){
		addToClause(from, a, index);
	}
	
	public void addWhere(String a, int index){
		addToClause(where, a, index);
	}
	
	public void addGroupBy(String a, int index){
		addToClause(groupBy, a, index);
	}
	
	public void addHaving(String a, int index){
		addToClause(having, a, index);
	}
	
	public void addOrderBy(String a, int index){
		addToClause(orderBy, a, index);
	}
	
	private void addToClause(ArrayList<String> clause, String a, int index){
		if(index != -1)
			clause.add(index, a);
		else
			clause.add(a);
	}
	
	/* GETTERS & SETTERS */
	
	public String getQuery(){
		return query;
	}
	
	public void setQuery(String query) {
		this.query = query;
	}

	public ArrayList<String> getSelect() {
		return select;
	}
	
	public void setSelect(ArrayList<String> select){
		this.select = select;
	}

	public ArrayList<String> getFrom() {
		return from;
	}

	public void setFrom(ArrayList<String> from) {
		this.from = from;
	}

	public ArrayList<String> getWhere() {
		return where;
	}

	public void setWhere(ArrayList<String> where) {
		this.where = where;
	}

	public ArrayList<String> getGroupBy() {
		return groupBy;
	}

	public void setGroupBy(ArrayList<String> groupBy) {
		this.groupBy = groupBy;
	}

	public ArrayList<String> getHaving() {
		return having;
	}

	public void setHaving(ArrayList<String> having) {
		this.having = having;
	}

	public ArrayList<String> getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(ArrayList<String> orderBy) {
		this.orderBy = orderBy;
	}
	
}
