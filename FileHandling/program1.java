import java.io.*;
import java.text.DecimalFormat;

public class program1 {
    public static void main(String[] args) throws Exception {
        //br is used to take input from console
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //systemin always givess in bytes we have to convert it into charecters

        // Read inputs
        String logFile = br.readLine();
        String reportFile = br.readLine();
        int n = Integer.parseInt(br.readLine()); //string is converted into integer

        // Simulate writing to log file using BufferedOutputStream
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(logFile))) {//open the file logFile to write
            PrintStream ps = new PrintStream(bos);//for easy writing
            for (int i = 0; i < n; i++) {
                String logEntry = br.readLine(); //br is used to take input
                ps.println(logEntry);//after taking input put it in logFile
            }
            ps.flush();//ensure that everything is writtn safely
        }
        // Reading from log file using BufferedInputStream and BufferedReader
        int totalEntries = 0;
        int errorCount = 0;
        System.out.println("=== Log File Contents ===");

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(logFile)); //we are using FileInputStream so it reads bytes
             BufferedReader fileReader = new BufferedReader(new InputStreamReader(bis))) {//bytes are converted to charecters

            String line;
            while ((line = fileReader.readLine()) != null) {//if line exists
                System.out.println(line);
                totalEntries++;
                if (line.contains("ERROR")) {//if that line has an error
                    errorCount++;
                }
            }
        }

        double errorPercentage = 0;
        if (totalEntries > 0) {
            errorPercentage = ((double) errorCount / totalEntries) * 100;
        }

        // Writing to report file
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(reportFile));
             PrintStream ps = new PrintStream(bos)) {//by using ps we can directly write into the file

            DecimalFormat df = new DecimalFormat("0.00");
            ps.println("Total log entries: " + totalEntries);
            ps.println("Error entries: " + errorCount);
            ps.println("Error percentage: " + df.format(errorPercentage) + "%");
            ps.flush();//ensures that everything is writen correctly
        }

        // Displaying report file contents
        System.out.println("=== Report File Contents ===");
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(reportFile)); //it reads bytes
             BufferedReader reportReader = new BufferedReader(new InputStreamReader(bis))) {//it converts into charecter

            String line;
            while ((line = reportReader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}  