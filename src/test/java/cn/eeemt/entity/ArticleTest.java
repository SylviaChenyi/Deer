package cn.eeemt.entity;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/**
 * author: HuangXiquan <br/>
 * date: 2017/11/19/019 <br/>
 * time: 14:02 <br/>
 * description:
 */
public class ArticleTest {
    @Test
    public void wordCount() throws Exception {
        String s = "hello , hi";
        String trim = s.trim();
        if (trim.isEmpty())
            return;
        int length = trim.split("[\\s,\\.]+").length;
        System.out.println(length);
    }

    @Test
    public void wordCount2() throws Exception {
        String s = "hello hhi h";
        int wordCount = 0;
        boolean word = false;
        int endOfLine = s.length() - 1;

        for (int i = 0; i < s.length(); i++) {
            // if the char is a letter, word = true.
            if (Character.isLetter(s.charAt(i)) && i != endOfLine) {
                word = true;
                // if char isn't a letter and there have been letters before,
                // counter goes up.
            } else if (!Character.isLetter(s.charAt(i)) && word) {
                wordCount++;
                word = false;
                // last word of String; if it doesn't end with a non letter, it
                // wouldn't count without this.
            } else if (Character.isLetter(s.charAt(i)) && i == endOfLine) {
                wordCount++;
            }
        }
        System.out.println(wordCount);
    }

    @Test
    public void wordCount3() throws Exception {
        String text = "你好啊 hello ";
        String Reg = "^[\u4e00-\u9fa5]{1}$";//正则
        int result = 0;
        for (int i = 0; i < text.length(); i++) {
            String b = Character.toString(text.charAt(i));
            if (b.matches(Reg)) result++;
        }
        System.out.println(result);
    }

    @Test
    public void test01() throws Exception {
        String str = "<key>name</key><value>ming</value><age>30</age>";

        String s = StringUtils.removeAll(str, "^<html>.*?</html>");//用Regex的replace 先将<str </str 给过滤掉
        String[] arr = s.split(",");//再用split()拆分，由于有>>所以得到值置是奇数，所以聚值的时候注意下。
    }
}