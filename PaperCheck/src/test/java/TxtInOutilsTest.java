import org.junit.Test;
import utils.TxtInOutils;

import static org.junit.Assert.*;

public class TxtInOutilsTest {


    @Test
    public void readTxt() {
        // 路径存在，正常读取

        String str = TxtInOutils.readTxt("D:/test/orig.txt");
        String[] strings = str.split(" ");
        for (String string : strings) {
            System.out.println(string);
        }
    }

    @Test
    public void writeTxt() {
        // 路径存在，正常写入
        double[] elem = {0.11, 0.22, 0.33, 0.44, 0.55};
        for (int i = 0; i < elem.length; i++) {
            TxtInOutils.writeTxt(elem[i], "D:/test/ans.txt");
        }
    }
    @Test
    public void readTxtFailTest() {
        // 路径不存在，读取失败
        String str = TxtInOutils.readTxt("D:/test/none.txt");
    }
    @Test
    public void writeTxtFailTest() {
        // 路径错误，写入失败
        double[] elem = {0.11, 0.22, 0.33, 0.44, 0.55};
        for (int i = 0; i < elem.length; i++) {
            TxtInOutils.writeTxt(elem[i], "User:/test/ans.txt");
        }
    }

}