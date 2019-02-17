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
    
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        String parentFolder = "SPAM";
        EmailClient emailClient = new EmailClient();
        //System.out.println("emailClient: " + emailClient.toString());
        
        Folder spam = emailClient.addFolder(parentFolder);
        emailClient.addFolder("Span2", spam.getName());
        
        
        emailClient.addFolder("Span2.1", "Span2");
        emailClient.addFolder("Span2.2", "Span2.1");
        emailClient.addFolder("Span2.3", "Span2.2");
        
        emailClient.receive("Hola Amigos!", "Saludos");
        emailClient.receive("Hola Amigos!", "Saludos 22");
        //emailClient.inbox.getEmails();
        //emailClient.inbox.printMessages();
        
        emailClient.print();
        // 
        
    }
}
