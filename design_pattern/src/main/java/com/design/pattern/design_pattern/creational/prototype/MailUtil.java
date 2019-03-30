package com.design.pattern.design_pattern.creational.prototype;

import lombok.extern.slf4j.Slf4j;

import java.text.MessageFormat;

@Slf4j
public class MailUtil {
    public static void sendMail(Mail mail){
        String outputContent="向{}同学，邮件内容{}";
        log.info(outputContent,mail.getName(),mail.getContent());
    }
    public static void saveOriginMailRecord(Mail mail){
        log.info("存储邮件"+mail.getContent());
    }
}
