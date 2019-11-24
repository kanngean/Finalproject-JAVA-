import java.io.*;
import java.lang.*;
import java.util.regex.*;
class meawaddstu {
  public static void main (String args[]) throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String id,name,sex;
    System.out.print("Wait id : ");
    id = stdin.readLine();
    System.out.print("Wait name : ");
    name = stdin.readLine();
    System.out.print("Wait sex : ");
    sex = stdin.readLine();
    String b;
    String ar[] = new String[10];
    FileReader fin = new FileReader("student.dat");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    int tot = i;
    FileOutputStream fout = new FileOutputStream("updmeaw.dat");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < tot) {      
        pout.println(ar[i]);
      i = i + 1;
    }
	pout.println(id+","+name+","+sex);
System.out.println("Add : completely");
    pout.close();
  }
}