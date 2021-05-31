import javax.swing.*;    
public class table {    
    JFrame f;    
    table(){    
    f=new JFrame();    
    String data[][]={ {"01","Prateek","8.8"},    
                          {"02","Rishabh","7.8"},    
                          {"03","Bhumik","8.9"},    
                            {"04","Palkesh","7.5"}};
    String column[]={"ID","NAME","CGPA"};         
    JTable jt=new JTable(data,column);    
    jt.setBounds(30,40,200,300);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(300,400);    
    f.setVisible(true);    
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
}     
public static void main(String[] args) {    
    new table();    
}    
}  
