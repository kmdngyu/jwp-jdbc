package slipp.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface PreparedStatementSetter {
    void values(PreparedStatement pstmt) throws SQLException;
}
