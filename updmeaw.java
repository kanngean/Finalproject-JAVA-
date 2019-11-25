import java.io.*;
import java.lang.*;
import java.util.regex.*;
class updmeaw {
  public static void main(String args[]) throws IOException {
    String waitopt;
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));    
    String buf; 
    waitopt  = "Wait your choice [menu, bye, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17] : ";
    displaymenu();
    System.out.print(waitopt);
    buf = stdin.readLine();
    while (!buf.equals("0")) {
      if (buf.equals("0") || buf.equals("bye")) {
        System.out.println("Bye Bye");  
        break;
      } 

      else if (buf.equals("1")) 
      {
        student();
        buf = " ";
      } 
      		else if (buf.equals("2")) 
      		{
        	subject();
        	buf = " ";
      		} 
      			else if (buf.equals("3")) 
      			{
        		register();
        		buf = " ";
      			} 

      else if (buf.equals("4") || buf.equals("l1")) 
      {
        list("student.dat");
        buf = " ";
      } 
      		else if (buf.equals("5") || buf.equals("l2")) 
      		{
       		list("subject.dat");
       		buf = " ";
      		}
      			else if (buf.equals("6") || buf.equals("l3"))
      			{
        		list("register.dat");
       			buf = " ";
      			}

     /* else if (buf.equals("7")) {
        listnum();
        buf = " ";
      } else if (buf.equals("8")) {
        converttohtm();
        buf = " ";
      } */

      else if (buf.equals("7") || buf.equals("ast")) 
      {
        addnewstudent();
        buf = " ";
      } 
      		else if (buf.equals("8") || buf.equals("asu")) 
      		{
       			addnewsubjects();
       			buf = " ";
     		} 
     				else if (buf.equals("9") || buf.equals("are")) 
     				{
       				 addnewregister();
       				 buf = " ";
     				} 

      else if (buf.equals("10") || buf.equals("dst")) 
      {
        deletestudent();
        buf = " ";
      } 
      		 else if (buf.equals("11") || buf.equals("dsu")) 
     		 {
      		  deletesubject();
       		  buf = " ";
     		 } 
     		 		 else if (buf.equals("12") || buf.equals("dre")) 
     				 {
       					 deleteregister();
       					 buf = " ";
      				 } 

      else if (buf.equals("13") || buf.equals("est")) 
      {
        editstudent();
        buf = " ";
      } 
		       else if (buf.equals("14") || buf.equals("esu")) 
		      {
		        editsubjects();
		        buf = " ";
		      } 
				       else if (buf.equals("15") || buf.equals("ere")) 
				      {
				        editregister();
				        buf = " ";
				      } 
	
      else if (buf.equals("16") || buf.equals("my")) 
      {
        myprofile();
        buf = " ";
      }

       else if (buf.equals("menu") || buf.equals("m")) 
       {
        displaymenu();
        buf = " ";
      } else {
        System.out.print(waitopt);
        buf = stdin.readLine();
        // buf = (char)System.in.read(); // for 1 character
      }
    }
  }
// ======================================================
  static void displaymenu () {
    System.out.println("0 : bye bye");
    System.out.println("1 : Create 3 fields, 3 records for student.dat");
    System.out.println("2 : Create 3 fields, 3 records for subject.dat");
    System.out.println("3 : Create 4 fields, 4 records for register.dat");
    System.out.println("4 : List all records to Student");
    System.out.println("5 : List all records to Subject");
    System.out.println("6 : List all records to Register");
    System.out.println("7 : Add new Student");
    System.out.println("8 : Add new Subject");
    System.out.println("9 : Add new Register");
    System.out.println("10 : Delete on ID Student");
    System.out.println("11 : Delete on ID Subject");
    System.out.println("12 : Delete on ID Register");
    System.out.println("13 : Edit data Student");
    System.out.println("14 : Edit data Subject");
    System.out.println("15 : Edit data Register");
    System.out.println("16 : Profile of the program developer.");
    System.out.println("");  
  }
// ======================================================
  public static void student () throws IOException {
    FileOutputStream fout = new FileOutputStream("student.dat");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    pout.println("590811001,Mr.surawit,Male");
    pout.println("590811002,Mr.Nattawut,Male");
    pout.println("590811003,Miss,Khuntika,Female");
    System.out.println("Create 3 records : completely");
    pout.close();
  }
// =======================
public static void subject () throws IOException {
    FileOutputStream fout = new FileOutputStream("subject.dat");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    pout.println("BCOM361,java,3");
    pout.println("BCOM314,MIS,3");
    System.out.println("Create 2 records : completely");
    pout.close();
  }
// =======================
public static void register () throws IOException {
    FileOutputStream fout = new FileOutputStream("register.dat");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    pout.println("590811001,BCOM314,A,1");
    pout.println("590811002,BCOM314,A,1");
    pout.println("590811003,BCOM314,A,1");
    System.out.println("Create 3 records : completely");
    pout.close();
  }
// ======================================================
  public static void list (String f) throws IOException {
    int n = 0;
    byte b[] = new byte[128];
    FileInputStream fin = new FileInputStream(f);
    while ((n = fin.read(b)) != -1) {
      for(int i=0;i<n;i++) {
        System.out.print((char)b[i]);
      }
    }
    fin.close();
  }
