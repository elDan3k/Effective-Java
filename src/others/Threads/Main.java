package others.Threads;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private List<StringTask> threadPool;

    public static void main(String[] args) throws InterruptedException {

        Main main = new Main();
        main.threadPool = new ArrayList<>();

        for(int i = 0; i < 20 ; i++) {
            main.threadPool.add(new StringTask((int)(Math.random()*1000), (int)(Math.random()*50), "X" + i));
        }

        for (StringTask stringTask : main.threadPool) {
            stringTask.start();
        }

        boolean completed = false;
        Thread.sleep(1000);
        for(int i = 0; i < 20 ; i++) {
            boolean allDone = true;
            int counter = 0;
            for (StringTask stringTask : main.threadPool) {
                if (!stringTask.isDone()) {
                    allDone = false;
                } else {
                    counter++;
                }
            }
            if (allDone) {
                System.out.println("COMPLETED AT " + i);
                completed = true;
                break;
            } else {
                System.out.println("SLEEPING " + i + " || COMPLETED: " + counter + "of 20");
                try {
                    if(i > 0) {
                        int idx = (int)(Math.random()*20);
                        System.out.println("Picked thread: " + idx );
                        StringTask str = main.threadPool.get(idx);
                        if (str.getState() == StringTask.TaskState.RUNNING){
                            System.out.println("ABORTING");
                            str.abort();
                        }
                    }
                    Thread.sleep(2000);
                } catch (Exception e) {
                    System.out.println("Interrupted!!!");
                }
            }
            main.threadPool.get(i).isDone();
        }

        if (completed) {
            System.out.println("COMPLETED IN DESIRED TIME");
        } else {
            System.out.println("FAILED TO COMPLETE IN DESIRED TIME");
        }

        for (StringTask stringTask : main.threadPool) {
            System.out.println("TASK: " + stringTask.getId() + " STATUS: " + stringTask.getState());
        }
    }
}
