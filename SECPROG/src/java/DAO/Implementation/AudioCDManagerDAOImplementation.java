/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Implementation;

import Beans.AudioCDBean;
import DAO.Interface.AudioManagerCDDAOInterface;
import java.util.ArrayList;

/**
 *
 * @author Danica
 */
public class AudioCDManagerDAOImplementation implements AudioManagerCDDAOInterface {

    @Override
    public boolean addAudioCD(AudioCDBean audioCD) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editAudioCD(AudioCDBean audioCD) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteAudioCD(int audioCDID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AudioCDBean getAudioCDById(int ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<AudioCDBean> getAllAudioCDByArtist(String artist) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<AudioCDBean> getAllAudioCDByRecordCompany(String recordCompany) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<AudioCDBean> getAllAudioCD() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
