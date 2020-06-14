package com.heshan.design.pattern.creational.protopyte;

import java.text.MessageFormat;

/**
 * @author 杉子
 * @date 2020/6/14 9:32
 */
public class MailUtil {
    public static void sendMail(Mail mail){
        String outputContent = "向{0}同学，邮件地址：{1}，邮件内容：{2}，发送邮件";
        System.out.println(MessageFormat.format(outputContent,mail.getName(),mail.getEmailAddress(),mail.getContent()));
    }
    public static void saveOriginMailRecord(Mail mail){
        System.out.println("存储记录，originMail:" + mail.getContent());
    }
}
