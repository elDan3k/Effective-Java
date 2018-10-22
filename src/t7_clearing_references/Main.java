package t7_clearing_references;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public class Main {

    public static void main(String[] args) {

        //Scheduler method
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(10);
        scheduledThreadPoolExecutor.execute(new TaskToClear());

        //LinkedHashMap method
        LinkedHashMap<Long, String> map = new LinkedHashMap<Long, String>() {
            protected boolean removeEldestEntry(Map.Entry<Long, String> eldest)
            {
                return size() > 3;
            }
        };
        map.put(1L, "first");
        map.put(2L, "second");
        map.put(3L, "third");

        System.out.println(map.containsValue("first"));


        //java.lang.ref

        //weakHashMap
    }
}
