package UT3.ej5.pt3;


import UT2.ej7.*;
import java.util.Collection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ernesto
 */
public interface IArbolTrie {

    Collection<TAbonado> buscarTelefonos(String pais, String area);

    void insertar(TAbonado unAbonado);
    
}
