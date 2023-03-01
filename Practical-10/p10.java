import java.util.Scanner;

import javax.xml.transform.Source;

class Trip {
    // String sourceArr[] = { "Surat", "Baroda", "Bardoli", "Mumbai" };
    // String destinationArr[] = { "Surat", "Baroda", "Bardoli", "Mumbai" };
    String source, destination, date;
    int days;

    Trip(String src, String des, String dte, int dys) {
        source = src;
        destination = des;
        date = dte;
        days = dys;
    }

    void bookNow(String variable) {
        
    }

    void showDetails() {
        System.out.println("Enter Start Date: " + date);
        System.out.println("Enter Source: " + source);
        System.out.println("Enter Destination: " + destination);
        System.out.println("Enter Start Date: " + date);
    }
}