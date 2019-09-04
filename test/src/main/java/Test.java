import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;


/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-08-30
 */
public class Test {

    public static void main(String[] args) {
        MysqlDataSource mysqlDataSource = new MysqlDataSource();
        mysqlDataSource.setUser("bcd");
        mysqlDataSource.setPassword("bcd");
        mysqlDataSource.setUrl("jdbc:mysql://localhost:3307/z9?" +
                "serverTimezone=UTC&useSSL=false");
        JdbcTemplate jdbcTemplate = new JdbcTemplate(mysqlDataSource);
        List<Map<String, Object>> query = jdbcTemplate.query(
                "show databases", new ColumnMapRowMapper());
        System.out.println(query);

    }
}
