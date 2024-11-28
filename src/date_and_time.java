import java.util.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class date_and_time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  // size
        String[] name = new String[a];
        String[] time = new String[a];
        for(int i=0; i<a; i++){
            name[i] = sc.next();
            time[i] = sc.next();
        }
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime[] times = new LocalTime[a];
        LocalTime[] duplicate_times = new LocalTime[a];
        for(int i=0; i<a; i++){
            times[i] = LocalTime.parse(time[i],format);
            duplicate_times[i] = times[i];
        }
        Arrays.sort(times);
        for(int i=0; i<a; i++){
            for(int j=0; j<a; j++){
                if(times[i] == duplicate_times[j]){
                    System.out.print(name[j]+" "+(i+1));
                }
            }
        }

    }
}
