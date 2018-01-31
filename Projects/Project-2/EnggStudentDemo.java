import java.util.*;
import java.io.*;
import java.util.StringTokenizer;
class EnggStudentDemo
{
	public static void main(String[] sekhar)throws IOException
	{
		CSEStudentList cse=new  CSEStudentList();
		ECEStudentList ece=new ECEStudentList();
		MECHStudentList mech=new MECHStudentList();
		CIVILStudentList civil=new CIVILStudentList();
		METALStudentList metal=new METALStudentList();
		CHEMStudentList chem=new CHEMStudentList();
		FileReader fr= new FileReader("Data.txt");
		BufferedReader br= new BufferedReader(fr);
		String s="",s1="",s2="",s3="",s4="",s5="",s6="",s7="",s8="";
		
		while((s=br.readLine())!=null)
		{
			
			StringTokenizer str=new StringTokenizer(s);
			while(str.hasMoreTokens())
			{
				s=str.nextToken();
				s1=str.nextToken();
				s2=str.nextToken();
				s3=str.nextToken();
				s4=str.nextToken();
				s5=str.nextToken();
				int b=Integer.parseInt(s5);
				s6=str.nextToken();
				s7=str.nextToken();
				s8=str.nextToken();
				Float gpa= Float.parseFloat(s8);
				
				if(s6.equals("ECE"))
					ece.create(s,s1,s2,s3,s4,b,s6,s7,gpa);
				if(s6.equals("CSE"))
					cse.create(s,s1,s2,s3,s4,b,s6,s7,gpa);
				if(s6.equals("CIVIL"))
					civil.create(s,s1,s2,s3,s4,b,s6,s7,gpa);
				if(s6.equals("MME"))
					metal.create(s,s1,s2,s3,s4,b,s6,s7,gpa);
				if(s6.equals("MECH"))
					mech.create(s,s1,s2,s3,s4,b,s6,s7,gpa);
				if(s6.equals("CHEM"))
					chem.create(s,s1,s2,s3,s4,b,s6,s7,gpa);


				
				
			}
		}
		
		Scanner str1= new Scanner(System.in);
		int i=1;
		while(i==1)
		{
			System.out.println("*************************");
			System.out.print("1. Display"+"\n"+"2. Search"+"\n"+"3. Delete"+"\n" +"4. Clear Duplicated Values"+"\n"+"5. Inesrt Items"+"\n"+"6. Sorted List"+"\n"+"7. Write Into a File "+"\n"+"8. Exit\n");
			System.out.println("***********************");
			System.out.print("Enter UR Option: ");
			int n= str1.nextInt();
			if(n==1)  //Display
			{
				System.out.print("1. CSE\t"+"2. ECE\t"+"3. MECH\t"+"4. CIVIL\t"+"5. CHEM\t"+"6. MME\n"+"Choose Ur Option: ");
				int n1= str1.nextInt();
				if(n1==1)
					cse.traversal();
				else if(n1==2)
					ece.traversal();
				else if(n1==3)
					mech.traversal();
				else if(n1==4)
					civil.traversal();
				else if(n1==5)
					chem.traversal();
				else if(n1==6)
					metal.traversal();
				else 
					System.out.println("Invalid option .....Try again!!!!");

			}
			if(n==2)
			{

				System.out.print("1. CSE\t"+"2. ECE\t"+"3. MECH\t"+"4. CIVIL\t"+"5. CHEM\t"+"6. MME\n"+"Choose Ur Option: ");
				int n1= str1.nextInt();
				System.out.println("Enter ID-No to Search: ");
				String key= str1.next();		
				if(n1==1)
					cse.search(key);
				else if(n1==2)
					ece.search(key);
				else if(n1==3)
					mech.search(key);
				else if(n1==4)
					civil.search(key);
				else if(n1==5)
					chem.search(key);
				else if(n1==6)
					metal.search(key);
				else 
					System.out.println("Invalid option .....Try again!!!!");
				
				
				
			}
			
			if(n==3)
			{
				System.out.print("1. CSE\t"+"2. ECE\t"+"3. MECH\t"+"4. CIVIL\t"+"5. CHEM\t"+"6. MME\t"+"7. Delete All Duplicate Values\n"+"Choose Ur Option: ");
				int n1= str1.nextInt();
				System.out.println("Enter ID-No to Delete (if U choose Duplicate just press any Character and press Enter): ");
				String key1= str1.next();		
				if(n1==1)
				{
					int k=cse.delete(key1);
					while(k==1)
					{
						k=cse.delete(key1);
					}
				}
					
				else if(n1==2)
				{
					int k=ece.delete(key1);
					while(k==1)
					{
						k=ece.delete(key1);
					}
				}
				else if(n1==3)
				{
					int k=mech.delete(key1);
					while(k==1)
					{
						k=mech.delete(key1);
					}
				}
				else if(n1==4)
				{
					int k=civil.delete(key1);
					while(k==1)
					{
						k=civil.delete(key1);
					}
				}
				else if(n1==5)
				{
					int k=chem.delete(key1);
					while(k==1)
					{
						k=chem.delete(key1);
					}
				}
				else if(n1==6)
				{
					int k=metal.delete(key1);
					while(k==1)
					{
						k=metal.delete(key1);
					}
				}
				else 
					System.out.println("Invalid option .....Try again!!!!");	

			}
			if(n==4)
			{
					cse.duplicate();
					metal.duplicate();
					civil.duplicate();
					mech.duplicate();
					chem.duplicate();
					ece.duplicate();
					System.out.println("Duplicated Data is Cleared Successfully (^_^) !!!!");
						
			}

			if(n==5)
			{
				System.out.print("1. CSE\t"+"2. ECE\t"+"3. MECH\t"+"4. CIVIL\t"+"5. CHEM\t"+"6. MME\n"+"Choose Ur Option: ");
				int n1= str1.nextInt();
				if(n1==1)
					cse.insert();
				else if(n1==2)
					ece.insert();
				else if(n1==3)
					mech.insert();
				else if(n1==4)
					civil.insert();
				else if(n1==5)
					chem.insert();
				else if(n1==6)
					metal.insert();
				else 
					System.out.println("Invalid option .....Try again!!!!");
			}

			if(n==6)
			{
				System.out.print("1. CSE\t"+"2. ECE\t"+"3. MECH\t"+"4. CIVIL\t"+"5. CHEM\t"+"6. MME\t"+"7. All Branches Sorted\n"+"Choose Ur Option: ");
				int n1= str1.nextInt();
				if(n1==1)
					cse.sort();
				else if(n1==2)
					ece.sort();
				else if(n1==3)
					mech.sort();
				else if(n1==4)
					civil.sort();
				else if(n1==5)
					chem.sort();
				else if(n1==6)
					metal.sort();
				else if(n1==7)
				{
					cse.sort();
					ece.sort();
					mech.sort();
					civil.sort();
					chem.sort();
					metal.sort();
					System.out.println("All Branches Data is Sorted Successfully!!!!!");
				}

				else 
					System.out.println("Invalid option .....Try again!!!!");
				
			}
			if(n==7)						
			{
				System.out.print("1. CSE\t"+"2. ECE\t"+"3. MECH\t"+"4. CIVIL\t"+"5. CHEM\t"+"6. MME\t"+"7. All Data Write at Once\n"+"Choose Ur Option: ");
				int n1= str1.nextInt();
				if(n1==1)
					cse.infoFile();
				else if(n1==2)
					ece.infoFile();
				else if(n1==3)
					mech.infoFile();
				else if(n1==4)
					civil.infoFile();
				else if(n1==5)
					chem.infoFile();
				else if(n1==6)
					metal.infoFile();
				else if(n1==7)
				{
					cse.infoFile();
					ece.infoFile();
					mech.infoFile();
					civil.infoFile();
					chem.infoFile();
					metal.infoFile();
					System.out.println("*****************************************************************************");
					System.out.println("All Data is Stored in their corresponding files ... Check Your Output File!!!");
					System.out.println("*****************************************************************************");
				}

				else 
					System.out.println("Invalid option .....Try again!!!!");
				
			}
			if(n==8)
			{
				break;
			}
			System.out.println("If U want to continue (Press 1)....Otherwise Exit:- ");
			i= str1.nextInt();
		}
		
	
	}
}

