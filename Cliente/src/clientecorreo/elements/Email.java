/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientecorreo.elements;

/**
 *
 * @author Favio
 */
public class Email {

    /**
     * @return the from
     */
    public String getFrom() {
        return from;
    }

    /**
     * @return the sent
     */
    public String getSent() {
        return sent;
    }

    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @return the cc
     */
    public String getCc() {
        return cc;
    }

    /**
     * @return the body
     */
    public String getBody() {
        return body;
    }
 
 private String from;
 private String sent;
 private String subject;
 private String cc;
 private String body;

    public Email() {
    }
    public void setFrom(String from) {
        this.from = from;
    }

    public void setSent(String sent) {
        this.sent = sent;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
