
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

    Folder inbox;
    Folder sent;
    Folder trash;

    IBehavior hardDelete = new HardDelete();
    IBehavior softDelete = new SoftDelete();
    IBehavior move = new Moveable();

    public EmailClient() {

        inbox = new Folder("imbox");
        sent = new Folder("sent");
        trash = new Folder("trash");
        folders = new ArrayList<>();
        
        inbox.getBehaviors().add(softDelete);
        inbox.getBehaviors().add(move);
        
        sent.getBehaviors().add(softDelete);
        sent.getBehaviors().add(move);

        trash.getBehaviors().add(move);
        trash.getBehaviors().add(hardDelete);

        folders.add(inbox);
        folders.add(sent);
        folders.add(trash);

    }
    
    public void addEmail(String body, String subject){
        Email email = new Email();
        email.setBody(body);
        email.setSubject(subject);
        //TODO reglas para seleccionar folder
        inbox.addEmail(email);
    }

    void addFolder(String name, Folder parent) {        
        Folder folder = new Folder(name);        
        folder.setName(name);
        folder.setParent(parent);
        folders.add(folder);
    }

}
