public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadPrinter(1));
        Thread thread2 = new Thread(new ThreadPrinter(2));
        Thread thread3 = new Thread(new ThreadPrinter(3));

        thread1.start();// start a new thread with run method
        thread2.start();
        thread3.start();
    }
    //summarize
        /*
           when there is no thread.sleep the execution is quickly as possible
           but after added the result is slower but generate with patterns
         */
}
//before add try,catch with thread.sleep(100): Threads of 1,2,3 are rapidly generate random patterns
        /*
            thread #2: 1
            thread #2: 2
            thread #2: 3
            thread #2: 4
            thread #2: 5
            thread #2: 6
            thread #2: 7
            thread #2: 8
            thread #2: 9
            thread #2: 10
            thread #2: 11
            thread #2: 12
            thread #2: 13
            thread #2: 14
            thread #2: 15
            thread #2: 16
            thread #2: 17
            thread #2: 18
            thread #2: 19
            thread #3: 1
            thread #1: 1
            thread #3: 2
            thread #...: ...   ||
            thread #...: ...   ||
            thread #...: ...   \/
            thread #3: 41
            thread #3: 42
            thread #3: 43
            thread #3: 44
            thread #3: 45
            thread #3: 46
            thread #3: 47
            thread #3: 48
            thread #3: 49
            thread #3: 50
            thread #2: 40
            thread #2: 41
            thread #2: 42
            thread #2: 43
            thread #2: 44
            thread #2: 45
            thread #2: 46
            thread #2: 47
            thread #2: 48
            thread #2: 49
            thread #2: 50
         */
    //After add Thread.sleep(100) or Thread.sleep(1000) the speed of execution is slower
    // but generate with patterns likes:
        /* thread number is swapping between #3,1,2 or #2,1,3 and others but consistent patterns
            thread #3: 1
            thread #1: 1
            thread #2: 1
            thread #3: 2
            thread #1: 2
            thread #2: 2
            thread #3: 3
            thread #1: 3
            thread #2: 3
            thread #3: 4
            thread #1: 4
            thread #2: 4
            thread #3: ...  ||
            thread #1: ...  ||
            thread #2: ...  \/
            thread #3: 49
            thread #1: 49
            thread #2: 49
            thread #3: 50
            thread #1: 50
            thread #2: 50
         */