package DesignPattern.dao.factory;

public class DAOFactoryCreation {

    public static DaoFactory buildDAOFactory(String type)
    {
        DaoFactory factory=null;
        if(type.equalsIgnoreCase("db"))
        {
            factory=new DbDaoFactory();

        }
        else if(type.equalsIgnoreCase("Excel"))
        {
            factory=new ExcelDaoFactory();
        }
        return factory;
    }
}
