import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class UI {
    public UI(Backend backend){

        //create arraylists to store the input course and section
        ArrayList<String> inputCourseList = new ArrayList<>();
        ArrayList<String> inputSectionList = new ArrayList<>();

        //Setting up the UI
        JFrame frame = new JFrame("Chat Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Course Name");
        JTextField tf = new JTextField(10); // accepts up to 10 characters
        JLabel label2 = new JLabel("Section");
        JTextField tf2 = new JTextField(8); // accepts up to 8 characters
        JButton addBtn = new JButton("Add");
        JButton goBtn = new JButton("Go");
        panel.add(label); // Components Added using Flow Layout
        panel.add(tf);
        panel.add(label2);
        panel.add(tf2);
        panel.add(addBtn);
        panel.add(goBtn);
        JTextArea ta = new JTextArea(); //text area at center

        //Event Handler Functions: Those activate when you click on a button
        addBtn.addActionListener(new ActionListener() { //action for add button
            @Override
            public void actionPerformed(ActionEvent e) {
                String course = tf.getText();
                String section = tf2.getText();
                try {
                    if(backend.verifycourse(course, section)){
                        ta.append("  " + course + " | "+ section +"\n");
                        inputCourseList.add(course);
                        inputSectionList.add(section);
                    }
                    else{
                        JOptionPane.showMessageDialog(frame, "Invalid Course ");
                    }
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
        goBtn.addActionListener(new ActionListener() { //action for go button
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inputCourseList.size()==0) JOptionPane.showMessageDialog(frame, "No Course Selected");
                else {
                    try {
                        ta.setText(backend.findOutputListToUI(inputCourseList, inputSectionList));
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                }
            }
        });

        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
    }
}
