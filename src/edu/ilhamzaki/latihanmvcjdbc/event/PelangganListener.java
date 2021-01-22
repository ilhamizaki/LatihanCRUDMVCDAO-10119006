/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ilhamzaki.latihanmvcjdbc.event;

import edu.ilhamzaki.latihanmvcjdbc.entity.Pelanggan;
import edu.ilhamzaki.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author
 * NIM : 10119006
 * NAMA : ILHAM ZAKI
 * KELAS : IF-1
 */
public interface PelangganListener {

    public void onChange(PelangganModel model);

    public void onInsert(Pelanggan pelanggan);

    public void onDelete();

    public void onUpdate(Pelanggan pelanggan);
}
