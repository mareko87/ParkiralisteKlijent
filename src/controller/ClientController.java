/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import domain.Administrator;
import domain.Organizacija;
import domain.Parkiraliste;
import domain.Racun;
import domain.Vozilo;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import session.Session;
import transfer.Request;
import transfer.Response;
import transfer.util.Operation;
import transfer.util.ResponseStatus;

/**
 *
 * @author Marko Milosevic
 */
public class ClientController {

    private static ClientController instance;

    private ClientController() {
    }

    public static ClientController getInstance() {
        if (instance == null) {
            instance = new ClientController();
        }
        return instance;
    }

    public Administrator login(Administrator administrator) throws Exception {
        return (Administrator) sendRequest(Operation.LOGIN, administrator);
    }
    
    public Administrator getAdministrator(Administrator administrator) throws Exception {
        return (Administrator) sendRequest(Operation.GET_ADMINISTRATOR, administrator);
    }

    public Organizacija getOrganizacija(Organizacija organizacija) throws Exception {
        return (Organizacija) sendRequest(Operation.GET_ORGANIZACIJA, organizacija);
    }
    
    public void addAdministrator(Administrator administrator) throws Exception {
        sendRequest(Operation.ADD_ADMINISTRATOR, administrator);
    }

    public void addOrganizacija(Organizacija organizacija) throws Exception {
        sendRequest(Operation.ADD_ORGANIZACIJA, organizacija);
    }

    public void addRacun(Racun racun) throws Exception {
        sendRequest(Operation.ADD_RACUN, racun);
    }

    public void addVozilo(Vozilo vozilo) throws Exception {
        sendRequest(Operation.ADD_VOZILO, vozilo);
    }

    public void deleteAdministrator(Administrator administrator) throws Exception {
        sendRequest(Operation.DELETE_ADMINISTRATOR, administrator);
    }

    public void deleteOrganizacija(Organizacija organizacija) throws Exception {
        sendRequest(Operation.DELETE_ORGANIZACIJA, organizacija);
    }

    public void deleteVozilo(Vozilo vozilo) throws Exception {
        sendRequest(Operation.DELETE_VOZILO, vozilo);
    }

    public void editAdministrator(Administrator administrator) throws Exception {
        sendRequest(Operation.EDIT_ADMINISTRATOR, administrator);
    }

    public void editOrganizacija(Organizacija organizacija) throws Exception {
        sendRequest(Operation.EDIT_ORGANIZACIJA, organizacija);
    }

    public ArrayList<Administrator> getAllAdministrator() throws Exception {
        return (ArrayList<Administrator>) sendRequest(Operation.GET_ALL_ADMINISTRATOR, null);
    }

    public ArrayList<Organizacija> getAllOrganizacija() throws Exception {
        return (ArrayList<Organizacija>) sendRequest(Operation.GET_ALL_ORGANIZACIJA, null);
    }

    public ArrayList<Parkiraliste> getAllParkiraliste() throws Exception {
        return (ArrayList<Parkiraliste>) sendRequest(Operation.GET_ALL_PARKIRALISTE, null);
    }

    public ArrayList<Racun> getAllRacun() throws Exception {
        return (ArrayList<Racun>) sendRequest(Operation.GET_ALL_RACUN, null);
    }

    public ArrayList<Vozilo> getAllVozilo() throws Exception {
        return (ArrayList<Vozilo>) sendRequest(Operation.GET_ALL_VOZILO, null);
    }

    private Object sendRequest(int operation, Object data) throws Exception {
        Request req = new Request(operation, data);
        
        ObjectOutputStream out = new ObjectOutputStream(Session.getInstance().getSocket().getOutputStream());
        out.writeObject(req);
        
        ObjectInputStream in = new ObjectInputStream(Session.getInstance().getSocket().getInputStream());
        Response res = (Response) in.readObject();
        
        if (res.getResponseStatus().equals(ResponseStatus.Error)) {
            throw res.getError();
        } else {
            return res.getData();
        }
    }



}
