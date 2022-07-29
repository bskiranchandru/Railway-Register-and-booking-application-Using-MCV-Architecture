
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class View {
    private JFrame frame;
    private JLabel first_nameLabel;
    private JLabel last_nameLabel;
    private JLabel genderLabel;
    private JLabel mealsLabel;
    private JLabel leaving_fromLabel;
    private JLabel going_toLabel;
    
    
            
    private JTextField first_nameTextfield;
    private JTextField last_nameTextfield;
    private JTextField genderTextfield;
    private JTextField mealsTextfield;
    private JTextField leaving_fromTextfield;
    private JTextField going_toTextfield;
    
    private JButton submit;
    private JLabel first_name;

    /**
     *
     * @param title
     */
    public View(String title) {
        frame = new JFrame(title);
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 450);
        frame.getContentPane().setBackground(Color.blue);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        // Create UI elements
        first_nameLabel = new JLabel("FIRSTNAME :");
        last_nameLabel = new JLabel("LASTNAME :");
        genderLabel = new JLabel("GENDER :");
        mealsLabel = new JLabel("MEALS:");
        leaving_fromLabel = new JLabel("LEAVING_FROM :");
        going_toLabel = new JLabel("GOING_TO :");
        
        
        first_nameTextfield = new JTextField();
        last_nameTextfield = new JTextField();
        genderTextfield = new JTextField();
        mealsTextfield = new JTextField();
        leaving_fromTextfield = new JTextField();
        going_toTextfield = new JTextField();
        
        
        submit=new JButton("REGISTER");
        // Add UI element to frame
        GroupLayout layout = new GroupLayout(frame.getContentPane());
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(first_nameLabel)
                        .addComponent(last_nameLabel).addComponent(genderLabel).addComponent(mealsLabel).addComponent(leaving_fromLabel).addComponent(going_toLabel))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(first_nameTextfield).addComponent(last_nameTextfield)
                        .addComponent(genderTextfield).addComponent(mealsTextfield).addComponent(leaving_fromTextfield).addComponent(going_toTextfield).addComponent(submit))
                );
        
        
        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(first_nameLabel)
                        .addComponent(first_nameTextfield))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(last_nameLabel)
                        .addComponent(last_nameTextfield))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(genderLabel)
                        .addComponent(genderTextfield))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(mealsLabel)
                        .addComponent(mealsTextfield))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(leaving_fromLabel)
                        .addComponent(leaving_fromTextfield))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(going_toLabel)
                        .addComponent(going_toTextfield))
                
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(submit)));
        

        frame.getContentPane().setLayout(layout);
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JLabel getFirst_nameLabel() {
        return first_nameLabel;
    }
    public void setFirst_nameLabel(JLabel first_nameLabel) {
        this.first_name = first_nameLabel;
    }
    public JLabel getLast_nameLabel() {
        return last_nameLabel;
    }

    public void setLast_nameLabel(JLabel last_nameLabel) {
        this.last_nameLabel = last_nameLabel;
    }

    public JLabel getGenderLabel() {
        return genderLabel;
    }

    public void setGenderLabel(JLabel genderLabel) {
        this.genderLabel = genderLabel;
    }

    public JLabel getMealsLabel() {
        return mealsLabel;
    }

    public void setMealsLabel(JLabel mealsLabel) {
        this.mealsLabel = mealsLabel;
    }

    public JLabel getLeaving_fromLabel() {
        return leaving_fromLabel;
    }

    public void setLeaving_fromLabel(JLabel leaving_fromLabel) {
        this.leaving_fromLabel = leaving_fromLabel;
    }

    public JLabel getGoing_toLabel() {
        return going_toLabel;
    }

    public void setGoing_toLabel(JLabel going_toLabel) {
        this.going_toLabel = going_toLabel;
    }

    

    public JTextField getFirst_nameTextfield() {
        return first_nameTextfield;
    }

    public void setFirst_nameTextfield(JTextField first_nameTextfield) {
        this.first_nameTextfield = first_nameTextfield;
    }

    public JTextField getLast_nameTextfield() {
        return last_nameTextfield;
    }

    public void setLast_nameTextfield(JTextField last_nameTextfield) {
        this.last_nameTextfield = last_nameTextfield;
    }

    public JTextField getGenderTextfield() {
        return genderTextfield;
    }

    public void setGenderTextfield(JTextField genderTextfield) {
        this.genderTextfield = genderTextfield;
    }

    public JTextField getMealsTextfield() {
        return mealsTextfield;
    }

    public void setMealsTextfield(JTextField mealsTextfield) {
        this.mealsTextfield = mealsTextfield;
    }

    public JTextField getLeaving_fromTextfield() {
        return leaving_fromTextfield;
    }

    public void setLeaving_fromTextfield(JTextField leaving_fromTextfield) {
        this.leaving_fromTextfield = leaving_fromTextfield;
    }

    public JTextField getGoing_toTextfield() {
        return going_toTextfield;
    }

    public void setGoing_toTextfield(JTextField going_toTextfield) {
        this.going_toTextfield = going_toTextfield;
    }

   
    public JButton getSubmit(){
        return submit;
    }
    public void setSubmit(JButton submit) {
        this.submit = submit;
    }
    
    
}