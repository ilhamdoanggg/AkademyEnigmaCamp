package com.enigma.services.implement;

import com.enigma.entity.PurchesedDetail;
import com.enigma.repository.PurchesedDetailRepo;
import com.enigma.services.interfaces.ProductServices;
import com.enigma.services.interfaces.PurchesedDetailServices;
import com.enigma.services.interfaces.PurchesedServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public class PurchesedDetailService implements PurchesedDetailServices {
    @Autowired
    PurchesedDetailRepo purchesedDetailRepo;
    @Autowired
    PurchesedServices purchesedServices;
    @Autowired
    ProductServices productServices;

    @Override
    public PurchesedDetail save(PurchesedDetail purchesedDetail) {
        productServices.deduct(purchesedDetail.getProductId(), purchesedDetail.getQty());
        BigDecimal basePrice = productServices.getProductPriceById(purchesedDetail.getProductId());
        purchesedDetail.setPurchesed(basePrice);
        return null;
    }

    @Override
    public PurchesedDetail getDetailId(String id) {
        return null;
    }

    @Override
    public List<PurchesedDetail> getAllDetailList(PurchesedDetail purchesedDetail) {
        return null;
    }

    @Override
    public void deleteDetailId(PurchesedDetail purchesedDetail) {

    }

    @Override
    public void purchasing(PurchesedDetail purchesedDetail) {

    }
}
