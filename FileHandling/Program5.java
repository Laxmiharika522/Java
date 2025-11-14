//writing always use BufferedOutputStream
import java.io.*;
public class Program5 {
    public static void main(String a[]) throws Exception{
        //taking input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String employeeFile = br.readLine();
        String backupFile = br.readLine();
        String reportFile = br.readLine();
        int n = Integer.parseInt(br.readLine());
        try(BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(employeeFile))){
            PrintStream ps = new PrintStream(bos);
            for(int i=0;i<n;i++){
                String record = br.readLine();
                ps.println(record);
            }
        }

        //for backup file we always use BufferedInputStream
        //reading the content from employeeFile and putting in backUpFile;
        //if you want to print in console you have to convert to characters(InputStreamReader) other wise no need just for copying
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(employeeFile));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(backupFile))){
            byte[] buffer = new byte[1024];
            int bytesRead;
            while((bytesRead=bis.read(buffer)) !=-1){
                bos.write(buffer,0,bytesRead);
            }
        }

        //to write from one file to another file
        try(BufferedReader filereader = new BufferedReader(new FileReader(employeeFile));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(reportFile));
            PrintStream ps = new PrintStream(bos)){
            ps.println("report File");
            ps.printf("%-10s | %-10s | %-10s\n","EMPID","NAME","SALARY");
            String line;
            int employeeCount=0;
            while((line = filereader.readLine())!=null){
                String[] content = line.split(",");
                if(content.length!=5) continue;
                String EmpId = content[0].trim();
                String name = content[1].trim();
                double basic = Double.parseDouble(content[2].trim());
                double allowance = Double.parseDouble(content[3].trim());
                double deduction = Double.parseDouble(content[4].trim());
                    
                double net = basic + allowance - deduction;
                ps.printf("%-10s | %-10s | %.2f\n",EmpId,name,net);
                employeeCount++;
            }
            ps.printf("Employee count %d",employeeCount);        
        }

        //print that report file use BufferedReader only
        try(BufferedReader bur = new BufferedReader(new FileReader(reportFile))){
            String line;
            while((line = bur.readLine()) != null){
                System.out.println(line);
            }
        }
    }
}
