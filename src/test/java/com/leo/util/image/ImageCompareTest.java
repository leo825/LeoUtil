package com.leo.util.image;

import com.leo.util.test.TestUtil;
import junit.framework.TestCase;

import java.io.File;


public class ImageCompareTest extends TestCase {

    public void testCompareImage() throws Exception {
        String path = TestUtil.path+"/image";
        float v = ImageCompare.compareImage(new File(path + "/1.jpg"), new File(path + "/1.jpg"));
        System.out.println(v);
    }
}