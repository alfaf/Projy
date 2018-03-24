import java.net.*;
import java.util.*;
import java.io.*;

class polling{
    public static void send() throws IOException{
        String request_link = "http://localhost/java/polling.php?mail=abc";


        URL url = new URL(request_link);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

        StringBuffer sb = new StringBuffer();
        String line;

        while((line = in.readLine()) != null){
            sb.append(line);
        }

        in.close();
        System.out.print(sb.toString()+"\n");
    }

    public static void main(String[] args) {
        TimerTask task = new TimerTask() {
          @Override
          public void run() {
            try{
                send();
            }
            catch(Exception e){

            }
          }
        };
        
        Timer timer = new Timer();
        long delay = 0;
        long intevalPeriod = 1 * 3000; 
        
        // schedules the task to be run in an interval 
        timer.scheduleAtFixedRate(task, delay,
                                    intevalPeriod);
      
      } // end of main
}