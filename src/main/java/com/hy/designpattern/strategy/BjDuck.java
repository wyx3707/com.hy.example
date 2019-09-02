package com.hy.designpattern.strategy;

public class BjDuck extends Duck {

    public void setItea(ITea iTea) {
        this.iTea = iTea;
    }

    public void setIrun(IRun irun) {
        this.iRun = irun;
    }

    @Override
    void tea() {
        iTea.tea();
    }

    @Override
    void run() {
        this.iRun.run();
    }
}
