import clientecorreo.elements.Email;
import clientecorreo.elements.Folder;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Favio
 */
public class TestClient {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        EmailClient emailClient = new EmailClient();
        System.out.println("emailClient: " + emailClient.toString());
      
        emailClient.addFolder("Span",null);
        System.out.println(" emailClient: " +emailClient.folders.toString());
        
        //correoPrueba.delete();
        
    }
}
