package Assignment5;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.lang.String;
import java.util.Date;

public class Student extends Person {
    public void kt18(){
        LocalDate ld1 =LocalDate.now();
        LocalDate ld2= LocalDate.parse(NgaySinh);
        int x1=(ld1.getYear());
        int x2=(ld2.getYear());
        System.out.println(x2);
        if (x1-x2>=18){
            System.out.println("Sinh vien du 18 tuoi");
        }else {
            System.out.println("Sinh vien chua du 18 tuoi");
        }

    }
}
