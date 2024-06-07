package DesignPattern.dao;

public class ExcelStudentDAO implements DAO{
    @Override
    public void insert() {
        System.out.println("inserting student Details to excel");
    }
}
