package tab;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;





class tab extends JFrame{
	

public tab(String s){
	super(s);	
	

 	
	setTitle("Subscribtion Manager");
	setSize(300,200);
	setBackground(bgColor);
	
	JPanel topPanel=new JPanel();
	topPanel.setBackground(outerColor);
	topPanel.setLayout(new BorderLayout());
	getContentPane().add(topPanel);
	
	createHome();
	createInsert();
	createSearch();
	createGraph();
	createSubscribe();
	
	init();
	
	tabbedPane = new JTabbedPane();
	tabbedPane.addTab("HOME",panel1);
	tabbedPane.setBackground(tabColor);
	
	topPanel.add(tabbedPane,BorderLayout.CENTER);
}

void init(){
	c6.setVisible(false);
    t11.setVisible(false);
    lab6.setVisible(false);
    t10.setVisible(false);
    lab5.setVisible(false);
    t8.setVisible(false);
    t9.setVisible(false);
    lab7.setVisible(false);
    label16.setVisible(false);
    subscribe.setVisible(false);
    newsormag.setVisible(false);
    b4.setVisible(false);
    field11.setVisible(false);
    label18.setVisible(false);
    label19.setVisible(false);
    label20.setVisible(false);
    label21.setVisible(false);
    month.setVisible(false);
    year.setVisible(false);
    b5.setVisible(false); 
    actions = new Actions();
    
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	
    
}

public void createHome(){
	panel1=new JPanel();
	panel1.setLayout(null); 
	panel1.setBackground(bgColor);
	int x=400,y=400;
	
	logo = new JLabel();
	logo.setIcon(new ImageIcon(logoURL));
	logo.setBounds(300,100,647,450);
	
	Font f = new Font("Arial",Font.BOLD,20);
	
	
	label = new JLabel("NAME :");
	label.setForeground(Color.WHITE);
	label.setFont(f);
	
	label.setBounds(x+10,y+15,150,20);
	panel1.add(label);
	
	field12 = new JTextField();
	field12.setBounds(90+x,15+y,150,20);
	panel1.add(field12);
	
	label2 = new JLabel("PASSWORD :");
	label2.setForeground(Color.WHITE);
	
	label2.setFont(f);
	label2.setBounds(x-50,60+y,150,20);
	panel1.add(label2);
	label0 = new JLabel("");
	label0.setBounds(x+50, y-50, 400, 20);
	label0.setFont(new Font("",Font.BOLD,20));
	panel1.add(label0);
	
	fieldPass = new JPasswordField();
	fieldPass.setBounds(90+x,60+y,150,20);
	panel1.add(fieldPass);
	
	panel1.add(logo);
	 field12.addActionListener(new java.awt.event.ActionListener() {
	        public void actionPerformed(java.awt.event.ActionEvent evt) {
	            actions.verifyBTAction(evt);
	        }
	    });
	 fieldPass.addActionListener(new java.awt.event.ActionListener() {
	        public void actionPerformed(java.awt.event.ActionEvent evt) {
	            actions.verifyBTAction(evt);
	        }
	    });
	
}

public void createInsert(){
	Font f;
	panel2=new JPanel();
	panel2.setLayout(null);
	panel2.setBackground(bgColor);
	JLabel label3=new JLabel("ENTER CUSTOMER DETAILS");
	label3.setBounds(400,10,900,50);
	

	int g = 50;
	
	
	f = new Font("Arial",Font.BOLD,20);
	label3.setForeground(Color.black);
	label3.setFont(f);
	panel2.add(label3);
	
    JLabel label1=new JLabel("NAME :");
	label1.setBounds(10,25+g,150,20);
	panel2.add(label1);
	
	field=new JTextField();
	field.setBounds(160,25+g,150,20);
	panel2.add(field);
	
	JLabel label2=new JLabel("ADDRESS LINE 1 :");
	label2.setBounds(10,60+g,150,20);
	panel2.add(label2);
	
	field1=new JTextField();
	field1.setBounds(160,60+g,150,20);
	panel2.add(field1);

    JLabel label4=new JLabel("ADDRESS LINE 2 :");
	label4.setBounds(10,95+g,150,20);
	panel2.add(label4);
	
    field2=new JTextField();
	field2.setBounds(160,95+g,150,20);
	panel2.add(field2);

     JLabel label5=new JLabel("ADDRESS LINE 3 :");
	label5.setBounds(10,130+g,150,20);
	panel2.add(label5);
	
     field3=new JTextField();
	field3.setBounds(160,130+g,150,20);
	panel2.add(field3);
	
	JLabel lab345=new JLabel("*");
	f=new Font("Arial",Font.BOLD,30);
    lab345.setBounds(340,130+g,40,30);
    lab345.setForeground(Color.red);
    lab345.setFont(f);
    panel2.add(lab345);

    JLabel label6=new JLabel("CITY :");
	label6.setBounds(10,165+g,150,20);
	panel2.add(label6);
	
    field4=new JTextField();
	field4.setBounds(160,165+g,150,20);
	panel2.add(field4);

     JLabel label7=new JLabel("STATE :");
	label7.setBounds(10,200+g,150,20);
	panel2.add(label7);
	
	field5=new JTextField();
	field5.setBounds(160,200+g,150,20);
	panel2.add(field5);

    JLabel label8=new JLabel("COUNTRY :");
	label8.setBounds(10,235+g,150,20);
	panel2.add(label8);
	
	field6=new JTextField();
	field6.setBounds(160,235+g,150,20);
	panel2.add(field6);

    JLabel label9=new JLabel("PIN :");
	label9.setBounds(10,270+g,150,20);
	panel2.add(label9);
	
	field7=new JTextField();
	field7.setBounds(160,270+g,150,20);
	panel2.add(field7);
	JLabel lab346=new JLabel("Please enter digit from 0-9");
	lab346.setBounds(340,270+g,300,20);
	 lab346.setForeground(Color.red);
	panel2.add(lab346);

    JLabel label10=new JLabel("EMAIL ADDRESS :");
	label10.setBounds(500,60+g,150,20);
	panel2.add(label10);
	
	field8=new JTextField();
	field8.setBounds(650,60+g,150,20);
	panel2.add(field8);

    label11=new JLabel("PASSWORD :");
	label11.setBounds(500,95+g,150,20);
	panel2.add(label11);
	
	field9=new JPasswordField();
	field9.setBounds(650,95+g,150,20);
	panel2.add(field9);

     b10=new JRadioButton("bill",false);
    b10.setBounds(650,130+g,100,100);
    b10.setSelected(true);  
    b11=new JRadioButton("free",false);
        b11.setBounds(750,130+g,100,100);
        panel2.add(b10);
        panel2.add(b11);

        buttonGroup1=new ButtonGroup();
        buttonGroup1.add(b10);
        buttonGroup1.add(b11);

        JButton b3=new JButton("Submit");
        b3.setBounds(700,300+g,100,50);
        panel2.add(b3);

b3.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        actions.submitBTAction(evt);
    }
});


	
}

