package DesignPattern.dao.factory;

import DesignPattern.dao.DAO;

public interface DaoFactory {

    public DAO createDAO(String type);
}
