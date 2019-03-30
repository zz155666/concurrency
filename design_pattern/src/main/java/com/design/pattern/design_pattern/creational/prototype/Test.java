package com.design.pattern.design_pattern.creational.prototype;

public class Test {
    public static void main(String[] args) {
        Mail mail=new Mail();
        mail.setContent("初始化模板");
        for(int i=0;i<10;i++){
            try {
                Mail mail1 = (Mail)mail.clone();
                mail1.setName("姓名"+i);
                mail1.setContent("恭喜");
                MailUtil.sendMail(mail1);
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
