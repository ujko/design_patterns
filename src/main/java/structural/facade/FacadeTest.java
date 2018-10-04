package structural.facade;

import java.sql.Connection;

public class FacadeTest {

    public static void main(String[] args) {
        String tableName = "Employee";

        Connection con = MySqlHelper.getMySqlDBConnection();
        MySqlHelper mySqlHelper = new MySqlHelper();
        mySqlHelper.geterateMySqlHTMLReport(tableName, con);

        Connection con1 = OracleHelper.getOracleDBConnection();
        OracleHelper oracleHelper = new OracleHelper();
        oracleHelper.generateOracleReport(tableName, con1);

        //generating MySql HTML report and Oracle PDF report using Facade
        HelperFacade.generateReport(DBType.MYSQL, ReportType.HTML, tableName);
        HelperFacade.generateReport(DBType.ORACLE, ReportType.PDF, tableName);
    }
}
