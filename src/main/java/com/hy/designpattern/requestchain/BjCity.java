package com.hy.designpattern.requestchain;

 class BjCity extends CityElect {

     BjCity(CityElect cityElect) {
        this.cityElect = cityElect;
    }

    @Override
    void elect(int num) {
        if (num > 100) {
            System.out.println("我是北京");
        } else {
            this.cityElect.elect(num);
        }
    }
}
