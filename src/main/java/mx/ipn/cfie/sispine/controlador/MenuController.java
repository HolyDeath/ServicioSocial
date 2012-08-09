/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.ipn.cfie.sispine.controlador;

import java.io.Serializable;
import javax.faces.bean.CustomScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;

/**
 *
 * @author VI5A5B3
 */
@ManagedBean(name= MenuController.BEAN_NAME)
@CustomScoped(value = "#{window}")
public class MenuController implements Serializable{
    public static final String BEAN_NAME = "Menu";
    private String file = "";

    public MenuController(){
        
    }
    
    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }      
    
    public void firedAction(ActionEvent evt){
      String page = evt.getComponent().getAttributes().get("pagina").toString();
      if(page!=null){
            setFile(page);
      }
    }
}
