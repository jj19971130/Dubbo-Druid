package jj.druid.api;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface DruidInterface {
    public boolean execute(String sql) throws SQLException;
    public List<Map<String, String>> executeQuery(String sql) throws SQLException;
    public int executeUpdate(String sql) throws SQLException;
}
