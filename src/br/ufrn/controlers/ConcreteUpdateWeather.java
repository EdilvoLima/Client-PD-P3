/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.controlers;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

/**
 *
 * @author Edilvo
 */
public class ConcreteUpdateWeather implements UpdateWeather{
    
    
    
    private Client client = Client.create();
    private static String URL_BASE_SERVICO = "http://pd-p3-00.appspot.com/storage";

//    @Override
//    public void up(Integer area, Integer indexPolluition) {
//        WebResource resource = client.resource(URL_BASE_SERVICO+"atualizar_indice_poluicao/"+area);
//        resource.type("application/json").post(indexPolluition.toString());
//    }

    @Override
    public void updateWeather(Integer temp1, Integer temp2, Integer temp3, 
                              Integer humidity1, Integer humidity2, Integer humidity3) {
        String param =  "temp1="+ temp1.toString() + 
                        "&temp2="+ temp2.toString() +
                        "&temp3="+ temp3.toString() +
                        "&humidity1="+ humidity1.toString() + 
                        "&humidity2="+ humidity2.toString() + 
                        "&humidity3="+ humidity3.toString();
        
        WebResource resource = client.resource(URL_BASE_SERVICO);
        resource.type("application/x-www-form-urlencoded").post(param);
    }

}
