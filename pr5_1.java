import java.util.Scanner;

class pr
{
    public static void main(String[] args) {
        Employ u=new Employ();

        Scanner sc = new Scanner(System.in); 
        u.setId(2);
        u.setName("Sujal");
        u.setSalary(50000);
        u.setCompany_name("android company");
        u.setMobail_number("9512955160");
        u.setAddress("surat");

        System.out.println("Id= "+u.getid());
        System.out.println("Name= "+u.getName());
        System.out.println("Salary= "+u.getSalary());
        System.out.println("Company name= "+u.getCompany_name());
        System.out.println("Mobail number= "+u.getMobail_number());
        System.out.println("Address= "+u.getAddress());
      
        
    }
}

class Employ
{
    private int id,salary;
    private String name,company_name,mobail_number,address;

    public void setId(int i)
    {
        id=i;
    }

    public int getid()
    {
        return id;
    }

    public void setName(String n)
    {
        name=n;
    }

    public String getName()
    {
        return name;
    }
    public void setSalary(int s)
    {
        salary=s;
    }

    public int getSalary()
    {
        return salary;
    }
    public void setCompany_name(String c)
    {
        company_name=c;
    }

    public String getCompany_name()
    {
        return company_name;
    }
    public void setMobail_number(String m)
    {
        mobail_number=m;
    }

    public String getMobail_number()
    {
        return mobail_number;
    }
    public void setAddress(String a)
    {
        address=a;
    }

    public String getAddress()
    {
        return address;
    }
    
}