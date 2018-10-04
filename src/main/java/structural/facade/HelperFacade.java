package structural.facade;

import java.sql.Connection;

public class HelperFacade {

    public static void generateReport(DBType dbType, ReportType reportType, String tablename) {
        Connection connection = null;
        switch (dbType) {
            case MYSQL:
                connection = MySqlHelper.getMySqlDBConnection();
                MySqlHelper mySqlHelper = new MySqlHelper();
                switch (reportType) {
                    case HTML:
                        mySqlHelper.geterateMySqlHTMLReport(tablename, connection);
                        break;
                    case PDF:
                        mySqlHelper.generateMySqlReport(tablename, connection);
                        break;
                }
                break;
            case ORACLE:
                connection = MySqlHelper.getMySqlDBConnection();
                OracleHelper oracleHelper = new OracleHelper();
                switch (reportType) {
                    case HTML:
                        oracleHelper.geterateOracleHTMLReport(tablename, connection);
                        break;
                    case PDF:
                        oracleHelper.generateOracleReport(tablename, connection);
                        break;
                }
                break;
        }
    }

}

