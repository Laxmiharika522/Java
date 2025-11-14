import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputFile = br.readLine();
        String backupFile = br.readLine();
        String logFile = br.readLine();
        int n = Integer.parseInt(br.readLine());

        // Step 1: Write book entries to input file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(inputFile))) {
            for (int i = 0; i < n; i++) {
                bw.write(br.readLine());
                bw.newLine();
            }
        }

        // Step 2: Copy inputFile → backupFile using BufferedInputStream and BufferedOutputStream
        int totalBytes = 0;
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inputFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(backupFile))) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
                totalBytes += bytesRead;
            }
        }

        // Step 3: Write log file using PrintStream wrapped in BufferedOutputStream
        try (PrintStream ps = new PrintStream(new BufferedOutputStream(new FileOutputStream(logFile)))) {
            ps.println("Report File Contents");
            ps.println("Total Books Processed: " + n);
            ps.println("Total Bytes Copied: " + totalBytes);
            ps.println("Backup Completed Successfully");
        }

        // Step 4: Display log file contents
        try (BufferedReader logReader = new BufferedReader(new FileReader(logFile))) {
            String line;
            while ((line = logReader.readLine()) != null) {
                System.out.println(line);
            }
        }

        System.out.println(); // blank line

        // Step 5: Display backup file contents
        System.out.println("Backup File Contents");
        try (BufferedReader backupReader = new BufferedReader(new FileReader(backupFile))) {
            String line;
            while ((line = backupReader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}

