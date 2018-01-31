class CGPA
{
	int b,daa,be,java,psp,dld,tot,cr1,cr2,cr3,cr4,cr5,crt;
	float a,r,cgp,sum;
	char be_g,da_g,dl_g,p_g,j_g;
	void grade()
	{	
		System.out.print("DAA Subject Grade: "); 
		if(daa>=90)
		{
			da_g='x';
			System.out.println(" Excellent");
		}
		else if(daa>=80)
		{
			da_g='a';
			System.out.println(" A Grade");
		}
		else if(daa>=70)
		{
			da_g='b';
			System.out.println(" B Grade");
		}
		else if(daa>60)
		{
			da_g='c';
			System.out.println(" C Grade");
		}	
		else if(daa>=50)
		{
			da_g='d';
			System.out.println(" D Grade");
		}
		else 
		{
			da_g='f';
			System.out.println(" Fail");
		}
		//BE...................................

		System.out.print("BE Subject Grade: "); 
		if(be>=90)
		{
			be_g='x';
			System.out.println(" Excellent");
		}
		else if(be>=80)
		{
			be_g='a';
			System.out.println(" A Grade");
		}
		else if(be>=70)
		{
			be_g='b';
			System.out.println(" B Grade");
		}
		else if(be>60)
		{
			be_g='c';
			System.out.println(" C Grade");
		}	
		else if(be>=50)
		{
			be_g='d';
			System.out.println(" D Grade");
		}
		else 
		{
			be_g='f';
			System.out.println(" Fail");
		}
	
		//Java.......................

		System.out.print("Java Subject Grade: "); 
		if(java>=90)
		{
			j_g='x';
			System.out.println(" Excellent");
		}
		else if(java>=80)
		{
			j_g='a';
			System.out.println(" A Grade");
		}
		else if(java>=70)
		{
			j_g='b';
			System.out.println(" B Grade");
		}
		else if(java>60)
		{
			j_g='c';
			System.out.println(" C Grade");
		}	
		else if(java>=50)
		{
			j_g='d';
			System.out.println(" D Grade");
		}
		else 
		{
			j_g='f';
			System.out.println(" Fail");
		}
		//PSP......................

		System.out.print("PSP Subject Grade:"); 
		if(psp>=90)
		{
			 p_g='x';
			System.out.println(" Excellent");
		}
		else if(psp>=80)
		{
			p_g='a';
			System.out.println(" A Grade");
		}
		else if(psp>=70)
		{
			p_g='b';
			System.out.println(" B Grade");
		}
		else if(psp>60)
		{
			p_g='c';
			System.out.println(" C Grade");
		}	
		else if(psp>=50)
		{
			p_g='d';
			System.out.println(" D Grade");
		}
		else 
		{
			p_g='f';
			System.out.println(" Fail");
		}

		//DLD................................

		System.out.print("DLD Subject Grade:"); 
		if(dld>=90)
		{
			dl_g='x';
			System.out.println(" Excellent");
		}
		else if(dld>=80)
		{
			dl_g='a';
			System.out.println(" A Grade");
		}
		else if(dld>=70)
		{
			dl_g='b';
			System.out.println(" B Grade");
		}
		else if(dld>60)
		{
			dl_g='c';
			System.out.println(" C Grade");
		}	
		else if(dld>=50)
		{
			dl_g='d';
			System.out.println(" D Grade");
		}
		else 
		{
			dl_g='f';
			System.out.println(" Fail");
		}
		//Credits Calucation............
		if(da_g=='x')
			cr1=40;
		else if(da_g=='a')
			cr1=36;
		else if(da_g=='b')
			cr1=32;
		else if(da_g=='c')
			cr1=28;
		else if(da_g=='d')
			cr1=24;
		else if(da_g=='f')
			cr1=0;
	
		// be credits
		
		if(be_g=='x')
			cr2=40;
		else if(be_g=='a')
			cr2=36;
		else if(be_g=='b')
			cr2=32;
		else if(be_g=='c')
			cr2=28;
		else if(be_g=='d')
			cr2=24;
		else if(be_g=='f')
			cr2=0;
	
		// java credits
		
		if(j_g=='x')
			cr3=40;
		else if(j_g=='a')
			cr3=36;
		else if(j_g=='b')
			cr3=32;
		else if(j_g=='c')
			cr3=28;
		else if(j_g=='d')
			cr3=24;
		else if(j_g=='f')
			cr3=0;
		
		// DLD credits
		
		if(dl_g=='x')
			cr4=40;
		else if(dl_g=='a')
			cr4=36;
		else if(dl_g=='b')
			cr4=32;
		else if(dl_g=='c')
			cr4=28;
		else if(dl_g=='d')
			cr4=24;
		else if(dl_g=='f')
			cr4=0;

		
		// PSP credits
		
		if(p_g=='x')
			cr5=40;
		else if(p_g=='a')
			cr5=36;
		else if(p_g=='b')
			cr5=32;
		else if(p_g=='c')
			cr5=28;
		else if(p_g=='d')
			cr5=24;
		else if(p_g=='f')
			cr5=0;
		
		tot=daa+be+java+psp+dld;
		r=tot/5;	
		float a=(float)((tot*100)/500);
		System.out.println("Total Marks: "+tot);
		System.out.println("Percentage: "+a);
		crt=cr1+cr2+cr3+cr4+cr5;
		
		sum=(float)(crt/200.0);
		cgp=sum*10;
		System.out.println("CGPA: "+cgp);
			System.out.println("*************************");
		
		
			

	}
		
			
		
}