public void createSearch(){
	JLabel lab,lab1,lab2,lab3,lab4;
	Font f;
	JButton jb;
	

	panel3=new JPanel();
	panel3.setLayout(null);
	panel3.setBackground(bgColor);
	
	lab=new JLabel("SEARCH CUSTOMER DETAILS");
	lab.setBounds(400,10,900,50);
	f=new Font("Arial",Font.BOLD,20);
	lab.setForeground(Color.black);
	lab.setFont(f);
	
	lab1=new JLabel("Filter By");
	lab1.setBounds(10,35,900,50);
	f=new Font("Arial",Font.BOLD,15);
	lab1.setForeground(Color.black);
	lab1.setFont(f);
	
	lab2=new JLabel("Subscribe To");
	lab2.setBounds(280,35,900,50);
	f=new Font("Arial",Font.BOLD,15);
	lab2.setForeground(Color.black);
	lab2.setFont(f);
	
	lab3=new JLabel("Criteria");
	lab3.setBounds(10,75,900,50);
	f=new Font("Arial",Font.BOLD,15);
	lab3.setForeground(Color.black);
	lab3.setFont(f);
	
	lab4=new JLabel("Sort By");
	lab4.setBounds(10,115,900,50);
	f=new Font("Arial",Font.BOLD,15);
	lab4.setForeground(Color.black);
	lab4.setFont(f);
	
	c1=new JComboBox<String>();
	c1.setBounds(80,50,100,20);
	c1.addItem("none");
	c1.addItem("id");
	c1.addItem("name");
	c1.addItem("email_id");
	c1.addItem("country");
	
	c2=new JComboBox<String>();

	c2.setBounds(385,50,100,20);
	c2.addItem("ANY");
	c2.addItem("Magazine");
	c2.addItem("NewsPaper");
	
	c3=new JComboBox<String>();
	c3.setBounds(80,90,130,20);
	c3.addItem("No Of Copy");
	c3.addItem("Expiration Date");
	
	
	c4=new JComboBox<String>();
	c4.setBounds(210,90,80,20);
	c4.addItem("ANY");
	c4.addItem("=");
	c4.addItem(">");
	c4.addItem("<");
	
	c5=new JComboBox<String>();
	c5.setBounds(80,130,100,20);
	c5.addItem("id");
	c5.addItem("country");
	c5.addItem("Expiration Date");
	c5.addItem("No Of Copy");
																																																																																																																																		
	
	c6=new JComboBox<String>();
	c6.setBounds(490,50,100,20);
	
	t8=new JTextField();
	t8.setBounds(200,50,50,20);
	panel3.add(t8);
	
	t9=new JTextField();
	t9.setBounds(290,90,35,20);
	panel3.add(t9);
	
	lab5 = new JLabel("/");
	lab5.setBounds(330,90,20,25);
	panel3.add(lab5);
	
	t10=new JTextField();
	t10.setBounds(340,90,35,20);
	panel3.add(t10);
	
	lab6=new JLabel("/");
	lab6.setBounds(380,90,20,20);
	panel3.add(lab6);
	
	lab7=new JLabel("is");
	lab7.setBounds(205,50,50,20);
	panel3.add(lab7);
	
	t11=new JTextField();
	t11.setBounds(400,90,35,20);
	panel3.add(t11);
	
	
	
	c1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            actions.filterByCBAction(evt);
        }
    });
	
	c2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            actions.subscribedToCBAction(evt);
        }
    });

	c3.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            actions.citeriaCBAction(evt);
        }
    });

	c4.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            actions.operationsCBAction(evt);
        }
    });
	
	
	jb=new JButton("show");
	jb.setBounds(800,130,90,30);
	
	
	
	jb.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            actions.showBTAction(evt);
        }
    });
	
   
    
  
    jt = new JTable();
    jsp = new JScrollPane();
    jt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "name", "email Id", "address", "country", "pin", "BillOrFree"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jsp.setViewportView(jt);
    panel3.add(jsp);
    jsp.setBounds(40,200,960,400);
	jsp.setVisible(true);
        
    ////
	panel3.add(lab);
	panel3.add(lab1);
	panel3.add(lab2);
	panel3.add(lab3);
	panel3.add(lab4);
	panel3.add(c1);
	panel3.add(c2);
	panel3.add(c3);
	panel3.add(c4);
	panel3.add(c5);
	panel3.add(jb);
    panel3.add(c6);
}

