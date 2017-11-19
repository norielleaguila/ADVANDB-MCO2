package model;

import java.sql.*;

public class DBConnector {

	protected static final DBConnector instance = new DBConnector ();
	protected Connection con;
	protected Statement stmt;
	
	private DBConnector () {}
	
	public void setConnection (String host, String port, String dbname, String user, String pass) {
		try {
			Class.forName ("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection 
				(
					"jdbc:mysql://" + host + 
					":" + port + 
					"/" + dbname + 
					"?useSSL=false",
					user, pass
				);
			stmt = con.createStatement ();
		} catch (Exception e) { e.printStackTrace (); }
	}
	
	public void setConnection (String host, int port, String dbname, String user, String pass) {
		setConnection (host, port + "", dbname, user, pass);
	}
	
	public static DBConnector getInstance () {
		return instance;
	}

	public ResultSet query (String from) throws Exception {
		return query (new String[] {from});
	}

	public ResultSet query (String[] from) throws Exception {
		return query (null, from);
	}

	public ResultSet query (String select, String from) throws Exception {
		return query (new String[] {select}, new String[] {from});
	}

	public ResultSet query (String[] select, String[] from) throws Exception {
		return query (select, from, null);
	}

	public ResultSet query (String select, String from, String where) throws Exception {
		return query (new String[] {select}, new String[] {from}, new String[] {where});
	}

	public ResultSet query (String[] select, String[] from, String[] where) throws Exception {
		return query (select, from, where, null, null, null, true);
	}

	public ResultSet query (String select,
							String from, String where,
							String groupby, String having,
							String orderby) throws Exception {
		return query (new String[] {select},
				new String[] {from}, new String[] {where},
				new String[] {groupby}, new String[] {having},
				new String[] {orderby}, true);
	}

	public ResultSet query (String[] select,
							String[] from, String[] where,
							String[] groupby, String[] having,
							String[] orderby) throws Exception {
		return query (select, from, where, groupby, having, orderby, true);
	}

	public ResultSet query (String[] select,
							String[] from, String[] where,
							String[] groupby, String[] having,
							String[] orderby, boolean asc) throws Exception {

		// cant really get anything from nowhere
		if (from == null)
			throw new SQLException ("Missing FROM clause");

		// having needs group by
		if (groupby == null && having != null)
			throw new SQLException ("HAVING clause must have GROUP BY clause");

		StringBuilder stringBuilder = new StringBuilder ();

		// select
		stringBuilder.append ("select ");
		if (select == null)
			stringBuilder.append (" * ");
		else {
			appendParameters (stringBuilder, select);
		}

		// from
		stringBuilder.append (" from ");
		appendParameters (stringBuilder, from);

		// where
		if (where != null) {
			stringBuilder.append (" where ");
			appendParameters (stringBuilder, where);
		}

		// group by
		if (groupby != null) {
			stringBuilder.append (" group by ");
			appendParameters (stringBuilder, groupby);
		}

		// having
		if (having != null) {
			stringBuilder.append (" having ");
			appendParameters (stringBuilder, having);
		}

		// order by
		if (orderby != null) {
			stringBuilder.append (" order by ");
			appendParameters (stringBuilder, orderby);
			if (asc)
				stringBuilder.append (" ASC ");
			else
				stringBuilder.append (" DESC ");
		}

		// append semicolon lol
		stringBuilder.append (";");

		// debugging purposes
		// System.out.println (stringBuilder.toString ());

		return stmt.executeQuery (stringBuilder.toString ());
	}

	private StringBuilder appendParameters (StringBuilder stringBuilder, String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			stringBuilder.append (" ").append (arr[i]);
			if (i == arr.length - 1)
				stringBuilder.append (" ");
			else
				stringBuilder.append (", ");
		}

		return stringBuilder;
	}

}