package de.quoss.test.data.source.fancy;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;
import java.util.logging.Logger;

public class MyFancyDriver implements Driver {

    private static final Logger LOGGER = Logger.getLogger(MyFancyDriver.class.getName());

    public MyFancyDriver() {
        super();
        LOGGER.info("MyFancyDriver()");
    }

    @Override
    public Connection connect(String url, Properties info) throws SQLException {
        LOGGER.info("connect(String, Properties)");
        return null;
    }

    @Override
    public boolean acceptsURL(String url) throws SQLException {
        LOGGER.info("acceptsUrl(String)");
        return false;
    }

    @Override
    public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
        LOGGER.info("getPropertyInfo(String, Properties)");
        return new DriverPropertyInfo[0];
    }

    @Override
    public int getMajorVersion() {
        LOGGER.info("getMajorVersion()");
        return 0;
    }

    @Override
    public int getMinorVersion() {
        LOGGER.info("getMinorVersion()");
        return 0;
    }

    @Override
    public boolean jdbcCompliant() {
        LOGGER.info("jdbcCompliant()");
        return false;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        LOGGER.info("getParentLogger()");
        return null;
    }
}
