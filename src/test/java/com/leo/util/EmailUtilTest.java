package com.leo.util;

import org.junit.Ignore;
import org.junit.Test;
import test.TestUtil;

import java.io.File;


public class EmailUtilTest {

    @Test
    @Ignore
    public void testMail() {
        EmailUtil se   = new EmailUtil(false);
        String path = TestUtil.path + "ali.gif";
        //se.doSendHtmlEmail("邮件主题", "邮件内容", "294864460@qq.com");
        File affix = new File(path);
        se.doSendHtmlEmail("亲爱的你好呀", "亲爱的我们去吃饭吧！！！！", "1242177685@qq.com", affix);//
    }
}