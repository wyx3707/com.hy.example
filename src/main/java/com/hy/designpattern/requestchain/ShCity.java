package com.hy.designpattern.requestchain;

 class ShCity extends CityElect {


     ShCity(CityElect cityElect) {
        this.cityElect = cityElect;
    }

    @Override
    void elect(int num) {
        if (num < 100) {
            System.out.println("我是上海");
        } else {
            this.cityElect.elect(num);
        }
    }
}
