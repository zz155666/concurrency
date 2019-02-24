package com.mmall.publish;

import com.mmall.concurrency.annoations.NotThreadSafe;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @ProjectName: concurrency
 * @Package: com.mmall.publish
 * @ClassName: UnsafePublish
 * @Description: java类作用描述
 * @Author: teerus
 * @CreateDate: 2019-02-24 23:33
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

@Slf4j
@NotThreadSafe
public class UnsafePublish {

    private String[] states={"a","b","c"};

    public String[] getStates(){
        return states;
    }

    public static void main(String[] args) {
        UnsafePublish unsafePublish=new UnsafePublish();
        log.info("{}", Arrays.toString(unsafePublish.getStates()));

        unsafePublish.getStates()[0]="d";
        log.info("{}", Arrays.toString(unsafePublish.getStates()));
    }
}
