package de.quoss.test.data.source.fancy;

import javax.sql.XAConnection;
import javax.sql.XADataSource;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

public class MyFancyXaDataSource implements XADataSource {

    private static final Logger LOGGER = Logger.getLogger(MyFancyXaDataSource.class.getName());

    public MyFancyXaDataSource() {
        super();
        LOGGER.info("MyFancyXaDataSource()");
    }

    @Override
    public XAConnection getXAConnection() throws SQLException {
        LOGGER.info("getXAConnection()");
        return null;
    }

    @Override
    public XAConnection getXAConnection(String user, String password) throws SQLException {
        LOGGER.info("getXAConnection(String, String)");
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
}
