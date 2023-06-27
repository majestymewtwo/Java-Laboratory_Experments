import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentReportApplet extends Applet implements ActionListener {
    private TextField nameField, rollNumberField, marksField;
    private Button submitButton, clearButton;
    private String report;

    @Override
    public void init() {
        // Create labels and text fields
        Label nameLabel = new Label("Name:");
        nameField = new TextField(20);
        Label rollNumberLabel = new Label("Roll Number:");
        rollNumberField = new TextField(10);
        Label marksLabel = new Label("Marks:");
        marksField = new TextField(3);

        // Create buttons
        submitButton = new Button("Submit");
        clearButton = new Button("Clear");

        // Add action listeners to buttons
        submitButton.addActionListener(this);
        clearButton.addActionListener(this);

        // Add components to the applet
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
            // Get input values from text fields
            String name = nameField.getText();
            String rollNumber = rollNumberField.getText();
            int marks = Integer.parseInt(marksField.getText());

            // Generate the student report
            report = "Name: " + name + "\n"
                    + "Roll Number: " + rollNumber + "\n"
                    + "Marks: " + marks;

            // Repaint the applet to display the report
            repaint();
        } else if (e.getSource() == clearButton) {
            // Clear the text fields and report
            nameField.setText("");
            rollNumberField.setText("");
            marksField.setText("");
            report = "";

            // Repaint the applet to clear the report
            repaint();
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Display the student report
        if (report != null && !report.isEmpty()) {
            g.drawString("Student Report:", 10, 100);
            g.drawString(report, 10, 120);
        }
    }
}
/*
 * <applet code="StudentReportApplet.class" height="600" width="400">
 * </applet>
 */