package DesignPattern.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        LogProcessor logger=new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logger.log(LogProcessor.ERROR,"Exception happens");
        //logger.log(LogProcessor.DEBUG,"debug is on");
        //logger.log(LogProcessor.INFO,"information");
    }
}
