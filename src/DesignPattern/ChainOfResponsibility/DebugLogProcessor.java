package DesignPattern.ChainOfResponsibility;

public class DebugLogProcessor extends LogProcessor {
    DebugLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public void log(int loglevel, String msg) {
        if(loglevel==DEBUG)
        {
            System.out.println("DEBUG "+msg);
        }
        else{
            super.log(loglevel,msg);
        }

    }
}
