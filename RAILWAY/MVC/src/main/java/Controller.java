
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;


public class Controller {
    private Model model;
    private View view;
    static Connection con = null;
    static PreparedStatement patmt = null;
    
    public Controller(Model m, View v){
        model = m;
        view = v;
        
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/railway_managment","root","");
        }
        catch(SQLException e2){
            JOptionPane.showMessageDialog(null, e2);
        }
        initView();
    }
    
    public void initView(){
        view.getFirst_nameTextfield().setText(model.getFirst_name());
        view.getLast_nameTextfield().setText(model.getLast_name());
        view.getGenderTextfield().setText(model.getGender());
        view.getMealsTextfield().setText(model.getMeals());
        view.getLeaving_fromTextfield().setText(model.getLeaving_from());
        view.getGoing_toTextfield().setText(model.getGoing_to());
       
    }
    
    public void initController(){
        view.getSubmit().addActionListener(e -> submit());
    }
    
    private void submit(){
        model.setFirst_name(view.getFirst_nameTextfield().getText());
        model.setLast_name(view.getLast_nameTextfield().getText());
        model.setGender(view.getGenderTextfield().getText());
        model.setMeals(view.getMealsTextfield().getText());
        model.setLeaving_from(view.getLeaving_fromTextfield().getText());
        model.setGoing_to(view.getGoing_toTextfield().getText());
       
        try {
            String querys = "insert into reservation(first_name, last_name, gender, meals, leaving_from,going_to)"+ "values(?,?,?,?,?,?)";
            patmt=con.prepareStatement(querys);
            
            
            patmt.setString(1, model.getFirst_name());
            patmt.setString(2, model.getLast_name());
            patmt.setString(3, model.getGender());
            patmt.setString(4, model.getMeals());
            patmt.setString(5, model.getLeaving_from());
            patmt.setString(6, model.getGoing_to());
            
            patmt.executeUpdate();
            JOptionPane.showMessageDialog(null, " You Booking Successfully");
            
            
        }
        catch (Exception ex) {
            
             System.out.print(ex);
             JOptionPane.showMessageDialog(null, "Booking Failed");
        }
    }
    
}
