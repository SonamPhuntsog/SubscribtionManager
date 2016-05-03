package tab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Actions {
	
	//-------------------Button Action (BT) actions-----------------------------
	
	public void verifyBTAction(java.awt.event.ActionEvent evt){
		
		String s16 = tab.field12.getText();
		String s17 = String.copyValueOf((tab.fieldPass.getPassword()));
	System.out.println("\n name :"+s16 + "\n pass :'"+s17+"'");
		try{
	        Class.forName("com.mysql.jdbc.Driver");
	        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/project","root",tab.MySqlPs);
	        Statement st=con.createStatement();
	        ResultSet rs;
	        rs=st.executeQuery("select password from admin where name=\""+s16+"\"");
	 if(!rs.next())
	        {
	            JOptionPane.showMessageDialog(null,"1)No such acount exist, please enter valid information.");
	            tab.field12.setText("");
	            tab.fieldPass.setText("");
	            
	        }
	   else
	        {
	        String st7 = rs.getString("password");
	        	if(Query.checkEmpty(s16)||Query.checkEmpty(s17)||!s17.equals(st7))
	        	{
	        
	        	
	        		JOptionPane.showMessageDialog(null,"2)No such acount exist, please enter valid information.");
	        		tab.field12.setText("");
	        		tab.fieldPass.setText("");
	        
	        	} 
	        	else
	        	{
	        
	        		//admin enter successful
	        		tab.tabbedPane.addTab("INSERT",tab.panel2);
	        		tab.tabbedPane.addTab("SEARCH",tab.panel3);
	        		tab.tabbedPane.addTab("GRAPH",tab.panel4);
	        		tab.tabbedPane.addTab("SUBSCRIBE",tab.panel5);
	        		tab.label0.setText("welcome "+s16);
	        		tab.label.setVisible(false);
	        		tab.label2.setVisible(false);
	        		tab.field12.setVisible(false);
	        		tab.fieldPass.setVisible(false);
	        		
	        		System.out.println("\t ADMIN Enter done! ");
	       
	        	}
	        }
	        st.close();
	        con.close();
	        }
	catch(Exception e){JOptionPane.showMessageDialog(null,e.getMessage());}
		
		
	} 

	public void submitBTAction(java.awt.event.ActionEvent evt){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/project","root",tab.MySqlPs);
			Statement st=con.createStatement();
	                   
		String s=tab.field.getText();
		System.out.println(""+s);
		String s1=tab.field1.getText();
		System.out.println(""+s1);
		String s2=tab.field2.getText();
		System.out.println(s2);
		String s3=tab.field3.getText();
		System.out.println(s3);
		String s4=tab.field4.getText();
		System.out.println(s4);
		String s5=tab.field5.getText();
		System.out.println(s5);
		String s6=tab.field6.getText();
		System.out.println(s6);
		String s7=tab.field7.getText();
		System.out.println(s7);
		String s8=tab.field8.getText();
		System.out.println(s8);

		 
		String pass = String.copyValueOf((tab.fieldPass10.getPassword()));
			String billorfree="b";
		    System.out.println(pass);
		       if(tab.b10.isSelected()){
		            billorfree="b";
		        }
		        else if(tab.b11.isSelected()){
		            billorfree="f";
		        }     
		          
		       
		           if ( Query.checkEmpty(s) || Query.checkEmpty(s1) || Query.checkEmpty(s2) || Query.checkEmpty(s4) || Query.checkEmpty(s5)
		                   || Query.checkEmpty(s6) || Query.checkEmpty(s7) || Query.checkEmpty(s8) )                  
		        	   {
		           JOptionPane.showMessageDialog(null, "Required field(s) is empty!", "ERROR", JOptionPane.ERROR_MESSAGE); 
		           tab.field.setText("");
		           tab.field1.setText("");
		           tab.field2.setText("");
		           tab.field3.setText("");
		           tab.field4.setText("");
		           tab.field5.setText("");
		           tab.field6.setText("");
		           tab.field7.setText("");
		           tab.field8.setText("");
		           tab.field9.setText("");   return;    
		           } 
		           else if(!Query.checkNum(s7)){
		        	   
		        	   JOptionPane.showMessageDialog(null, "Enter numbers in pin field ", "ERROR", JOptionPane.ERROR_MESSAGE); 
			          
		        	   tab.field7.setText("");
		        	   return;    
		           }
		           else
		           {
		        	   String sql = Query.getInsertQuery(pass,s, s1,s2, s3,  s4, s5, s6, s7, billorfree, s8);
		        	   System.out.println(sql);
		        	   
		        	   st.executeUpdate(sql);
			           
		        	   JOptionPane.showMessageDialog(null, "Insertion successful");
		        	   
		        	   tab.field.setText("");
		        	   tab.field1.setText("");
		        	   tab.field2.setText("");
		        	   tab.field3.setText("");
		        	   tab.field4.setText("");
		        	   tab.field5.setText("");
		        	   tab.field6.setText("");
		        	   tab.field7.setText("");
		        	   tab.field8.setText("");
		        	   tab.field9.setText("");       	   	        	   
		           }   
		        	   
		          
		           st.close();
	     		   con.close();
		           }
		           catch(Exception e){
			       System.out.println("\n INSERT ERROR : "+e.getMessage());
			       
				   }
	}
		
	public void showBTAction(java.awt.event.ActionEvent evt){
		System.out.println(" in show method");
		
		try{
		  String s=tab.t8.getText().trim();
		   System.out.println("s:"+s);
		    String s7=tab.t9.getText();
		    System.out.println("s7:" + s7);
		    String s8=tab.t10.getText();
		   System.out.println("s8:"+s8);
		    String s9=tab.t11.getText();
		   System.out.println("s9:"+s9);
		    String s10=""+s7+"/"+s8+"/"+s9;
		    System.out.println("s10"+s10);
		    int s1=tab.c1.getSelectedIndex();
		    System.out.println("s1:"+s1);
		    int s2=tab.c2.getSelectedIndex();
		    System.out.println("s2:"+s2);
		    int s3=tab.c6.getSelectedIndex();
		    System.out.println("s3:"+s3);
		    int s4=tab.c3.getSelectedIndex();
		    System.out.println("s4:"+s4);
		    int s5=tab.c4.getSelectedIndex();
		    System.out.println("s5:"+s5);
		    int s6=tab.c5.getSelectedIndex();
		    System.out.println("s6:"+s6);
		    //System.out.println("Combo:"+s1);
		    
		    Class.forName("com.mysql.jdbc.Driver");
		    System.out.println("here");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/project","root",tab.MySqlPs);
			Statement st= con.createStatement();
		        ResultSet res;
		        
		        //
		        String sql=Query.getSearchQuery(s, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		        
		        
		        System.out.println(sql);
		        res=st.executeQuery(sql);
		        System.out.println(7);
		        DefaultTableModel dtm = (DefaultTableModel) tab.jt.getModel();
		        dtm.setRowCount(0);
		        ResultSetMetaData meta = res.getMetaData();
		            int numberOfColumns = meta.getColumnCount();
		            while (res.next())
		            {
		                Object [] rowData = new Object[numberOfColumns];
		                for (int i = 0; i < rowData.length; ++i)
		                { 
		                    System.out.println(res.getObject(i+1));
		                    rowData[i] = res.getObject(i+1);
		                }
		                System.out.println(Arrays.toString(rowData));
		                dtm.addRow(rowData);
		            }
						  
		                res.close();
						st.close();
						con.close();
		       }
				catch(SQLException e){
					System.out.println("SQLException: "+ e.getMessage());
				}
		       catch(ClassNotFoundException e){
		        System.out.println(" ClassNotFoundException:" +e.getMessage());
		        }
				catch(Exception e){
					System.out.println("Exception: "+ e.getMessage());
				}
				
		
	}

	public void enterBTAction(java.awt.event.ActionEvent evt){
		String s16=tab.field10.getText();
		String s17 = String.copyValueOf((tab.fieldPass10.getPassword()));
		System.out.println("password from user:" + s17);
		try{
	        Class.forName("com.mysql.jdbc.Driver");
	        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/project","root",tab.MySqlPs);
	        Statement st=con.createStatement();
	        ResultSet rs;
	        rs=st.executeQuery("select password from customer where email_id=\""+s16+"\"");
	        if(!rs.next())
	        {
	            JOptionPane.showMessageDialog(null,"Please enter valid email id and password.");
	            tab.field10.setText("");
	            tab.fieldPass10.setText("");
	            return;
	        }
	        else
	        {
	        String st7=rs.getString("password");
	        System.out.println("password from DB:"+st7);
	        if(Query.checkEmpty(s16)||Query.checkEmpty(s17)||!s17.equals(st7))
	        {
	        	tab.b5.setVisible(false);
	        	tab.field11.setVisible(false);
	        	tab.label18.setVisible(false);
	        	tab.label19.setVisible(false);
	        	tab.label20.setVisible(false);
	        	tab.label21.setVisible(false);
	        	tab.month.setVisible(false);
	        	tab.year.setVisible(false);
	        	tab.label16.setVisible(false);
	        	tab.subscribe.setVisible(false);
	        	tab.newsormag.setVisible(false);
	        	tab.label13.setVisible(true);
	        	tab.b4.setVisible(false); 
	        	tab.label14.setVisible(true);
	        	tab.label15.setVisible(true);
	        	tab.field10.setVisible(true);
	        	tab.fieldPass10.setVisible(true);
	        	
	        JOptionPane.showMessageDialog(null,"Please enter valid email id and password.");
	        tab.field10.setText("");
	        tab.fieldPass10.setText("");
	        return;
	 
	        
	        } 
	        else
	        {tab.label14.setVisible(false);
	        tab.label15.setVisible(false);
	        tab.field10.setVisible(false);
	        tab.fieldPass10.setVisible(false);
	        
	        tab.label13.setVisible(true);
	        
	        tab.b5.setVisible(true);
	        tab.field11.setVisible(true);
	        tab.label18.setVisible(true);
	        tab.label19.setVisible(true);
	        tab.label20.setVisible(true);
	        tab.label21.setVisible(true);
	        tab.b6.setVisible(false);
	        tab.month.setVisible(true);
	        tab.year.setVisible(true);
	        tab.label16.setVisible(true);
	        tab.subscribe.setVisible(true);
	        tab.newsormag.setVisible(true);
	        tab.b4.setVisible(true); 
	        
	        //loads the magazineOrNewsPaper CB
	        tab.subscribe.setSelectedIndex(0);
	        
	        
	        }}st.close();
	        con.close();}
	catch(Exception e){JOptionPane.showMessageDialog(null,e.getMessage());}
		
	}

	public void subscribeBTAction(java.awt.event.ActionEvent evt){
		String st8=(String)tab.subscribe.getSelectedItem();
		String st9=(String)tab.newsormag.getSelectedItem();
		String st10=tab.field11.getText();
		if(st10.equals(" "))
		{
		    JOptionPane.showMessageDialog(null,"Please enter the no. of copies !");
		}
		else
		{
		String st20=tab.field10.getText();
		String[] buttons={"Confirm","Cancel"};

		try{
		    
		    int i10=Integer.parseInt(st10.trim());
		    int i11=Integer.parseInt((String)tab.month.getSelectedItem());
		     int i12=Integer.parseInt((String)tab.year.getSelectedItem());
		     int i13=tab.month.getSelectedIndex();
		     int i14=tab.year.getSelectedIndex();
		     int i19=((i13+1)*1)+((i14+1)*12);
		     DateFormat formatter=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		     Calendar now=Calendar.getInstance();
		     now.add(Calendar.MONTH,i19);
		     String dateString=formatter.format(now.getTime());
		     
		    
		 Class.forName("com.mysql.jdbc.Driver");
		        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/project","root",tab.MySqlPs);
		        Statement st=con.createStatement();
		        ResultSet rs1;
		        int n1;
		if(st8.equals("news paper")){
		rs1=st.executeQuery("select prisePerMonth,prisePerYear from newsPaper where name=\""+st9+"\"");
		rs1.next();
		int i15=rs1.getInt("prisePerMonth");
		int i16=rs1.getInt("prisePerYear");
		int i17=(i15*i11)+(i16*i12);
		int i18=i10*i17;

		int n=JOptionPane.showOptionDialog(null,"The total bill for "+i10+" copies of "+st9+" is: Rs."+i18,"Do you want to confirm the subscription ?",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,buttons,buttons[0]);
		n1=n;
		 }
		else{
		    rs1=st.executeQuery("select prisePerMonth from magazine where name=\""+st9+"\"");
		    rs1.next();
		int i15=rs1.getInt("prisePerMonth");
		int i17=(i15*i11);
		int i18=i10*i17;
		int n=JOptionPane.showOptionDialog(null,"The total bill for "+i10+" copies of "+st9+" is: Rs."+i18,"Do you want to confirm the subscription ?",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,buttons,buttons[0]);
		n1=n;
		}
		if(n1==0)
		{
		    ResultSet rs3;
		    rs3=st.executeQuery("select id from customer where email_id=\""+st20+"\"");
		    rs3.next();
		    int i21=rs3.getInt("id");
		    
		    if(st8=="news paper")
		    {
		        ResultSet rs4;
		        rs4=st.executeQuery("select n_id from newsPaper where name=\""+st9+"\"");
		    rs4.next();
		    int i22=rs4.getInt("n_id");
		    
		    st.executeUpdate("insert into subscribeNewsPaper(id,n_id,noOfCopy,expirationDate) values(\""+i21+"\",\""+i22+"\",\""+i10+"\",\""+dateString+"\")");
		    }
		    if(st8=="magazin")
		    {
		        ResultSet rs4;
		        rs4=st.executeQuery("select m_id from magazine where name=\""+st9+"\"");
		    rs4.next();
		    int i22=rs4.getInt("m_id");
		    
		    st.executeUpdate("insert into subscribeMagazine(id,m_id,noOfCopy,expirationDate) values(\""+i21+"\",\""+i22+"\",\""+i10+"\",\""+dateString+"\") ");
		    }
		}

		st.close();
		con.close();}

		// Show the bill using JOptionPain.confermationDialog and insert in `subscribe<magazine/newsPaper> if confermed:
		  catch(Exception e){JOptionPane.showMessageDialog(null,"You are already subscribed, thank you ");}      
		    }                     	
	}

	public void logOutBTAction(java.awt.event.ActionEvent evt){
		tab.label14.setVisible(true);
		tab.label15.setVisible(true);
		tab.field10.setText("");
		tab.fieldPass10.setText("");
		tab.field10.setVisible(true);
		tab.fieldPass10.setVisible(true);
	    
		tab. b5.setVisible(false);
		tab. field11.setVisible(false);
		tab.label18.setVisible(false);
		tab.label19.setVisible(false);
		tab.label20.setVisible(false);
		tab.label21.setVisible(false);
		tab. month.setVisible(false);
		tab.year.setVisible(false);
		tab.label16.setVisible(false);
		tab.subscribe.setVisible(false);
		tab.newsormag.setVisible(false);
		tab.b6.setVisible(true);
		tab.label13.setVisible(true);
		tab.b4.setVisible(false);
	}

	
	//-------------------Combo Box (CB) actions-----------------------------
	
	public void filterByCBAction (java.awt.event.ActionEvent evt){
		 switch(tab.c1.getSelectedIndex())
			{
			case(0):
				tab.lab7.setVisible(false);
			tab.t8.setVisible(false);break;
			default:
			
				tab.lab7.setVisible(true);
			tab.t8.setVisible(true);break;
				
			}
		
	}

	public void subscribedToCBAction (java.awt.event.ActionEvent evt){
	
		switch(tab.c2.getSelectedIndex())
		{
		case(0):	
			tab.c6.setVisible(false);
		return;
		case(1):
			
			tab.c6.setVisible(true);
		break;
		case(2):
			
			tab.c6.setVisible(true);
		break;
		default:
			tab.c6.setVisible(false);
			return;
		}
		

		try
		{
		    Class.forName("com.mysql.jdbc.Driver");
		        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/project","root",tab.MySqlPs);
		        Statement st=con.createStatement();
		        ResultSet rs1;
		        int st1=tab.c2.getSelectedIndex();
		        int i=0;
		        int j=0;
		        ResultSet rs2;
		       if(st1==1)
		       {
		    	   tab.c6.removeAllItems();
		           rs1=st.executeQuery("select name from magazine");
		        while(rs1.next()){
		        String st10=rs1.getString("name");
		        
		        
		        tab.c6.insertItemAt(st10, i);
		       
		        i++;
		      
		        
		        }
		        tab.c6.setSelectedIndex(0);
		       } 
		        
		       if(st1==2)
		        {
		    	   tab.c6.removeAllItems();
		            rs2=st.executeQuery("select name from newsPaper");
		       while(rs2.next()){
		        String st10=rs2.getString("name");
		        
		        
		        tab.c6.insertItemAt(st10, j);
		        j++;
		        
		        }
		       tab.c6.setSelectedIndex(0);
		        }
		        st.close();
		        con.close();
		}
		catch(Exception e)
		{JOptionPane.showMessageDialog(null,e.getMessage());}
		
		
		
		
	}

	public void citeriaCBAction (java.awt.event.ActionEvent evt){
		 switch(tab.c3.getSelectedIndex()){
		    case(0):
		    	switch(tab.c4.getSelectedIndex()){
		    	case(0): tab.t9.setVisible(false);
		    	tab.lab5.setVisible(false);
		    	tab.t10.setVisible(false);
		    	tab.lab6.setVisible(false);
		    	tab.t11.setVisible(false);
			    break;
		    	default:
		    		tab.t9.setVisible(true);
		    		tab. lab5.setVisible(false);
		    		tab.t10.setVisible(false);
		    		tab.lab6.setVisible(false);
		    		tab.t11.setVisible(false);
		    	    break;
		    	
		    	}
		    
		    default:
		    	
		    	switch(tab.c4.getSelectedIndex()){
		    	case(0): tab.t9.setVisible(false);
		    	tab.lab5.setVisible(false);
		    	tab.t10.setVisible(false);
		    	tab.lab6.setVisible(false);
		    	tab.t11.setVisible(false);
			    break;
		    	default:
		    		tab.t9.setVisible(true);
		    		tab.lab5.setVisible(true);
		    		tab.t10.setVisible(true);
		    		tab.lab6.setVisible(true);
		    		tab.t11.setVisible(true);
		    	    break;
		    	
		    	}
			    
		 }
		
	}

	public void operationsCBAction (java.awt.event.ActionEvent evt){
		
		  switch(tab.c4.getSelectedIndex()){
		    case(0):
		    tab.lab5.setVisible(false);
		    tab.t9.setVisible(false);
		    tab.t10.setVisible(false);
		    tab.lab6.setVisible(false);
		    tab.t11.setVisible(false);
		    break;
		    default:
		    	
		    	switch(tab.c3.getSelectedIndex()){
		        case(0):
		        	tab.t9.setVisible(true);
		        tab.lab5.setVisible(false);
		        tab.t10.setVisible(false);
		        tab.lab6.setVisible(false);
		        tab.t11.setVisible(false);
		        break;
		        default:
		        	tab.t9.setVisible(true);        
		        	tab.lab5.setVisible(true);
		        	tab.t10.setVisible(true);
		        	tab.lab6.setVisible(true);
		        	tab.t11.setVisible(true);
		    	    
		     }
	}
		  }

	public void subscribeForCBAction(java.awt.event.ActionEvent evt)
	{
		
		
		try
		{
		    Class.forName("com.mysql.jdbc.Driver");
		        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/project","root",tab.MySqlPs);
		        Statement st=con.createStatement();
		        ResultSet rs1;
		        String st1=(String)tab.subscribe.getSelectedItem();
		        int i=0;
		        int j=0;
		        ResultSet rs2;
		       if(st1=="magazin")
		       {
		    	   tab.newsormag.removeAllItems();
		           rs1=st.executeQuery("select name from magazine");
		        while(rs1.next()){
		        String st10=rs1.getString("name");
		       
		        
		        tab.newsormag.insertItemAt(st10, i);
		       
		        i++;
		       
		        
		        }
		        tab.newsormag.setSelectedIndex(0);
		       } 
		        
		       if(st1=="news paper")
		        {
		    	   tab.newsormag.removeAllItems();
		            rs2=st.executeQuery("select name from newsPaper");
		       while(rs2.next()){
		        String st10=rs2.getString("name");
		        
		        
		        tab.newsormag.insertItemAt(st10, j);
		        j++;
		        
		        }
		       tab.newsormag.setSelectedIndex(0);
		        }
		        st.close();
		        con.close();
		}
		catch(Exception e)
		{JOptionPane.showMessageDialog(null,e.getMessage());}
		
		
	}


	//-------------------Radio Button (RB) actions-----------------------------
	
	public void countryRBAction(java.awt.event.ActionEvent evt){
		
		   tab.i = 0;
	       
	       tab.h.repaint();      
	}

	public void magazineRBAction(java.awt.event.ActionEvent evt){
		
		   tab.i = 1;
	       
	      tab.h.repaint();      
	}

	public void newsPaperRBAction(java.awt.event.ActionEvent evt){
		
		
	    tab.i = 2;
	    
	    tab.h.repaint();
	}

	
	
	

}
