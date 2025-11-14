import java.io.*;
import java.text.DecimalFormat;

public class PayrollReport {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //inputStreamReader converts bytes into charecter

        // Read file names and number of records
        String inputFile = br.readLine();
        String backupFile = br.readLine();
        String reportFile = br.readLine();
        int n = Integer.parseInt(br.readLine());

        // 1️⃣ Write employee records to inputFile
        try(BufferedOutputStream bis = new BufferedOutputStream(new FileOutputStream(inputFile));
            PrintStream ps = new PrintStream(bis)){//while writing no need to convert byte to char but use printStream
               for (int i = 0; i < n; i++) {
                String record = br.readLine();
                ps.println(record);
            } 
        }

        // 2️⃣ Create backup copy using Buffered streams
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inputFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(backupFile))) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);//first time it will store 1024bytes in buffer that buffer is written in bos.if file size is more than 1024 then again 1024 is over written and that new string is stored in bos
            }
        }

        // 3️⃣ Generate payroll report
        int employeeCount = 0;
        try (BufferedReader fileReader = new BufferedReader(new FileReader(inputFile));
             PrintStream reportPs = new PrintStream(new BufferedOutputStream(new FileOutputStream(reportFile)))) {

            reportPs.println("Payroll Report");
            reportPs.printf("%-10s | %-10s | %-10s%n", "EmpID", "Name", "Net Salary");
            //%-10s → left-align text in 10-character width.

            //%n → platform-independent newline.
            String line;
            while ((line = fileReader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length != 5) continue; // skip invalid records

                //In Java, the trim() method is used on a String to remove all leading and trailing whitespace (spaces, tabs, newlines).
                String empId = parts[0].trim();
                String name = parts[1].trim();
                double basic = Double.parseDouble(parts[2].trim());
                double allowance = Double.parseDouble(parts[3].trim());
                double deduction = Double.parseDouble(parts[4].trim());

                double netSalary = basic + allowance - deduction;
                reportPs.printf("%-10s | %-10s | %.2f%n", empId, name, netSalary);
                employeeCount++;
            }
            reportPs.println("Total Employees: " + employeeCount);
        }

        // 4️⃣ Display report file contents
        System.out.println("Report File Contents");
        try (BufferedReader reportReader = new BufferedReader(new FileReader(reportFile))) {
            String line;
            while ((line = reportReader.readLine()) != null) {
                System.out.println(line);
            }
        }

        // 5️⃣ Display backup file contents
        System.out.println("Backup File Contents");
        try (BufferedReader backupReader = new BufferedReader(new FileReader(backupFile))) {
            String line;
            while ((line = backupReader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}

