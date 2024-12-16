class mythreads implements Runnable{

    public void run(){
        for(int i =1 ;i<=10;i++){
            System.out.println("the value of i is "+ i);
        }
        try{Thread.sleep(100000);
        }catch(Exception e){

        }
    }

    public static void main(String[] args) {
        mythreads t1 = new mythreads();
        
        Thread thr = new Thread(t1);
        


        //object of another thread 
        threads2 t2 = new threads2();
        thr.start();
        t2.start();
    }

}




