package com.leo.util.encrypt;

import junit.framework.TestCase;


public class BlowfishTest extends TestCase {

    public void testEncrypt() throws Exception {
        System.out.println(Blowfish.encrypt("12345","leo.com"));
    }

    public void testDecrypt() throws Exception {
        byte[] tt = Blowfish.encrypt("12345", "leo.com");
        System.out.println(Blowfish.decrypt("12345",tt));
    }
}