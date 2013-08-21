package com.generalseguros.db;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * 
 * @author SmartSolutions
 * 
 */
public class CommonDB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4084479125425501951L;
	
	public final static Integer NULL_INTEGER = new Integer(0);

	private Connection con = null;
	private ResultSet rs = null;
	private Statement stmt = null;
	private PreparedStatement pstmt = null;

	/*private DataSource getDataSource() throws Exception {

		InitialContext cxt = new InitialContext();
		DataSource ds = null;
		try{
		 ds = (DataSource) cxt.lookup(CommonDB.getPropertyValue(DATA_SOURCE_STRING,PropertyType.COMMON));
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		if (ds == null) {
			throw new Exception("Data source not found!");
		}
		return ds;
	}
	
	private DataSource getWebSphereDataSource() throws Exception {

		Context ctx=new InitialContext();                        
		DataSource ds = null;
		try{
			String dsString = CommonDB.getPropertyValue(DATA_SOURCE_STRING,PropertyType.COMMON);
			System.out.println("DataSourceSTR: "+dsString);
		 ds = (DataSource) ctx.lookup(dsString);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		if (ds == null) {
			throw new Exception("Data source not found!");
		}
		return ds;
	}*/
	
	public Connection getDirectConnection() throws SQLException, ClassNotFoundException{
		 Connection conn = null;
		 Properties connectionProps = new Properties();
		 connectionProps.put("user", getPropertyValue(USERNAME, PropertyType.COMMON) );
		 connectionProps.put("password", getPropertyValue(PASSWORD, PropertyType.COMMON));
		 
		 String dbType = getPropertyValue(DB_TYPE, PropertyType.COMMON);
		 Class.forName(getPropertyValue(DRIVER_CLASS_NAME, PropertyType.COMMON));
		 
		    if (dbType.equals(SQLSERVER) ) {
		    	
		    	// e.g.  url="jdbc:sqlserver://localhost:1433;databaseName=SSO_GeneralSeguros"
		    	
		        conn = DriverManager.getConnection(
		                   "jdbc:sqlserver://" +
		                   getPropertyValue(SERVERNAME, PropertyType.COMMON) +
		                   ":" + getPropertyValue(PORTNUMBER, PropertyType.COMMON)+
		                   ";databaseName=" + getPropertyValue(DBNAME, PropertyType.COMMON)
		                   ,
		                   connectionProps);
		    } else if ( dbType.equals(INFORMIX) ) {
		        
		    	// e.g. jdbc:informix-sqli://192.168.239.129:60000/sso_generalseguros:INFORMIXSERVER=ol_rgonzalezdev1;DELIMIDENT=y;
		    	
		    	conn = DriverManager.getConnection(
		                   "jdbc:informix-sqli://" +
		    	getPropertyValue(SERVERNAME, PropertyType.COMMON) +
		    	":" + getPropertyValue(PORTNUMBER, PropertyType.COMMON)+
		    	"/"+ getPropertyValue(DBNAME, PropertyType.COMMON)+
		    	":"+ getPropertyValue(SERVER_INSTANCE_INFO, PropertyType.COMMON)
		    	           ,connectionProps);
		    } else if ( dbType.equals(HSQLDB) ){
		    	// e.g. jdbc:hsqldb:SSOGeneralSeguros , jdbc:hsqldb:hsql://localhost/mydb
		    	conn = DriverManager.getConnection(
		                   "jdbc:hsqldb:" +
		                   getPropertyValue(SERVERNAME, PropertyType.COMMON)
		                		   ,connectionProps);
		    }
		   
		    return conn;
	}

	/**
	 * Regresa una coneccion obtenida del DataSource
	 * 
	 * @return
	 */
	public Connection getConnection() {
		try {
			con = getDirectConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;
	}

	public ResultSet executeQuery(String query) throws SQLException {
		con = getConnection();
		stmt = con.createStatement();
		rs = stmt.executeQuery(query);
		return rs;
	}

	public ResultSet executePreparedStatementQuery(String query, Object[] values)
			throws SQLException {
		con = getConnection();
		pstmt = con.prepareStatement(query);

		this.setValuesToPreparedStatement(values);

		rs = pstmt.executeQuery();
		return rs;

	}

	public void closeResources() {
		try {
			if (rs != null ) // && !rs.isClosed()) java/sql/ResultSet.isClosed()Z
				rs.close();
			if (stmt != null )// && !stmt.isClosed())
				stmt.close();
			if (pstmt != null ) //&& !pstmt.isClosed()) java.sql.SQLException: Method not supported with this server. : IfxPreparedStatement.isClosed()
				pstmt.close();
			if (con != null ) // && !con.isClosed())
				con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void executePreparedStatementUpdate(String sql, Object[] values)
			throws SQLException {
		con = getConnection();
		pstmt = con.prepareStatement(sql);

		this.setValuesToPreparedStatement(values);

		pstmt.executeUpdate();

	}

	private void setValuesToPreparedStatement(Object[] values)
			throws SQLException {

		int i = 1;
		for (Object value : values) {

			if (value instanceof String) {
				pstmt.setString(i, (String) value);

			} else if (value instanceof Integer) {

				pstmt.setInt(i, (Integer) value);

			} else if (value instanceof Date) {

				pstmt.setDate(i, (Date) value);

			} else if (value instanceof Boolean) {

				pstmt.setBoolean(i, (Boolean) value);

			}
			// TODO maybe use reflection and use more values like Long, Float,
			// etc...

			++i;
		}

	}

	public static String tryToTrim(String s) {
		return s != null ? s.trim() : null;
	}

	/**
	 * Working with Common.properties
	 */

	private final static HashMap<String, String> propertiesCache = new HashMap<String, String>();

	public static String SQLSERVER = "SQLServer";
	public static String HSQLDB = "HSQLDB";
	public static String INFORMIX = "Informix";
	public static String MESES_CADUCA_PASSWORD = "MesesCaducaPassword";
	public static String MESES_CADUCA_SOPORTADO = "MesesCaducaSoportado";
	public static String UL_CLASS_NAME="ulClassName"; 
	public static String LI_CLASS_NAME="liClassName";
	public static String DATA_SOURCE_STRING="DataSourceString";
	public static String DEFAULT_SYSTEM="DefaultSystem";
	
	/**
	 * JDBC Driver sett	ings
	 */
	public static String USERNAME="username";
	public static String PASSWORD="password";
	public static String SERVERNAME="serverName";
	public static String PORTNUMBER="portNumber";
	public static String DBNAME="dbName";
	public static String SERVER_INSTANCE_INFO="serverInstanceInfo";
	public static String DRIVER_CLASS_NAME="driverClassName";
	
	

	public static String DB_TYPE = "DBType";

	public static String getPropertyValue(String propertyName) {
		return getPropertyValue(propertyName, PropertyType.DB_SERVER);
	}
	
	public static String getPropertyValue(String propertyName, PropertyType type ){
		
		String value = null;
		String dbType = null;
		
		if( propertiesCache.containsKey(DB_TYPE) ){
			dbType = propertiesCache.get(DB_TYPE); 
		}else{
			dbType = ResourceBundle.getBundle("com.generalseguros.db.Common").getString(DB_TYPE);
			propertiesCache.put(DB_TYPE, dbType );
		}
		

		if (propertiesCache.containsKey(propertyName)) {
			value = propertiesCache.get(propertyName);
		} else {
			
			String currentBundle = null; 
			switch (type) {
			case COMMON:
				currentBundle = "com.generalseguros.db.Common";
				break;
			case DB_SERVER:
				currentBundle = String.format("com.generalseguros.db.%sCommonDB",dbType);
			default:
				currentBundle = String.format("com.generalseguros.db.%sCommonDB",dbType);
				break;
			}
			
			

			value = ResourceBundle.getBundle(currentBundle).getString(propertyName);
			
			propertiesCache.put(propertyName, value);

		}
		return value;
	}
	
	

}
