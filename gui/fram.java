import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.Button;
import java.awt.TextArea;

public class fram
{
   public static void main (String[] arge){
    Frame f=new Frame("数据转移");
    f.setBounds(400,200,400,300);
    f.setLayout(new FlowLayout());
    
    final TextField tf=new TextField(20);
    
    Button bu=new Button("数据转移");
    
    TextArea ta=new TextArea(10,10);
    
    f.add(tf);
    f.add(bu);
    f.add(ta);
    
    f.addWindowListener(new WindowAdapter(){
        @Override
        public void WindowClosing(WindowEvent e){
    System.exit(0);}
    });
    bu.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
    String tf_str = tf.getText().trin();
    }
    
    });
    }
    
}
