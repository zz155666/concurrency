package com.mypractice.concurrencybasic;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NotifyAllTest {

    private static volatile Object resourceA=new Object();

    public static void main(String[] args) throws Exception {
        Thread threadONE=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                }catch (Exception e){
                    log.error("11",e);
                }
                log.info("child threadOne over");
            }
        });
        Thread threadTwo=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                }catch (Exception e){
                    log.error("11",e);
                }
                log.info("child threadTwo over");
            }
        });
        threadONE.start();
        threadTwo.start();

        log.info("wait all  child thread over");

        threadONE.join();
        threadTwo.join();

        log.info("all  child thread over!");
    }


}
