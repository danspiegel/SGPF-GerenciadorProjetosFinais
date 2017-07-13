package br.com.gerenciadorprojetosfinais.dao;

import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class BaseDaoImpl extends NamedParameterJdbcDaoSupport implements BaseDao {

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
	protected static final String RETURNING                     = " RETURNING ";
	
	//--> Atributos genéricos
	private static final String VALOR                           = "VALOR";
	private static final String COLUNA                          = "COLUNA";
	private static final String TABELA                          = "TABELA";
	
	//@Autowired
	//NamedParameterJdbcTemplate jdbcTemplate;
	
	@Autowired
	private DataSource dataSource;

	@PostConstruct
	private void initialize(){
		setDataSource(dataSource);
	}
	
	/**
	 * {@inheritDoc}
	 */
	public Integer validarCamposInternos(String valor, String coluna, String tabela) throws SQLException {
		
		try{
			
			MapSqlParameterSource params = new MapSqlParameterSource();
			params.addValue(VALOR, valor);
			params.addValue(COLUNA, coluna);
			params.addValue(TABELA, tabela);
			
			StringBuilder sql = new StringBuilder();
			// SELECT
			sql.append(SELECT_COUNT);
			// FROM
			sql.append(FROM + DOIS_PONTOS + TABELA);
			// WHERE
			sql.append(WHERE);
			sql.append(DOIS_PONTOS + COLUNA + IGUAL + DOIS_PONTOS + VALOR);
			
			return getNamedParameterJdbcTemplate().queryForObject(sql.toString(), params, Integer.class);
			
		}
		catch(Exception e){
			throw new SQLException(e);
		}
		
	}
	
}
