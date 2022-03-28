package com.corejava.day08.testinterface;

import com.corejava.day06.abstracedemov2.SecondPersion;
import lombok.Data;

@Data
public class Bike extends Vehicle{

    @Override
    public void move(double speed) {
        System.out.println("自行车以每小时" + speed + "的速度前进。");
    }

    public void bikeMethod(){
        System.out.println("自行车特有方法。");
    }
}
