package DesignPattern.dao.factory;

import DesignPattern.dao.CouseDAO;
import DesignPattern.dao.DAO;
import DesignPattern.dao.DBStudentDAO;

public class DbDaoFactory implements DaoFactory {

    public  DAO createDAO(String type)
    {
        DAO dao=null;
        if(type.equalsIgnoreCase("student"))
        {
            dao=new DBStudentDAO();
        } else if (type.equalsIgnoreCase("course")) {
            dao=new CouseDAO();
            
        } else{
            throw new IllegalArgumentException("invalid dao");
            
        }
        return dao;

    }
}
