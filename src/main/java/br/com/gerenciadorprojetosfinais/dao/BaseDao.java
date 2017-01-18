package br.com.gerenciadorprojetosfinais.dao;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class BaseDao extends JdbcDaoSupport {

	//--> Constantes do SQL
	
	protected static final String SELECT 						= " SELECT ";
	protected static final String SELECT_FULL                   = " SELECT * ";
	protected static final String SELECT_COUNT 					= "SELECT COUNT(*) ";
	protected static final String FROM 							= " FROM ";
	protected static final String WHERE 						= " WHERE ";
	protected static final String DOIS_PONTOS 					= ":";
	protected static final String IGUAL 						= " = ";
	protected static final String AND 							= " AND ";
	protected static final String OR 							= " OR ";
	protected static final String VIRGULA 						= ", ";
	protected static final String MAIOR 						= " > ";
	protected static final String MENOR 						= " < ";
	protected static final String MAIOR_IGUAL 					= " >= ";
	protected static final String MENOR_IGUAL 					= " <= ";
	protected static final String BETWEEN 						= " BETWEEN ";
	protected static final String DISTINCT	 					= " DISTINCT ";
	protected static final String INSERT                        = " INSERT INTO ";
	protected static final String VALUES                        = " VALUES ";
	protected static final String PARENTESE_ESQ                 = "(";
	protected static final String PARENTESE_DIR 				= ")";
	protected static final String GROUP_BY 						= " GROUP BY ";
	protected static final String ORDER_BY 						= " ORDER BY ";
	protected static final String COUNT 						= " COUNT";
	protected static final String AS 							= " AS ";
	protected static final String PONTO 						= ".";
	protected static final String ASTERISCO 					= "*";
	protected static final String SUM 							= " SUM";
	protected static final String INNER_JOIN                    = " INNER JOIN ";
	protected static final String ON                            = " ON ";
	protected static final String MAX                           = " MAX";
	
	@Autowired
	private DataSource dataSource;

	@PostConstruct
	private void initialize(){
		setDataSource(dataSource);
	}
	
}
