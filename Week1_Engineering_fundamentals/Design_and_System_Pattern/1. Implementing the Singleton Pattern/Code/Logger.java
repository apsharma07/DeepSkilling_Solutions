class Logger{
    // private static instance of Logger
    private static Logger logger;

    // private constructor of Logger
    private Logger(){
        System.out.println("Logger initialised");
    }

    //getInstance method is public. So we can access it from Class.
    public static Logger getInstance(){

        // Checking the instance value (No locking)
        if(logger==null){

            //Use synchronized for thread safety
            synchronized(Logger.class){
                if(logger==null){   // (Locking)
                    logger=new Logger();
                }
            }
        }
        return logger;
    }
}