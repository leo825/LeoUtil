package com.leo.util.string;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;
import org.junit.Test;

/**
 * Created by LX on 2016/12/6.
 */
public class XmlJsonUtilTest {

    @Test
    public void testJson2Xml() throws org.json.JSONException {
        String jsonStr = "{\n" +
                "    \"total\":3,\n" +
                "    \"rows\":[{\n" +
                "        \"id\":1,\n" +
                "        \"name\":\"会场1\",\n" +
                "        \"remark\":\"\",\n" +
                "        \"ip\":\"103.19.31.12\",\n" +
                "        \"status\":\"正常\",\n" +
                "        \"audio\":\"音频1\",\n" +
                "        \"video\":\"视频1\",\n" +
                "        \"role\":\"角色1\",\n" +
                "        \"content\":\"测试内容\",\n" +
                "        \"mcu\":\"mcu1\"\n" +
                "    },{\n" +
                "      \"id\":2,\n" +
                "      \"name\":\"会场2\",\n" +
                "      \"remark\":\"\",\n" +
                "      \"ip\":\"103.19.21.12\",\n" +
                "      \"status\":\"正常\",\n" +
                "      \"audio\":\"音频2\",\n" +
                "      \"video\":\"视频2\",\n" +
                "      \"role\":\"角色2\",\n" +
                "      \"content\":\"测试内容\",\n" +
                "      \"mcu\":\"mcu2\"\n" +
                "    },{\n" +
                "      \"id\":3,\n" +
                "      \"name\":\"会场3\",\n" +
                "      \"remark\":\"\",\n" +
                "      \"ip\":\"103.19.41.12\",\n" +
                "      \"status\":\"正常\",\n" +
                "      \"audio\":\"音频3\",\n" +
                "      \"video\":\"视频3\",\n" +
                "      \"role\":\"角色3\",\n" +
                "      \"content\":\"测试内容\",\n" +
                "      \"mcu\":\"mcu2\"\n" +
                "    }]\n" +
                "}";
        System.out.println("原来的json："+jsonStr);

        System.out.println("转换后的json："+XmlJsonUtil.json2Xml(jsonStr,"UTF-8","root"));
    }

    @Test
    public void testXml2Json() {
        String xmlStr = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<root><total>3</total><rows><role>角色1</role><ip>103.19.31.12</ip><name>会场1</name><remark/><id>1</id><audio>音频1</audio><video>视频1</video>测试内容<mcu>mcu1</mcu><status>正常</status></rows><rows><role>角色2</role><ip>103.19.21.12</ip><name>会场2</name><remark/><id>2</id><audio>音频2</audio><video>视频2</video>测试内容<mcu>mcu2</mcu><status>正常</status></rows><rows><role>角色3</role><ip>103.19.41.12</ip><name>会场3</name><remark/><id>3</id><audio>音频3</audio><video>视频3</video>测试内容<mcu>mcu2</mcu><status>正常</status></rows></root>";
        System.out.println("原来的xml："+xmlStr);
        System.out.println("转换后的xml："+XmlJsonUtil.xml2Json(xmlStr));
    }

}
