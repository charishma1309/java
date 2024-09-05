import java.awt.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;
class MyFrame extends Exception implements ActionListener
{
   float b=10000;
   Label l1,l2,l3,l4,l5,l6;
   JButton b1,b2,b3,b4;
   TextField t1,t2,t3;

   Frame f=new Frame();
    MyFrame()
    {
       
       super("MY PROJECT");
       f.setLayout(null);
       f.setSize(300,200);
       f.setVisible(true);
       l1=new Label("Account Number");
       t1=new TextField();
       b1=new JButton("OK");
       b2=new JButton("CANCLE");

       l2=new Label("");
       
       
       l1.setBounds(100,50,120,20);
       t1.setBounds(240,50,100,30);
       b1.setBounds(200,130,70,50);
       l2.setBounds(1000,1000,10,10);
       b2.setBounds(300,130,100,50);
       f.add(l1);
       f.add(t1);
       f.add(b1);
       f.add(l2);
       f.add(b2);
       b1.addActionListener(this);
       b2.addActionListener(this);

      
      f.addWindowListener(new WindowAdapter()
      {
         public void windowClosing(WindowEvent we)
         {
            System.exit(0);
         }
      });
    }
   public void actionPerformed(ActionEvent ae)
   {
     int data=0;
     String a;
     float c,d;
    
     if(ae.getSource()==b1)
     {
     try{
        a = "C:/java_project/charishma/" + t1.getText() + ".txt";
        File f2 = new File(a);
        System.out.println("Looking for file: " + f2.getAbsolutePath());
        
        Boolean bb=f2.exists();
        if(bb==false)
        {
            System.out.println("FILE DOES NOT EXISTS");
        }
     if(bb)
     {
           FileInputStream fs=new FileInputStream(a);
           while((data=fs.read())!=-1)
        {
          System.out.print((char)data);
        }
     }


        if(bb)
        {
       
          Frame fr=new Frame();
          fr.setTitle("YOUR DATA");
          System.out.print((char)data);
          fr.setVisible(true);
          fr.setSize(500,500);
          l5=new Label("YOUR ACCOUNT BALANCE IS");  
          l3=new Label("");   
          b3=new JButton("DEPOSIT");
          b4=new JButton("WITHDRAW");
          l5.setBounds(100,120,120,20);
          l4=new Label("Enter the amount");
          t2=new TextField();
          t3=new TextField();
          b3.setBounds(100,200,110,50);
          b4.setBounds(300,200,110,50);
          l3.setBounds(1000,1000,10,10);
          t3.setBounds(240,120,100,30);
          t2.setBounds(240,50,100,30);
          l4.setBounds(100,50,120,20);
          fr.add(t3);
          fr.add(b3);
          fr.add(b4);
          fr.add(t2);
          fr.add(l4);         
          fr.add(l5);
          fr.add(l3);
          b3.addActionListener(this);
          b4.addActionListener(this);
          
        }

        }
        catch(FileNotFoundException aw)
        {
              System.out.println("Account Does Not Exist");
        }
        catch(IOException ie)
        {
              System.out.println("Data Does Not Exsist");
        }
        catch(NullPointerException ne)
        {
              System.out.println("exception");
        }
     }
     if(ae.getSource()==b2)
     {
         System.exit(0);
         
     }
      if(ae.getSource()==b3)
      {
         c=Float.parseFloat(t2.getText().trim());
         b=b+c;
         t3.setText(Float.toString(b));
      }
      if(ae.getSource()==b4)
      {
         
         c=Float.parseFloat(t2.getText().trim());
         if(c<b)
         {
         b=b-c;
         t3.setText(Float.toString(b));     
         }    
      }
     
   }

 
   public static void main(String args[])throws FileNotFoundException,IOException
   {
     new MyFrame();
   }
}