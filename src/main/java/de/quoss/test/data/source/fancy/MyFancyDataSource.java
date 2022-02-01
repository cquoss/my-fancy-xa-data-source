package de.quoss.test.data.source.fancy;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

public class MyFancyDataSource implements DataSource {

    private static final Logger LOGGER = Logger.getLogger(MyFancyDataSource.class.getName());

    public MyFancyDataSource() {
        super();
        LOGGER.info("MyFancyDataSource()");
    }

    @Override
    public Connection getConnection() throws SQLException {
        LOGGER.info("getConnection()");
        return null;
    }

    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        LOGGER.info("getConnection(String, String)");
        return null;
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        LOGGER.info("getLogWriter()");
        return null;
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {
        LOGGER.info("setLogWriter(PrintWriter)");
    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {
        LOGGER.info("setLoginTimeout(int)");
    }

    @Override
    public int getLoginTimeout() throws SQLException {
        LOGGER.info("getLoginTimeout()");
        return 0;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        LOGGER.info("getParentLogger()");
        return null;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        LOGGER.info("unwrap(Class<T>)");
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        LOGGER.info("isWrapperFor(Class<?>)");
        return false;
    }
}
