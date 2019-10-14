package com.enigma.services.interfaces;

import com.enigma.entity.Purchesed;
import com.enigma.entity.PurchesedDetail;

import java.util.List;

public interface PurchesedDetailServices {
    PurchesedDetail save(PurchesedDetail purchesedDetail);
    PurchesedDetail getDetailId(String id);
    List<PurchesedDetail> getAllDetailList(PurchesedDetail purchesedDetail);
    void deleteDetailId(PurchesedDetail purchesedDetail);
    public void purchasing(PurchesedDetail purchesedDetail);
}
