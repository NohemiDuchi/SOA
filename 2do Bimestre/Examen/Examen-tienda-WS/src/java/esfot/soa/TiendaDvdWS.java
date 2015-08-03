/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esfot.soa;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import esfot.soa.PeliculaTO;


/**
 *
 * @author Nohemi
 */
@WebService(serviceName = "TiendaDvdWS")
public class TiendaDvdWS {

    /**
     * This is a sample web service operation
     */
    /*@WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }*/
    
    final static PeliculaTO[] peliculas={
        
        new PeliculaTO("Mulholland Drive", "David Lynch", 26.96f),
        new PeliculaTO("Carretera perdida", "David Lynch", 18.95f),
        new PeliculaTO("Twin Peaks", "David Lynch",46.95f ),
        new PeliculaTO("Telefono rojo", "Stanley Kubrick", 15.95f),
        new PeliculaTO("Barry Lyndon", "Stanley Kubrick", 24.95f),
        new PeliculaTO("La naranja mecánica", "Stanley kubrick", 22.95f)
    };

    /**
     * Web service operation
     */
    @WebMethod(operationName = "buscarDirector")
    public List<PeliculaTO> buscarDirector(@WebParam(name = "director") String director) {
         //TODO write your implementation code here:
        director=director.toLowerCase();
        ArrayList<PeliculaTO> list = new ArrayList<PeliculaTO>();
        for (PeliculaTO pelicula: peliculas)
        {
            if (pelicula.getDirector().toLowerCase().indexOf(director)!=-1)
            {
                list.add(pelicula);
            }
        }
        return list;
    }
}
