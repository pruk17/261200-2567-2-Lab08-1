class ThreadPrinter implements Runnable {//Runnable Interface for using Void run method
    private
        final int threadNumber; //#1,2,3
    public ThreadPrinter(int threadNumber) {
            this.threadNumber = threadNumber;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 50; i++) {
                System.out.println("thread #" + threadNumber + ": " + i);
                try {
                    Thread.sleep(100); //random delays to simulate real-time interactions
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
}