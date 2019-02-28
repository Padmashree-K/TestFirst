package DateCov;

import sun.java2d.pipe.SpanShapeRenderer;

import java.text.SimpleDateFormat;
import java.util.Date;

public class formatDate {
    public static void main(String args[]){
        Date thisDate=new Date();
        System.out.println(thisDate);

        SimpleDateFormat formattedDate=new SimpleDateFormat("dd/MM/YYYY");
        String date=formattedDate.format(thisDate);
        System.out.println(date);

    }
}
