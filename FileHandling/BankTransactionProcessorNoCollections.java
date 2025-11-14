import java.io.*;

public class BankTransactionProcessorNoCollections {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read file names and number of transactions
        String inputFile = br.readLine();
        String backupFile = br.readLine();
        String reportFile = br.readLine();
        String logFile = br.readLine();
        int n = Integer.parseInt(br.readLine());

        // 1️⃣ Write transactions to inputFile
        try (PrintStream ps = new PrintStream(new BufferedOutputStream(new FileOutputStream(inputFile)))) {
            for (int i = 0; i < n; i++) {
                ps.println(br.readLine());
            }
        }

        // 2️⃣ Backup the input file
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inputFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(backupFile))) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        }

        // 3️⃣ Process transactions
        double totalCredit = 0.0;
        double totalDebit = 0.0;
        double highestTransaction = 0.0;

        String[] customers = new String[n];   // store customer names
        double[] balances = new double[n];    // corresponding balances
        int customerCount = 0;                // number of unique customers

        try (BufferedReader fileReader = new BufferedReader(new FileReader(inputFile));
             PrintStream reportPs = new PrintStream(new BufferedOutputStream(new FileOutputStream(reportFile)));
             PrintStream logPs = new PrintStream(new BufferedOutputStream(new FileOutputStream(logFile)))) {

            reportPs.println("Bank Transaction Report");

            String line;
            int lineNo = 1;
            while ((line = fileReader.readLine()) != null) {
                String[] parts = line.split(",");

                if (parts.length != 4) {
                    logPs.println("[WARN] Line " + lineNo + " skipped (invalid format: " + line + ")");
                    lineNo++;
                    continue;
                }

                String customer = parts[1];
                double amount;
                String type = parts[3];

                try {
                    amount = Double.parseDouble(parts[2]);
                } catch (NumberFormatException e) {
                    logPs.println("[WARN] Line " + lineNo + " skipped (invalid format: " + line + ")");
                    lineNo++;
                    continue;
                }

                if (!type.equals("C") && !type.equals("D")) {
                    logPs.println("[WARN] Line " + lineNo + " skipped (invalid format: " + line + ")");
                    lineNo++;
                    continue;
                }

                if (type.equals("C")) totalCredit += amount;
                else totalDebit += amount;

                if (amount > highestTransaction) highestTransaction = amount;

                // Update balance using arrays
                int index = -1;
                for (int i = 0; i < customerCount; i++) {
                    if (customers[i].equals(customer)) {
                        index = i;
                        break;
                    }
                }
                if (index == -1) { // new customer
                    customers[customerCount] = customer;
                    balances[customerCount] = type.equals("C") ? amount : -amount;
                    customerCount++;
                } else { // existing customer
                    balances[index] += type.equals("C") ? amount : -amount;
                }

                lineNo++;
            }

            // Write report
            reportPs.println("Total Credits: " + totalCredit);
            reportPs.println("Total Debits: " + totalDebit);
            reportPs.println("Highest Transaction: " + highestTransaction);
            reportPs.println("Final Balances");
            for (int i = 0; i < customerCount; i++) {
                reportPs.println(customers[i] + " -> " + balances[i]);
            }
        }

        // 4️⃣ Print report file
        System.out.println("Report File");
        try (BufferedReader reportReader = new BufferedReader(new FileReader(reportFile))) {
            String line;
            while ((line = reportReader.readLine()) != null) {
                System.out.println(line);
            }
        }

        // 5️⃣ Print log file
        System.out.println("Log File");
        try (BufferedReader logReader = new BufferedReader(new FileReader(logFile))) {
            String line;
            while ((line = logReader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}

