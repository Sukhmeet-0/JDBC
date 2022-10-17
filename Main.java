import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Main extends JFrame {
    public static void main(String[] args) {
        try{
            Connection c =ConnectionsProvider.getConnection();
            String q = "insert into images(pic) values(?)";

            PreparedStatement s =c.prepareStatement(q);

            JFileChooser fileChooser = new JFileChooser();
            fileChooser.showOpenDialog(null);
            File file=fileChooser.getSelectedFile();

            FileInputStream fis =new FileInputStream(file);

            s.setBinaryStream(1,fis,fis.available());
            s.executeUpdate();
//            System.out.println("Done....");

            JOptionPane.showMessageDialog(null,"success");


        }catch(Exception e){
            e.printStackTrace();
        }
    }
}