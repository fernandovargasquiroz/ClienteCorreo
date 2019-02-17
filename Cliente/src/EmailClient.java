
import clientecorreo.behaviors.HardDelete;
import clientecorreo.behaviors.IBehavior;
import clientecorreo.behaviors.Moveable;
import clientecorreo.behaviors.SoftDelete;
import clientecorreo.elements.Email;
import clientecorreo.elements.Folder;
import java.util.ArrayList;
import java.util.List;
import sun.nio.cs.ext.IBM037;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Favio
 */
public class EmailClient {

    List<Folder> folders;
    private Folder root;
    Folder inbox;
    Folder sent;
    Folder trash;

    IBehavior hardDelete = new HardDelete();
    IBehavior softDelete = new SoftDelete();
    IBehavior move = new Moveable();

    public EmailClient() {
        
        root = new Folder("root");
        

        inbox = root.addFolder("imbox");
        sent = root.addFolder("sent");
        trash = root.addFolder("trash");
        
        
        inbox.addBehavior(softDelete);
        inbox.addBehavior(move);
        
        sent.addBehavior(softDelete);
        sent.addBehavior(move);

        trash.addBehavior(move);
        trash.addBehavior(hardDelete);

        

    }
    
    public void receive(String body, String subject){
        Email email = new Email();
        email.setBody(body);
        email.setSubject(subject);
        
        //TODO reglas para seleccionar folder
        inbox.addEmail(email);
    }

    Folder addFolder(String name) { 
        return root.addFolder(name);        
    }
    void addFolder(String name, String parent){
        
        Folder parentFolder = getFolderByName(parent);
        if(parentFolder != null)
            parentFolder.addFolder(name);
    }
    
    Folder getFolderByName(String name){
        return root.find(name);
    }
    void print(){
        root.print();
    }
    

}
