package com.leo.util.algorithmImpl;

import junit.framework.TestCase;
import org.junit.Test;
import com.leo.util.test.TestUtil;

import java.io.File;

public class FileTypeImplTest extends TestCase {

    @Test
    public void testFileType() {
        assertEquals("gif", FileTypeImpl.getFileType(new File(TestUtil.path + "ali.gif")));
        assertEquals("png", FileTypeImpl.getFileType(new File(TestUtil.path + "tgepng")));
    }

}