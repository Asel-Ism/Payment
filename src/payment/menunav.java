package payment;

import java.sql.Connection;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;


public class menunav {
    Connection conn = null;
    
    public void showMeTotal(){
        try{
            conn = ConnectMsSql.ConnectDB();
            JasperDesign jasperDesign = JRXmlLoader.load("C:\\Users\\iviiv\\Documents\\NetBeansProjects\\Payment\\src\\payment\\reporttot.jrxml");
            String sql = "SELECT * FROM dbo.View_1;";
            JRDesignQuery newQuery = new JRDesignQuery();
            newQuery.setText(sql);
            jasperDesign.setQuery(newQuery);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, conn);
            JasperViewer.viewReport(jasperPrint);
            
        }
        catch(Exception e){
        e.printStackTrace();
        }
    }
    
    public void showMeAllReportAll(){
        try{
            conn = ConnectMsSql.ConnectDB();
            JasperDesign jasperDesign = JRXmlLoader.load("C:\\Users\\iviiv\\Documents\\NetBeansProjects\\Payment\\src\\payment\\reportall.jrxml");
            String sql = "SELECT * FROM dbo.View_all;";
            JRDesignQuery newQuery = new JRDesignQuery();
            newQuery.setText(sql);
            jasperDesign.setQuery(newQuery);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, conn);
            JasperViewer.viewReport(jasperPrint);
            
        }
        catch(Exception e){
        e.printStackTrace();
        }
    }
    
    public void showMeAllReportPipre(){
        try{
            conn = ConnectMsSql.ConnectDB();
            JasperDesign jasperDesign = JRXmlLoader.load("C:\\Users\\iviiv\\Documents\\NetBeansProjects\\Payment\\src\\payment\\reportpipre.jrxml");
            String sql = "SELECT * FROM dbo.View_pipre;";
            JRDesignQuery newQuery = new JRDesignQuery();
            newQuery.setText(sql);
            jasperDesign.setQuery(newQuery);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, conn);
            JasperViewer.viewReport(jasperPrint);
            
        }
        catch(Exception e){
        e.printStackTrace();
        }
    }
    
    public void showMeAllReportPi(){
        try{
            conn = ConnectMsSql.ConnectDB();
            JasperDesign jasperDesign = JRXmlLoader.load("C:\\Users\\iviiv\\Documents\\NetBeansProjects\\Payment\\src\\payment\\reportpi.jrxml");
            String sql = "SELECT * FROM dbo.View_pi;";
            JRDesignQuery newQuery = new JRDesignQuery();
            newQuery.setText(sql);
            jasperDesign.setQuery(newQuery);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, conn);
            JasperViewer.viewReport(jasperPrint);
            
        }
        catch(Exception e){
        e.printStackTrace();
        }
    }
    
    public void showMeAllReportAcc(){
        try{
            conn = ConnectMsSql.ConnectDB();
            JasperDesign jasperDesign = JRXmlLoader.load("C:\\Users\\iviiv\\Documents\\NetBeansProjects\\Payment\\src\\payment\\reportacc.jrxml");
            String sql = "SELECT * FROM dbo.View_acc;";
            JRDesignQuery newQuery = new JRDesignQuery();
            newQuery.setText(sql);
            jasperDesign.setQuery(newQuery);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, conn);
            JasperViewer.viewReport(jasperPrint);
            
        }
        catch(Exception e){
        e.printStackTrace();
        }
    }
    
}
