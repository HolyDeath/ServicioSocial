/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.ipn.cfie.sispine.controlador;

import java.io.Serializable;
import javax.faces.bean.CustomScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author VI5A5B3
 */
@ManagedBean(name= MenuController.BEAN_NAME)
@CustomScoped(value = "#{window}")
public class MenuController implements Serializable{
    public static final String BEAN_NAME = "Menu";
    
    public MenuController(){
        
    }
    
    public String firedAction(){
        return "lol";
    }
}
