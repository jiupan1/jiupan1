import org.junit.Test;
import utils.SimHashUtils;
import utils.TxtInOutUtils;

public class SimHashUtilsTest {

    @Test
    public void getHashTest() {
        String[] strings = {"原神", "是", "一款", "好玩", "的", "游戏"};
        for (String string : strings) {
            String stringHash = SimHashUtils.getHash(string);
            System.out.println(stringHash.length());
            System.out.println(stringHash);
        }
    }

    @Test
    public void getSimHashTest() {
        String str0 = TxtInOutUtils.readTxt("D:/test/orig.txt");
        String str1 = TxtInOutUtils.readTxt("D:/test/orig_0.8_add.txt");
        System.out.println(SimHashUtils.getSimHash(str0));
        System.out.println(SimHashUtils.getSimHash(str1));
    }
}