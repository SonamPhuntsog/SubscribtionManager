package tab;




import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

import javax.swing.JOptionPane;


class Graph extends Canvas {

        static int hight = 500;
        static int width = 1000;
      public Graph () {
         setBackground (Color.GRAY);
      }

      @Override
      public void paint (Graphics g) {
          try{
          Graphics2D g2;
         g2 = (Graphics2D) g;
         
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost/project","root",tab.MySqlPs);

        Statement  stmt = con.createStatement();
        ResultSet rs = null;
         String query;
         int numberOfRows,gap,initial,max =0, bench;
         
         g2.setFont(new Font("Arial",Font.BOLD,20));
         
          switch(tab.i){
          
              case 0:
         
         
                  query = "select country, count(*) from customer group by country order by count(*) desc ;";

                  rs = stmt.executeQuery(query);
                  numberOfRows = 0;
                   int total = 0;
                   int angle = 0;
                  
                  
                  while(rs.next()){
                  
                  total +=  rs.getInt(2);
                  numberOfRows ++;
                  }
                  
                  gap = hight/numberOfRows;
                 
                  initial = 40;
                  rs.beforeFirst();
                  
                  
                   while(rs.next()){
    
                  g2.setPaint(randomColor());
                 g2.fillArc(50, 30, 200, 200, angle,rs.getInt(2)*370/total);
                    angle += rs.getInt(2)*360/total;
                    g2.drawString (rs.getString(1)+" "+rs.getInt(2)*100/total+"%", 400, initial);
                    
                    initial += gap;
                    
            }
                          break;
              case 1 :
                  
                  query = "select sum(noOfCopy), name from subscribeMagazine sm, magazine m where sm.m_id = m.m_id group by m.m_id order by m.m_id ;";

                  rs = stmt.executeQuery(query);
                  
                  numberOfRows = 0;
                  max = 0;
                  while(rs.next()){
                  
                  if(max <  rs.getInt(1)){
                      max = rs.getInt(1);
                  }
                  numberOfRows ++;
                  }
                  gap = width/numberOfRows;
                   bench = (int) ( hight * 0.9);
                  initial = 20;
                  
                  rs.beforeFirst();
                  
                  while(rs.next()){
    
                  g2.setPaint(randomColor());
                  g2.fillRoundRect(initial, 20 + bench - rs.getInt(1)*(bench)/max, gap/2,rs.getInt(1)*(bench)/max , 20, 20);
                  g2.drawString ("Copy sold/month:"+rs.getInt(1), initial, 15 + bench - rs.getInt(1)*(bench)/max);
                  g2.drawString (rs.getString(2), initial, bench + 40);
                  
                  initial += gap;
                }
              
              break;
              case 2:
                  query = "select sum(noOfCopy), name from subscribeNewsPaper sn, newsPaper n where sn.n_id = n.n_id group by n.n_id order by n.n_id ;";

                  rs = stmt.executeQuery(query);
                  
                  numberOfRows = 0;
                  max = 0;
                  while(rs.next()){
                  
                  if(max <  rs.getInt(1)){
                      max = rs.getInt(1);
                  }
                  numberOfRows ++;
                  }
                  gap = width/numberOfRows;
                   bench = (int) ( hight * 0.9);
                  initial = 20;
                  
                  rs.beforeFirst();
                  
                  while(rs.next()){
    
                  g2.setPaint(randomColor());
                  g2.fillRoundRect(initial, 20 + bench - rs.getInt(1)*(bench)/max, gap/2,rs.getInt(1)*(bench)/max , 20, 20);
                  g2.drawString ("Copy sold/month:"+rs.getInt(1), initial, 15 + bench - rs.getInt(1)*(bench)/max);
                  g2.drawString (rs.getString(2), initial, bench  + 40);
                  
                  initial += gap;
                }
                  break;
               
          }
          
         rs.close();
        stmt.close();
        con.close();
      }
          catch(Exception e){
JOptionPane.showMessageDialog(null,"Error in connecctivity");
System.out.printf("in exception");
}
 
          
      }
      
      Random random = new Random();
public Color randomColor()
{
   
  int red=random.nextInt(256);
  int green=random.nextInt(256);
  int blue=random.nextInt(256);
  return new Color(red, green, blue);
} 
 }
     