package com.hy.scheduling;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by wyx on 2017/7/27.
 */
@Service
public class SchedulingService {

    //@Scheduled(fixedRate = 2000)
    public void scheduling(){
        System.out.println("asdlf");
    }
}
