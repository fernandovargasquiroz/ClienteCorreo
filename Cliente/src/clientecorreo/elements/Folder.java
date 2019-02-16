package clientecorreo.elements;

import clientecorreo.behaviors.IBehavior;
import java.util.ArrayList;
import java.util.List;

public class Folder {
    private String name;
    private Folder parent;
    private List<IBehavior> behaviors;
    private List<Email> emails;
    
    public Folder(String name) {
        this.name = name;
        emails = new ArrayList<Email>();
        behaviors = new ArrayList<IBehavior>();
    }
    public void addBehavior(IBehavior behavior){
            
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Folder getParent() {
        return parent;
    }

    public void setParent(Folder parent) {
        this.parent = parent;
    }

    public List<IBehavior> getBehaviors() {
        return behaviors;
    }

    public void setBehaviors(List<IBehavior> behaviors) {
        this.behaviors = behaviors;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }
    public void addEmail(Email email){
        this.emails.add(email);
    }

}
