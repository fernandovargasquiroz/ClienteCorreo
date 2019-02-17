package clientecorreo.elements;

import clientecorreo.behaviors.IBehavior;
import java.util.ArrayList;
import java.util.List;

public class Folder implements IContainer{

    /**
     * @return the folders
     */
    public List<Folder> getFolders() {
        return folders;
    }

    /**
     * @param folders the folders to set
     */
    public void setFolders(List<Folder> folders) {
        this.folders = folders;
    }

    /**
     * @return the behaviors
     */
    public List<IBehavior> getBehaviors() {
        return behaviors;
    }

    /**
     * @param behaviors the behaviors to set
     */
    public void setBehaviors(List<IBehavior> behaviors) {
        this.behaviors = behaviors;
    }

    /**
     * @param emails the emails to set
     */
    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    private String name;
    private List<Folder> folders;
    private List<IBehavior> behaviors;
    private List<Email> emails;
    
    public Folder(String name) {
        this.name = name;
        emails = new ArrayList<Email>();
        behaviors = new ArrayList<IBehavior>();
        folders = new ArrayList<Folder>();
    }
    public void addBehavior(IBehavior behavior){
        getBehaviors().add(behavior);
    }
    public Folder addFolder(String name){ 
        Folder folder = new Folder(name);
        getFolders().add(folder);
        return folder;
    }
    
    public Folder addFolder(String name, String parent){
        Folder parentFolder = this.find(parent);
        if(parentFolder != null)
            return parentFolder.addFolder(name);
        return null;
    }
    public void addEmail(Email email){
        getEmails().add(email);
    }
    public List<Email> getEmails(){
        return emails;
    }
    public void print(){
        System.out.println(this.getName());
        for (Folder folder : folders) {
            System.out.print(" --- ");
            folder.print();    
        }
    }
    public Folder find(String name){
        for (Folder folder : folders) {
            if(folder.getName().equals(name))
                return folder;
            else
                return folder.find(name);
        }
    }
}
