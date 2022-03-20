package swTesting;
public class asss
{
    private int id;
    private String name;
    private int marks[];
    private float average;
    private String grade;
    public asss(int a,String b,int[] c)
    {
        id=a;
        name=b;
        marks=c;
    }
    public void setId(int n)
    {
        id=n;
    }
    public int getId()
    {
        return id;
    }
    public void setMarks(int[] marks)
    {
        this.marks=marks;
    }
    public int[] getMarks()
    {
        return marks;
    }
    public void setName(String n)
    {
        name=n;
        
    }
    public String getName()
    {
        return name;
    }
    public void setAverage(float n)
    {
        average=n;
    }
    public float getAverage()
    {
        return average;
    }
    public void setGrade(String n)
    {
        grade=n;
    }
    public String getGrade()
    {
        return grade;
    }
    public void calculateAvg()
    {
        float a1=0.0F;
        for(int a=0;a<this.getMarks().length;a++)
        {
            a1=a1+this.marks[a];
        }
        this.setAverage(a1/getMarks().length);
    }
    public void findGrade()
    {
        int min=this.marks[0];
       for(int b=0;b<this.getMarks().length;b++)
        {
            if(this.marks[b]<min) 
                {
                    min=this.marks[b];
                }
        }
        if(min<60)
        {
            this.setGrade("F");
            System.out.println("F");
        }
        else if(this.getAverage()>=97 && this.getAverage()<=100)
        {
            this.setGrade("A+");
            System.out.println("A+");
        }
        else if(this.getAverage()>=93 && this.getAverage()<97)
        {
        	this.setGrade("A");
        	System.out.println("A");
        }
        else if(this.getAverage()>=90 && this.getAverage()<93)
        {
        	this.setGrade("A-");
        	System.out.println("A-");
        }
        else if(this.getAverage()>=87 && this.getAverage()<90)
        {
        	this.setGrade("B+");
        	System.out.println("B+");
        }
        else if(this.getAverage()>=83 && this.getAverage()<87)
        {
        	this.setGrade("B");
        	System.out.println("B");
        }
        else if(this.getAverage()>=80 && this.getAverage()<83)
        {
        	this.setGrade("B-");
        	System.out.println("B-");
        }
        else if(this.getAverage()>=77 && this.getAverage()<80)
        {
        	this.setGrade("C+");
        	System.out.println("C+");
        }
        else if(this.getAverage()>=73 && this.getAverage()<77)
        {
        	this.setGrade("C");
        	System.out.println("C");
        }
        else if(this.getAverage()>=70 && this.getAverage()<73)
        {
        	this.setGrade("C-");
        	System.out.println("C-");
        }
        else if(this.getAverage()>=67 && this.getAverage()<70)
        {
        	this.setGrade("D+");
        	System.out.println("D+");
        }
        else if(this.getAverage()>=60 && this.getAverage()<67)
        {
        	this.setGrade("D");
        	System.out.println("D");
        }
        
    }
}
