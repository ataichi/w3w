/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Interface;

/**
 *
 * @author jao
 */

import Beans.AudioCDBean;

public interface AudioCDDAOInterface {
    
    public AudioCDBean getAudioCD (int ID);
    public boolean addAudioCD (AudioCDBean audioCD);
    public boolean editAudioCD (AudioCDBean audioCD);
    public boolean deleteAudioCD (AudioCDBean audioCD);
    
}