// ======================================================
public static void addnewstudent () throws IOException {
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
    FileOutputStream fout = new FileOutputStream("student.dat");
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


  // ==========================
    public static void addnewsubjects () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String subjectid,subjectname,credit;
	System.out.print("Wait Subjects ID : ");
    subjectid = stdin.readLine();
    System.out.print("Wait Subjects Name : ");
    subjectname = stdin.readLine();
    System.out.print("Wait Credit : ");
    credit = stdin.readLine();
    String b;
    String ar[] = new String[100];
    FileReader fin = new FileReader("subject.dat");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    //
    int tot = i;
    FileOutputStream fout = new FileOutputStream("subject.dat");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < tot) {      
      pout.println(ar[i]);     
      i = i + 1;
    }
    pout.println(subjectid + "," + subjectname + "," + credit);
    System.out.println("Add : completely");
    pout.close();
  }
// ==========================
    public static void addnewregister () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String registerid,subjectid,grade,sec;
    System.out.print("Wait  ID : ");
    registerid = stdin.readLine();
    System.out.print("Wait Subject id : ");
    subjectid = stdin.readLine();
    System.out.print("Wait Grade : ");
    grade = stdin.readLine();
    System.out.print("Wait Sec : ");
    sec = stdin.readLine();
    String b;
    String ar[] = new String[100];
    FileReader fin = new FileReader("register.dat");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    //
    int tot = i;
    FileOutputStream fout = new FileOutputStream("register.dat");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < tot) {      
      pout.println(ar[i]);     
      i = i + 1;
    }
    pout.println(registerid + "," + subjectid + "," + grade + "," + sec);
    System.out.println("Add : completely");
    pout.close();
  }


// ======================================================
  public static void deletestudent () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String id;
    System.out.print("Wait Student ID : ");
    id = stdin.readLine();
    String b;
    String ar[] = new String[100];
    FileReader fin = new FileReader("student.dat");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    //
    int tot = i;
    FileOutputStream fout = new FileOutputStream("student.dat");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < tot) {      
      if (id.equals(ar[i].substring(0,10))) {
        System.out.println("Delete : completely");
      } else {
        pout.println(ar[i]);
      }
      i = i + 1;
    }
    pout.close();
  }
  // ==========================
   public static void deletesubject () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String subjectid;
    System.out.print("Wait Subjects ID : ");
   subjectid = stdin.readLine();
    String b;
    String ar[] = new String[100];
    FileReader fin = new FileReader("subject.dat");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    //
    int tot = i;
    FileOutputStream fout = new FileOutputStream("subject.dat");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < tot) {      
      if (subjectid.equals(ar[i].substring(0,3))) {
        System.out.println("Delete : completely");
      } else {
        pout.println(ar[i]);
      }
      i = i + 1;
    }
    pout.close();
  }
// ===========================
   public static void deleteregister () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String bufid;
    System.out.print("Wait Register ID : ");
    bufid = stdin.readLine();
    String b;
    String ar[] = new String[10];
    FileReader fin = new FileReader("register.dat");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    //
    int tot = i;
    FileOutputStream fout = new FileOutputStream("register.dat");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < tot) {      
      if (bufid.equals(ar[i].substring(0,3))) {
        System.out.println("Delete : completely");
      } else {
        pout.println(ar[i]);
      }
      i = i + 1;
    }
    pout.close();
  }
// ===========================
 public static void editstudent () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String id,name,sex; 
    System.out.print("Wait id : ");
    id = stdin.readLine();
    System.out.print("Wait name : ");
    name = stdin.readLine();
    System.out.print("Wait sex : ");
    sex = stdin.readLine();
    String b;
    String ar[] = new String[100];
    FileReader fin = new FileReader("student.dat");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    //
    int tot = i;
    FileOutputStream fout = new FileOutputStream("student.dat");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < tot) {      
      if (id.equals(ar[i].substring(0,10))) {
        pout.println(id + "," + name + "," + sex);
        System.out.println("Edit : completely");
      } else {
        pout.println(ar[i]);
      }
      i = i + 1;    
    }
    pout.close();
  }
// ==========================
  public static void editsubjects () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String subjectid,subjectname,credit; 
    System.out.print("Wait subjectid : ");
    subjectid = stdin.readLine();
    System.out.print("Wait subjectname : ");
    subjectname = stdin.readLine();
    System.out.print("Wait credit : ");
    credit = stdin.readLine();
    String b;
    String ar[] = new String[100];
    FileReader fin = new FileReader("subject.dat");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    //
    int tot = i;
    FileOutputStream fout = new FileOutputStream("subject.dat");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < tot) {      
      if (subjectid.equals(ar[i].substring(0,10))) {
        pout.println(subjectid + "," + subjectname + "," + credit);
        System.out.println("Edit : completely");
      } else {
        pout.println(ar[i]);
      }
      i = i + 1;    
    }
    pout.close();
  }
// ==========================
  public static void editregister () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
   String registerid,subjectid,grade,sec;
    System.out.print("Wait  ID : ");
    registerid = stdin.readLine();
    System.out.print("Wait Subject id : ");
    subjectid = stdin.readLine();
    System.out.print("Wait Grade : ");
    grade = stdin.readLine();
    System.out.print("Wait Sec : ");
    sec = stdin.readLine();
    String b;
    String ar[] = new String[100];
    FileReader fin = new FileReader("register.dat");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    //
    int tot = i;
    FileOutputStream fout = new FileOutputStream("register.dat");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < tot) {      
      if (registerid.equals(ar[i].substring(0,4))) {
        pout.println(registerid + "," + subjectid + "," + grade + "," + sec);
        System.out.println("Edit : completely");
      } else {
        pout.println(ar[i]);
      }
      i = i + 1;
    }
    pout.close();
  }


// ======================================================
  public static void myprofile () throws IOException {
    System.out.println("Hello");
    System.out.println("My name is Praetiwa Kanngean");
    System.out.println("Nickname  Meaw");
    System.out.println("I was bron on 01/03/39");
    System.out.println("I am 23 year old");
    System.out.println("I am studying Nation Univercity");
  }
}