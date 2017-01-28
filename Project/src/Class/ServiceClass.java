package Class;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Connec.ConnectionClass;
public class ServiceClass extends ConnectionClass{
	
	
	User uj= new User();
	
	SIR sr=new SIR();
	
	AutoNEW ob=new AutoNEW();
	
	public String checkPassword2(String name, String password)
	{
		this.getConnection();
		
		String sql = "select Pass from input where Id =?";
		try
		{
			ps = connection.prepareStatement(sql);
			ps.setString(1, name);
			rs=ps.executeQuery();
			while (rs.next())
			{
				
				if(rs.getString(1).equals(password))
				{
					return "success";
				}
			}
//			
	
		}
		catch(SQLException e)
		{
			return "fail";
		}
	
		return "fail";
	}

	
	
	
	public AutoNEW gettID()
	{
		this.getConnection();
		
		String sql ="select * from new";
		try
		{
			String ll,ss;
			ps = connection.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while (rs.next())
			{
			   ll=rs.getString("ID");
			   ss=rs.getString("CGPA");
			    
			   ob.setID(ll);
			   ob.setCGPA(ss);
			   String fl=checkPassword2(ll,ss);
			   if(fl.equals("fail"))
			   return ob;
			}
			ps.close();
			rs.close();
			connection.close();
		
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	

	public String ck(String name) {	
		
		this.getConnection();
		
		String sql ="select * from input where id='"+name+"'";
		try
		{
			ps = connection.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while (rs.next())
			{
			return "fail";	
			}
			
			ps.close();
			rs.close();
			connection.close();
			return "success";
		
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return "success";
	}
	
	
	
	
	
	public String checkcampus(String name)
	{
		this.getConnection();
		
		String sql = "select name from Campus where name=?";
		try
		{
			ps = connection.prepareStatement(sql);
			ps.setString(1, name);
			rs=ps.executeQuery();
			while (rs.next())
			{
				
				if(rs.getString(1).equals(name))
				{
					return "success";
				}
			}
//			
	
		}
		catch(SQLException e)
		{
			return "fail";
		}
	
		return "fail";
	}

	
	
	
	
	
	
	
	public String checkPassword2ForDel(String name)
	{
		this.getConnection();
		
		String sql = "select Id from input where Id =?";
		try
		{
			ps = connection.prepareStatement(sql);
			ps.setString(1, name);
			rs=ps.executeQuery();
			while (rs.next())
			{
				
				if(rs.getString(1).equals(name))
				{
					return "success";
				}
			}
//			
	
		}
		catch(SQLException e)
		{
			return "fail";
		}
	
		return "fail";
	}	
	
	
	
	public String checkTeacher(String name, String password)
	{
		this.getConnection();
		
		String sql = "select Pass from Teacher where Name =?";
		try
		{
			ps = connection.prepareStatement(sql);
			ps.setString(1, name);
			rs=ps.executeQuery();
			while (rs.next())
			{
				
				if(rs.getString(1).equals(password))
				{
					return "success";
				}
			}
//			
	
		}
		catch(SQLException e)
		{
			return "fail";
		}
	
		return "fail";
	}
	
	
	
	
	public void Insert(String name, String id, String email, String pass,String dept,String gp){
		this.getConnection();
	
		
			String sql = "insert into input (Name,Id,Email,Pass,Dept,CGPA) values(?,?,?,?,?,?)";
			try
			{
				ps = connection.prepareStatement(sql);
				ps.setString(1, name);
				ps.setString(2, id);
				ps.setString(3, email);
				ps.setString(4, pass);
				ps.setString(5, dept);
				ps.setString(6, gp);
				
		
				ps.executeUpdate();
				
				ps.close();
				connection.close();
				
			}
			catch(SQLException e)
			{
			 e.printStackTrace();	
			}	
					
		
	}
	


	
	public void InsertAuto(String name, String id, String email, String pass,String dept,String gp){
		this.getConnection();
	
		
			String sql = "insert into input (Name,Id,Email,Pass,Dept,CGPA) values(?,?,?,?,?,?)";
			try
			{
				ps = connection.prepareStatement(sql);
				ps.setString(1, name);
				ps.setString(2, id);
				ps.setString(3, email);
				ps.setString(4, pass);
				ps.setString(5, dept);
				ps.setString(6, gp);
				
		
				ps.executeUpdate();
				
				ps.close();
				connection.close();
				
			}
			catch(SQLException e)
			{
			 e.printStackTrace();	
			}	
					
		
	}
	

	
	
	
	
	public void InsertSIR(String name,String dept,String pass){
		this.getConnection();
	
		
			String sql = "insert into Teacher (Name,Dept,Pass) values(?,?,?)";
			try
			{
				ps = connection.prepareStatement(sql);
				ps.setString(1, name);
				ps.setString(3, pass);
				ps.setString(2, dept);
		
				ps.executeUpdate();
				
				ps.close();
				connection.close();
				
			}
			catch(SQLException e)
			{
			 e.printStackTrace();	
			}	
					
		
	}

	
	
	
	
	
public void Delete(String id) {
		
		this.getConnection();
		String sql="delete from input where Id='"+id+"'";
		try
		{
			ps = connection.prepareStatement(sql);
			//ps.setString(1, id);
			//ps.setString(1, name);
			//ps.setString(2, location);
			ps.executeUpdate();
			
			ps.close();
			connection.close();
			
		}
		catch(SQLException e)
		{
		 e.printStackTrace();	
		}		
	}
	
	
	


public User check(String id) {
	String ll,pp,jj,mm,lp,ss;
	
	
	this.getConnection();
	
	String sql ="select * from input where Id='"+id+"'";
	try
	{
		ps = connection.prepareStatement(sql);
		rs = ps.executeQuery();
		
		while (rs.next())
		{
			lp=rs.getString("Id");
		   ll=rs.getString("Name");
		   pp=rs.getString("Email");
		   jj=rs.getString("Pass");
		   ss=rs.getString("Dept");
		   mm=rs.getString("CGPA");
		  
		  
		   uj.setId(lp);
		   uj.setName(ll);
		   uj.setEmail(pp);
		   uj.setPass(jj);
		   uj.setDept(ss);
		   uj.setCGPA(mm);
		   
		   
			return uj;
		}
		ps.close();
		rs.close();
		connection.close();
	
	}catch (SQLException e) {
		e.printStackTrace();
	}
	return null;
}




public User checkSTU(String id) {
	String ll,pp,jj,ss,mm,lp;
	
	
	this.getConnection();
	
	String sql ="select * from input where Id='"+id+"'";
	try
	{
		ps = connection.prepareStatement(sql);
		rs = ps.executeQuery();
		
		while (rs.next())
		{
			lp=rs.getString("Id");
		   ll=rs.getString("Name");
		   pp=rs.getString("Email");
		   jj=rs.getString("Pass");
		   ss=rs.getString("Dept");
		   mm=rs.getString("CGPA");
		  
		  
		   uj.setId(lp);
		   uj.setName(ll);
		   uj.setEmail(pp);
		   uj.setPass(jj);
		   uj.setDept(ss);
		   uj.setCGPA(mm);
		   
		   
			return uj;
		}
		ps.close();
		rs.close();
		connection.close();
	
	}catch (SQLException e) {
		e.printStackTrace();
	}
	return uj;
}




	
public void Update(String name, String dept, String qli, String puni,String de,String cg) {
	// TODO Auto-generated method stub
	this.getConnection();
	String sql="update input set Name='"+name+"',Id='"+dept+"', Email='"+qli+"', Pass='"+puni+"', Dept='"+de+"', CGPA='"+cg+"'  where Id='"+dept+"'";
	try
	{
		ps = connection.prepareStatement(sql);
		//ps.setString(1, id);
		//ps.setString(1, name);
		//ps.setString(2, location);
		ps.executeUpdate();
		
		ps.close();
		connection.close();
		
	}
	catch(SQLException e)
	{
	 e.printStackTrace();	
	}	
}

	
public List<User> InsertDB() {
	List<User> list = new ArrayList<User>();
	User uj = null;
	int a=0;
	this.getConnection();
	
	String sql ="select *from input order by Id asc";
	
	try
	{
		ps = connection.prepareStatement(sql);
		rs = ps.executeQuery();
		
		while (rs.next())
		{
			uj = new User();
			
			
			uj.setName(rs.getString(1));
			uj.setId(rs.getString(2));
			uj.setEmail(rs.getString(3));
			uj.setPass(rs.getString(4));
			uj.setDept(rs.getString(5));
			uj.setCGPA(rs.getString(6));
			a++;
			uj.setNUM(a);
			list.add(uj);
		}
		ps.close();
		rs.close();
		connection.close();
		return list;
		
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	return null;
}



public PRT TNS() {
	int a=0;
	this.getConnection();
	
	String sql ="select *from input order by Id asc";
	
	try
	{
		ps = connection.prepareStatement(sql);
		rs = ps.executeQuery();
		
		while (rs.next())
		{
			a++;
			
		}
		
		PRT ob=new PRT();
		
		ob.setNUM(a);
		
		ps.close();
		
		rs.close();
		
		connection.close();
		
		return ob;
		
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	return null;
}


public PRT TNT() {
	int a=0;
	this.getConnection();
	
	String sql ="select *from Teacher";
	
	try
	{
		ps = connection.prepareStatement(sql);
		rs = ps.executeQuery();
		
		while (rs.next())
		{
			a++;
			
		}
		
		PRT ob=new PRT();
		
		ob.setNUM(a);
		
		ps.close();
		
		rs.close();
		
		connection.close();
		
		return ob;
		
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	return null;
}



public String getANS(PRT tns,PRT tnt)
{
	int res;
	
	res=(10/100)*(tns.getNUM());
	
	if(tnt.getNUM()==res)
		return ("TEACHER NUMBER IS EXACTLY SAME WHAT THE CAMPUS IS NEEDED");
	else if(tnt.getNUM()>res)
		return("TEACHER NUMBER IS MORE THAN THE CAMPUS IS NEEDED");
	else
		return("TEACHER NUMBER IS LESS THAN THE CAMPUS IS NEEDED");

}



public String get_res(int tns,int tnt)
{
	int res;
	
	res=(10/100)*(tns);
	
	if(tnt==res)
		return ("TEACHER NUMBER IS EXACTLY SAME WHAT THE DEPT IS NEEDED");
	else if(tnt>res)
		return("TEACHER NUMBER IS MORE THAN THE DEPT IS NEEDED");
	else
		return("TEACHER NUMBER IS LESS THAN THE DEPT IS NEEDED");

}







public List<SIR> SHOW_TEACHER() {
	List<SIR> list = new ArrayList<SIR>();
	int a=0;
	SIR uj = null;
	this.getConnection();
	
	String sql ="select *from Teacher";
	
	try
	{
		ps = connection.prepareStatement(sql);
		rs = ps.executeQuery();
		
		while (rs.next())
		{
			a++;
			uj = new SIR();
			uj.setName(rs.getString(1));
			uj.setPass(rs.getString(3));
			uj.setDept(rs.getString(2));
			uj.setNUM(a);
			list.add(uj);
			
		}
		ps.close();
		rs.close();
		connection.close();
		return list;
		
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	return null;
}




public List<User> ShowDB(String dept) {
	List<User> list = new ArrayList<User>();
	User uj = null;
	int i=0;
	this.getConnection();
	System.out.println(dept);
	String sql ="select * from input where Dept='"+dept+"'";
	
	try
	{
		ps = connection.prepareStatement(sql);
		rs = ps.executeQuery();
		
		while (rs.next())
		{
			uj = new User();
			i++;
			uj.setName(rs.getString(1));
			uj.setId(rs.getString(2));
			uj.setEmail(rs.getString(3));
			uj.setPass(rs.getString(4));
			uj.setDept(rs.getString(5));
			uj.setCGPA(rs.getString(6));
			uj.setNUM(i);
			list.add(uj);
		}
		ps.close();
		rs.close();
		connection.close();
		return list;
		
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	return null;
}


public int Stu_num(String dept) {
	
	int i=0;
	this.getConnection();
	System.out.println(dept);
	String sql ="select * from input where Dept='"+dept+"'";
	
	try
	{
		ps = connection.prepareStatement(sql);
		rs = ps.executeQuery();
		
		while (rs.next())
		{
			i++;
			
		}
		ps.close();
		rs.close();
		connection.close();
		return i;
		
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	return 0;
}



public List<SIR> ShowCOLICS(String dept) {
	List<SIR> list = new ArrayList<SIR>();
	SIR uj = null;
	int i=0;
	this.getConnection();
	System.out.println(dept);
	String sql ="select * from Teacher where Dept='"+dept+"'";
	
	try
	{
		ps = connection.prepareStatement(sql);
		rs = ps.executeQuery();
		
		while (rs.next())
		{
			uj = new SIR();
			i++;
			uj.setName(rs.getString(1));
			uj.setDept(rs.getString(2));
			uj.setPass(rs.getString(3));
			uj.setNUM(i);
			list.add(uj);
		}
		ps.close();
		rs.close();
		connection.close();
		return list;
		
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	return null;
}




public int Sir_num(String dept) {
	
	int i=0;
	this.getConnection();
	System.out.println(dept);
	String sql ="select * from Teacher where Dept='"+dept+"'";
	
	try
	{
		ps = connection.prepareStatement(sql);
		rs = ps.executeQuery();
		
		while (rs.next())
		{
			i++;
		}
		System.out.println(i);
		ps.close();
		rs.close();
		connection.close();
		return i;
		
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	return 0;
}




	

public SIR check2(String name,String pass) 
{
	String ll,jj,ss;	
	this.getConnection();
	String sql ="select * from Teacher where Pass='"+pass+"'";
	try
	{
		ps = connection.prepareStatement(sql);
		rs = ps.executeQuery();
		while (rs.next())
		{
		   ll=rs.getString("Name");
		   ss=rs.getString("Dept");
		   jj=rs.getString("Pass"); 
		   sr.setName(ll);
		   sr.setDept(ss);
		   sr.setPass(jj);
			return sr;
		}
		ps.close();
		rs.close();
		connection.close();
	
	}catch (SQLException e) {
		e.printStackTrace();
	}
	return null;
}
	
		

}