public void createGraph(){

	
	
    
    JLabel graphTitle=new JLabel("CUSTOMER INFORMATION");
	graphTitle.setBounds(400,10,900,50);
	Font f=new Font("Arial",Font.BOLD,20);
	graphTitle.setForeground(Color.black);
	graphTitle.setFont(f);
  
	
	panel4=new JPanel();
	panel4.setLayout(null);
	panel4.setBackground(bgColor);
	
	h = new Graph();
	h.setBounds(60,60, Graph.width,Graph.hight);
	
	 panel4.add(graphTitle);
	 
   
   h.setBackground(Color.WHITE);
   
   buttonGroup2 = new ButtonGroup();
   
   b12 = new JRadioButton();
   b13 = new JRadioButton();
   b14 = new JRadioButton();
   b12.setBounds(60, 600, 150,20);
   b13.setBounds(210,600, 150,20);
   b14.setBounds(360,600, 150,20);
   panel4.add(b12);
   buttonGroup2.add(b12);
   b12.setSelected(true);
   b12.setText("Country");
   
   panel4.add(b13);
   buttonGroup2.add(b13);
   b13.setText("Magazine");
   
   panel4.add(b14);
   buttonGroup2.add(b14);
   b14.setText("News Paper");

   
   b12.addActionListener(new java.awt.event.ActionListener() {
       public void actionPerformed(java.awt.event.ActionEvent evt) {
           actions.countryRBAction(evt);
       }
   });
   
   b13.addActionListener(new java.awt.event.ActionListener() {
       public void actionPerformed(java.awt.event.ActionEvent evt) {
           actions.magazineRBAction(evt);
       }
   });
   
   b14.addActionListener(new java.awt.event.ActionListener() {
       public void actionPerformed(java.awt.event.ActionEvent evt) {
           actions.newsPaperRBAction(evt);
       }
   });
   
   
   panel4.add(h);	
}

