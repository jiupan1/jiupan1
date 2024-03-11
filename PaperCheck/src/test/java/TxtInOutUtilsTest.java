import org.junit.Test;
import utils.TxtInOutUtils;



public class TxtInOutUtilsTest {


    @Test
    public void readTxt() {
        // 路径存在，正常读取

        String str = TxtInOutUtils.readTxt("D:\\test\\orig.txt");
        String[] strings = str.split(" ");
        for (String string : strings) {
            System.out.println(string);
        }
    }

    @Test
    public void writeTxt() {
        // 路径存在，正常写入
        double[] elem = {0.11, 0.22, 0.33, 0.44, 0.55};
        for (double v : elem) {
            TxtInOutUtils.writeTxt(v, "D:/test/ans.txt");
        }
    }
    @Test
    public void readTxtFailTest() {
        // 路径不存在，读取失败
        TxtInOutUtils.readTxt("D:/test/none.txt");
    }
    @Test
    public void writeTxtFailTest() {
        // 路径错误，写入失败
        double[] elem = {0.11, 0.22, 0.33, 0.44, 0.55};
        for (double v : elem) {
            TxtInOutUtils.writeTxt(v, "User:/test/ans.txt");
        }
    }

}