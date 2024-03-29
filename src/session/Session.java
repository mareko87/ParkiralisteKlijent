/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import domain.Administrator;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author Marko Milosevic
 */
public class Session {

    private static Session instance;
    private Socket socket;
    private Administrator trenutnoUlogovani;

    private Session() {
        try {
            socket = new Socket("localhost" ,10000);
        } catch (IOException ex) {
            System.err.println("Greska prilikom instanciranja soketa: " + ex.getMessage());
        }
    }

    public static Session getInstance() {
        if (instance == null) {
            instance = new Session();
        }
        return instance;
    }

    public Socket getSocket() {
        return socket;
    }

    public void setTrenutnoUlogovani(Administrator trenutnoUlogovani) {
        this.trenutnoUlogovani = trenutnoUlogovani;
    }

    public Administrator getTrenutnoUlogovani() {
        return trenutnoUlogovani;
    }

}
