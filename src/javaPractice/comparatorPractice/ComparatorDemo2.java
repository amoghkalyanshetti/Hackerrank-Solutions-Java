import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
    public void setId(int id)
    {
        this.id=id;
    }
    public  void setFname(String fName)
    {
        this.fname=fName;
    }
    public void setCgpa(double cgpa)
    {
        this.cgpa=cgpa;
    }
}
class Checker implements Comparator<Student>
{
    @Override
    public int compare(Student o1, Student o2) 
    {
        if(o1.getCgpa()<o2.getCgpa())
        {
            return 1;
        }
        else if(o1.getCgpa()>o2.getCgpa())
        {
            return -1;
        }
        else    //same cgpa
        {
            if(o1.getFname().compareTo(o2.getFname())<0)
            {
                return -1;
            }
            else if(o1.getFname().compareTo(o2.getFname())>0)
            {
                return 1;
            }
            else//same cgpa and same fname 
            {
                if(o1.getId()<o2.getId())
                {
                    return -1;
                }
                else
                {
                    return 1;
                }
            }
        }
        
    }
}
//Complete the code
public class ComparatorDemo2
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		Student st[] = new Student[testCases];
        for(int i = 0; i < testCases; i++){
            st[i]=new Student(in.nextInt(),in.next(),in.nextDouble());
        }
		
      Arrays.sort(st,new Checker());
      	for(Student st1: st){
			System.out.println(st1.getFname());
		}
	}
}

