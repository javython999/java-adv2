package annotation.java;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SuppressWarningsCase {

    @SuppressWarnings("unused")
    public void unusedWaring() {
        // 사용되지 않는 변수 경고 억제

        int unusedVariable = 10;
    }

    @SuppressWarnings("deprecation")
    public void deprecatedMethod() {
        Date date = new Date();
        int date1 = date.getDate();
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    public void uncheckedCast() {
        List list = new ArrayList();

        List<String> stringList = (List<String>) list;
    }


    @SuppressWarnings("all")
    public void suppressAllWarning() {
        Date date = new Date();
        int date1 = date.getDate();
        List list = new ArrayList();
        List<String> stringList = (List<String>) list;
    }

}
