import java.util.Scanner;
class Time {
    int hour, minute;

    public Time() {
        hour = 0;
        minute = 0;
    }

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public void inputTime() {

        if(hour>=0||hour<=12&&minute>=0||minute<=60){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hour: ");
        hour = scanner.nextInt();
        System.out.print("Enter minute: ");
        minute = scanner.nextInt();
        }else{
            System.out.println("Enter the hour and minutes within the correct parameters");
        }
    }

    public Time addTime(Time t) {
        Time result = new Time();
        result.minute = this.minute + t.minute;
        result.hour = this.hour + t.hour;

        if (result.minute >= 60) {
            result.hour += result.minute / 60;
            result.minute %= 60;
        }

        return result;
    }
    public Time subtractTime(Time t) {
        Time result = new Time();
        int totalMinutes1 = this.hour * 60 + this.minute;
        int totalMinutes2 = t.hour * 60 + t.minute;

        if (totalMinutes1 < totalMinutes2) {
            System.out.println("Subtraction not possible");
            return null;
        }

        int diffMinutes = totalMinutes1 - totalMinutes2;
        result.hour = diffMinutes / 60;
        result.minute = diffMinutes % 60;

        return result;
    }
    public void displayTime() {
        System.out.println("Time: " + hour + ":" + minute);
    }
}
public class oops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Time time1 = new Time();
        Time time2 = new Time();
        System.out.println("Enter first time:");
        time1.inputTime();

        System.out.println("Enter second time:");
        time2.inputTime();

        int choice ;
        System.out.println("Menu:");
        System.out.println("1.Add time ");
        System.out.println("2.Substract time ");
        choice = sc.nextInt();

        switch(choice){


            case 1:
            Time sumTime = time1.addTime(time2);
            System.out.print("Sum of times: ");
            sumTime.displayTime();
            break;

            case 2:
            Time diffTime = time1.subtractTime(time2);
            if (diffTime != null) {
                System.out.print("Difference of times: ");
                diffTime.displayTime();
                
            }
            break;

            default:

            System.out.println("Enter the correct method ");
            
            
        }


        sc.close();
        
     
    }
    
}