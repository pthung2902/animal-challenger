package com.stel.challenger.action;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Simulate the say ability of animal
 * @author fpta-pthung
 * Support i18
 */
@FunctionalInterface
public interface Sayable {

    void say();

    default ResourceBundle getBundle(){
        Locale locale= Locale.getDefault();
        if(locale==null){
            locale= Locale.ENGLISH;
        }
        ResourceBundle bundleFR = ResourceBundle.getBundle("ApplicationMessages", locale);
        return bundleFR;
    }


    default String getVoice(String text){
      StringBuffer voice= new StringBuffer(text).append(".voice");
      return    getBundle().getString(voice.toString());
    }

}
