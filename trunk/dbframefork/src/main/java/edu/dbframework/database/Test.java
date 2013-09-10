package edu.dbframework.database;

import edu.dbframework.parse.beans.DatabaseXMLBean;
import edu.dbframework.parse.parsers.DatabaseBeanParser;

/**
 * Created with IntelliJ IDEA.
 * User: GreenPoser
 * Date: 09.06.13
 * Time: 15:49
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args) {
        DatabaseBeanParser parser = new DatabaseBeanParser("tables.parse");
        DatabaseXMLBean xmlBean = parser.getBeanFromXML();
        DatabaseXMLBean xmlBean2 = parser.getBeanFromXML();
        //xmlBean2.setTables(new ArrayList<TableItem>());
        System.out.println(xmlBean.equals(xmlBean2));

        /*ArrayList<String> cre = new ArrayList<String>();
        cre.add("Природничі науки");
        cre.add("Інформаційна безпека");
        DataUtils dataUtils = new DataUtils();
        dataUtils.getData(xmlBean.createTablesMap().get("proposition"));
        String query = dataUtils.createQuery(xmlBean.createTablesMap().get("branch"), "123", "branch_uid");
        System.out.println(query);
        System.out.println(dataUtils.getData(xmlBean.createTablesMap().get("direction"), "341", "branch_id"));*/
    }
}
