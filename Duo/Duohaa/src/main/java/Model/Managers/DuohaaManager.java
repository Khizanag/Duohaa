package Model.Managers;

import Controller.Classes.Duohaa;
import Model.DatabaseConnector;

import java.sql.Connection;

public class DuohaaManager {

    private Connection connection;

    public DuohaaManager(){
        connection = DatabaseConnector.getConnection();
    }

    public boolean insertDuohaa(Duohaa duohaa){
        return false;
    }

    public Duohaa getDuohaa(int ID){

        return null;
    }
}
