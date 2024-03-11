import org.junit.Test;
import utils.SimHashUtils;


public class ShortStringExceptionTest {
    @Test
    public void shortStringExceptionTest(){
        //测试str.length()<200的情况
        System.out.println(SimHashUtils.getSimHash("原神，启动！"));
    }



}