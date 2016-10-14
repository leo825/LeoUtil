package com.leo.util.algorithmImpl;

import com.leo.util.test.TestUtil;
import org.junit.Test;

public class FileImplTest {

    @Test
    public void TestCpdetector() throws Exception {
        System.out.println(FileImpl.simpleEncoding(TestUtil.path + "GBK.txt"));
        System.out.println(new FileImpl().guestFileEncoding(TestUtil.path + "GBK.txt"));
        System.out.println(new FileImpl().guestFileEncoding(TestUtil.path + "GBK.txt", 3));


        System.out.println(FileImpl.simpleEncoding(TestUtil.path + "UTF8.txt"));
        System.out.println(new FileImpl().guestFileEncoding(TestUtil.path + "UTF8.txt"));
        System.out.println(new FileImpl().guestFileEncoding(TestUtil.path + "UTF8.txt", 3));
    }
}