public void createSubscribe(){
	panel5=new JPanel();
    panel5.setLayout(null);
    panel5.setBackground(bgColor);
    
label13=new JLabel("LOG IN TO SUBSCRIBE");
label13.setBounds(400,10,900,50);

Font f=new Font("Arial",Font.BOLD,20);
	label13.setForeground(Color.black);
	label13.setFont(f);
	
	panel5.add(label13);	
int x = 50,y = 50;
  label14=new JLabel("EMAIL ADDRESS :");
label14.setBounds(10+x,25+y,150,20);
panel5.add(label14);

   field10=new JTextField();
   field10.setBounds(10+x,45+y,150,20);
   panel5.add(field10);
  
label15=new JLabel("PASSWORD :");
label15.setBounds(10+x,70+y,150,20);
panel5.add(label15);

fieldPass10=new JPasswordField();
fieldPass10.setBounds(10+x,90+y,150,20);
panel5.add(fieldPass10);


  label16=new JLabel("subscribe for ");
    label16.setBounds(10,130,150,20);
    panel5.add(label16);

    DefaultComboBoxModel<String> subfor = new DefaultComboBoxModel<String>();

    subfor.addElement("magazin");
    subfor.addElement("news paper");
    
 
    subscribe = new JComboBox<String>(subfor);    
    subscribe.setSelectedIndex(0);
    subscribe.setBounds(100,130,130,20);
    panel5.add(subscribe);
   
    
    
    subscribe.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            actions.subscribeForCBAction(evt);
        }
    });
   
    newsormag=new JComboBox<String>();    
   
    newsormag.setBounds(240,130,100,20);
    panel5.add(newsormag);
   
    
    label18=new JLabel("number of copy");
label18.setBounds(10,180,150,20);
panel5.add(label18);

 field11=new JTextField();
field11.setBounds(120,180,150,20);
panel5.add(field11);
int g = 100; 
    label19=new JLabel("Duration");
label19.setBounds(370,g+25,150,20);
panel5.add(label19);

    label20=new JLabel("month");
label20.setBounds(440,g+25,150,20);
panel5.add(label20);

    DefaultComboBoxModel<String> mon = new DefaultComboBoxModel<String>();

    mon.addElement("1");
    mon.addElement("2");
    mon.addElement("3");
    mon.addElement("4");
    mon.addElement("5");
    mon.addElement("6");
    mon.addElement("7");
    mon.addElement("8");
    mon.addElement("9");
    mon.addElement("10");
    mon.addElement("11");
    
 month=new JComboBox<String>(mon);    
    month.setSelectedIndex(0);
    month.setBounds(510,g+25,80,20);
    panel5.add(month);

    label21=new JLabel("year");
   label21.setBounds(440,g+55,150,20);
   panel5.add(label21);

    DefaultComboBoxModel<String> yea = new DefaultComboBoxModel<String>();

    yea.addElement("0");
    yea.addElement("1");
    yea.addElement("2");
    yea.addElement("3");
    
 year=new JComboBox<String>(yea);    
    year.setSelectedIndex(0);
    year.setBounds(510,g+55,80,20);
    panel5.add(year);

     b4=new JButton("subscribe");
    b4.setBounds(400,300,150,20);
    panel5.add(b4);

   b5=new JButton("log out");
    b5.setBounds(400,350,150,20);
    panel5.add(b5);
    
    b6=new JButton("Enter");
    b6.setBounds(180+x,90+y,70,20);
    panel5.add(b6);
    
    field10.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            actions.enterBTAction(evt);
        }
    });
    
    fieldPass10.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        	actions.enterBTAction(evt);
        }
    });
    
    b6.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        	actions.enterBTAction(evt);
        }
    });
    
  
    
    b4.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            actions.subscribeBTAction(evt);
        }
    });
    
   
    
    b5.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            actions.logOutBTAction(evt);
        }
    });
  
}


public static void main(String[] args) {
    mainFrame = new tab("Project");
	mainFrame.setVisible(true);
	mainFrame.setSize(1000,700);
	}

final static String MySqlPs = "ipeans";
final static String logoURL = "Images/subscribe1.jpg";
final static Color bgColor = new Color(218,165,32);
final static Color outerColor = new Color(128,128,128);
final static Color tabColor = new Color(255,250,205);
static  JTabbedPane tabbedPane;
static  JPanel panel1;
static  JPanel panel2;
static  JPanel panel3;
static  JPanel panel4;
static  JPanel panel5;

static JComboBox<String> c1,c2,c3,c4,c5,c6,month,year,subscribe,newsormag;
static JTextField t8,t9,t10,t11;
static JTextField field,field1,field2,field3,field4,field5,field6,field7,field8,field10,field11,field12;
static JLabel label0,label,label2,lab5,lab6,lab7,label11,label13,label14,label15,label16,label18,label19,label20,label21,logo;
static JScrollPane jsp;
static JTable jt;
static JButton b4,b5,b6;
static JRadioButton b10,b11,b12,b13,b14;
static ButtonGroup buttonGroup1,buttonGroup2;
static JPasswordField field9,fieldPass10,fieldPass;
static Graph h;
static Actions actions;
static tab mainFrame;
static public int i = 0;

}

