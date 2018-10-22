package others.Threads;

public class StringTask implements Runnable {

    public static int idCounter = 0;

    public enum TaskState {CREATED, RUNNING, ABORTED, READY}

    private int id;
    private int pauseTime;
    private int loops;
    private String word;
    private Thread thread;
    private StringBuilder sb;
    private TaskState state;

    public StringTask(int pauseTime, int loops, String word) {
        this.id = idCounter++;
        this.pauseTime = pauseTime;
        this.loops = loops;
        this.word = word;
        state = TaskState.CREATED;
    }

    public void run() {
        this.state = TaskState.RUNNING;
        //System.out.println("STARTED: " + id);
        int loopCounter = 0;
        for (int i = 0; i < loops; i++) {
            if(state != TaskState.ABORTED){
                sb.append(word);
                loopCounter++;
                try {
                    Thread.sleep(pauseTime);
                } catch (InterruptedException e) {
                    state = TaskState.ABORTED;
                }
            }
        }
        if(state != TaskState.ABORTED){
            state = TaskState.READY;
        }
        System.out.println(sb.toString() + " || " + loopCounter + " of " + loops);
    }

    public void start() {
        sb = new StringBuilder();
        thread = new Thread(this);
        thread.start();
    }

    public void abort() {
        System.out.println("THREAD " + id + " INTERRUPTED!");
        thread.interrupt();
        state = TaskState.ABORTED;
    }

    public boolean isDone() {
        return state == TaskState.READY || state == TaskState.ABORTED;
    }

    public int getId() {
        return id;
    }

    public TaskState getState() {
        return state;
    }

}
