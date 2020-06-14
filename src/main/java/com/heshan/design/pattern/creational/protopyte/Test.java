package com.heshan.design.pattern.creational.protopyte;

/**
 * @author 杉子
 * @date 2020/6/14 9:36
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");

        for (int i = 0; i < 10; i++) {
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("姓名" + i);
            mailTemp.setEmailAddress("姓名" + i + "@shan.123");
            mailTemp.setContent("nice");
            MailUtil.sendMail(mailTemp);

        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
