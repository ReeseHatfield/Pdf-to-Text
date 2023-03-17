import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    private JButton uploadBtn;
    private JButton downloadBtn;
    private JButton convertBtn;

    private JLabel currentFileLabel;

    public GUI(){


        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        this.initializeComponents();


        this.setSize(500,500);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);


        this.setVisible(true);

    }


    private void initializeComponents(){
        JPanel topPanel = new JPanel();

        JButton uploadBtn = new JButton("Upload");
        uploadBtn.setPreferredSize(new Dimension(200, 100));
        JButton downloadBtn = new JButton("Download");
        downloadBtn.setPreferredSize(new Dimension(200, 100));

        topPanel.add(uploadBtn);
        topPanel.add(downloadBtn);

        this.add(topPanel);

        this.convertBtn = new JButton("Convert");
        convertBtn.setPreferredSize(new Dimension(300,125));

        this.currentFileLabel = new JLabel("Current File: ");
        this.add(this.currentFileLabel);
        currentFileLabel.setPreferredSize(new Dimension(200,200));




        this.add(this.convertBtn);
    }
}
