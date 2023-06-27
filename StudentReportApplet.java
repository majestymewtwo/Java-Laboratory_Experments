
//8
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class StudentReportApplet extends Applet implements ActionListener {

    private TextField nameField, rollNumberField, marksField;
    private Button submitButton, clearButton;
    private ArrayList<String> reports = new ArrayList<>();

    @Override
    public void init() {
        Label nameLabel = new Label("Name:");
        nameField = new TextField(30);
        Label rollNumberLabel = new Label("Roll Number:");
        rollNumberField = new TextField(30);
        Label marksLabel = new Label("Marks:");
        marksField = new TextField(30);

        submitButton = new Button("Submit");
        clearButton = new Button("Clear");

        submitButton.addActionListener(this);
        clearButton.addActionListener(this);

        add(nameLabel);
        add(nameField);
        add(rollNumberLabel);
        add(rollNumberField);
        add(marksLabel);
        add(marksField);
        add(submitButton);
        add(clearButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String name = nameField.getText();
            String rollNumber = rollNumberField.getText();
            int marks = Integer.parseInt(marksField.getText());

            nameField.setText("");
            rollNumberField.setText("");
            marksField.setText("");

            String report = "Name: " + name + "\t" + "Roll Number: " + rollNumber + "\t" + "Marks: " + marks;
            reports.add(report);

            repaint();
        } else if (e.getSource() == clearButton) {

            nameField.setText("");
            rollNumberField.setText("");
            marksField.setText("");
            reports.clear();

            repaint();
        }
    }

    @Override
    public void paint(Graphics g) {
        int yPos = 120;
        if (reports.size() >= 1) {
            g.drawString("Student Report:", 10, 100);
            for (String report : reports) {
                g.drawString(report, 10, yPos);
                yPos += 30;
            }
        }
    }
}
/*
 * <applet code="StudentReportApplet.class" height="600" width="400">
 * </applet>
 */