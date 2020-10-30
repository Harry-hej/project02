package Test.java;

import com.sun.jdi.PathSearchingVirtualMachine;

import javax.management.loading.PrivateClassLoader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 使用模板快捷编写代码
 * @author shkstart
 * @create 2020-10-30-13:00
 */
public class TemplateTest {

    //模板六： prsf:可生成private staticfinal
    private static final int NUM=1;

    //变形： psf
    public static final int NUM1=87;

    //变形 psfi
    public static final int NUM2=89;

    //变形：psfs
    public static final String NATTTION="china";

    //模板1 psvm
    public static void main(String[] args) {

        //模板二
        System.out.println("Hello!");
        //变形：soutp / soutm / soutv/ xxx.sout/
        //变形：soutp
        System.out.println("args = " + Arrays.deepToString(args));
        //变形： soutm
        System.out.println("TemplateTest.main");
        //变形：soutv/
        int num1 = 10;
        System.out.println("num1 = " + num1);
        //变形：xxx.sout/
        System.out.println(num1);

        //模板三：fori

        String[] arr = {"Tom", "Jeery", "HanMeiMei", "Lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模板4：list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        for (Object o : list) {

        }

        //变形： list.fori
        for (int i = 0; i < list.size(); i++) {

        }

        //变形：list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }
    }

    public void method()
    {
        System.out.println("TemplatesTest.method");

        ArrayList list=new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        //模板五：ifn
        if (list == null) {

        }
        //变形：inn
        if (list != null) {

        }
    }
    //生成模板的显示
    public void testUpdate(){
        //自己操作的代码
    }

    /**
    *常量
    */
    private int i=2;
    /**
    *字符型
    */
    private String str;


}


