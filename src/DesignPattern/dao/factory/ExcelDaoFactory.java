package DesignPattern.dao.factory;

import DesignPattern.dao.*;

public class ExcelDaoFactory implements DaoFactory {

    public  DAO createDAO(String type)
    {
        DAO dao=null;
        if(type.equalsIgnoreCase("student"))
        {
            dao=new ExcelStudentDAO();
        } else if (type.equalsIgnoreCase("course")) {
            dao=new ExcelCouseDAO();
            
        } else{
            throw new IllegalArgumentException("invalid dao");
            
        }
        return dao;

    }
}
