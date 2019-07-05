import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame implements ActionListener {

    JLabel[] years;
    JLabel days;

    MainFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,600);
        setTitle("Strava Activity Visualizer");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int h = (int) screenSize.getHeight();
        int w = (int) screenSize.getWidth();
        setLocation(w/2-300, h/2-300);
        setResizable(false);
        ImageIcon icon = new ImageIcon("path");
        setIconImage(icon.getImage());

        JPanel year1 = new JPanel();
        GridLayout yearGL = new GridLayout(7, 52);
        year1.setLayout(yearGL);
        JLabel[] years = new JLabel[364];
        for(int i = 0; i<364; i++){
            years[i] = new JLabel();
            if(i%2 == 0) {
                years[i].setBackground(Color.BLACK);
            }
            else{
                years[i].setBackground(Color.BLUE);
            }
            year1.add(years[i]);
        }
        add(year1);

        //maybe paint rectangles?

    }

    public void actionPerformed(ActionEvent e){

    }
}
