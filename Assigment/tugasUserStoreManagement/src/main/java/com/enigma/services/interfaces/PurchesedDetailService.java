package com.enigma.services.interfaces;

import com.enigma.entity.PurchesedDetail;

import java.util.List;

public interface PurchesedDetailService {
    List<PurchesedDetail> getAllPurchesedDetail(PurchesedDetail purchesedDetail);
    PurchesedDetail getPurchesedDetailById(String id);
}
