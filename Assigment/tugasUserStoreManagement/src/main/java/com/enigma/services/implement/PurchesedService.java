package com.enigma.services.implement;

import com.enigma.entity.Purchesed;
import com.enigma.entity.PurchesedDetail;
import com.enigma.entity.Users;
import com.enigma.repository.PurchasedRepo;
import com.enigma.services.interfaces.ProductServices;
import com.enigma.services.interfaces.PurchesedServices;
import com.enigma.services.interfaces.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchesedService implements PurchesedServices {
    @Autowired
    PurchasedRepo purchasedRepo;
    @Autowired
    UserServices userServices;
    @Autowired
    ProductServices productServices;

    @Override
    public Purchesed purchasingDetail(Purchesed purchased) {
        Users users = userServices.getUser(purchased.getUserId());
        purchased.setUser(users);
        for (PurchesedDetail purchesedDetail : purchased.getPurchesedDetail()) {
            purchesedDetail.setPurchesed(purchased);
            productServices.deduct(purchesedDetail.getProductId(), purchesedDetail.getQty());
            purchesedDetail.setPurchasePrice(productServices.getProductPriceById(purchesedDetail.getProductId()));
        }
     /*       productServices.getProductByStoreId(purchesedDetail.getProductId());
            purchased.setTotalPricePurchased(purchesedDetail.getSubTotalPrice());*/
        return purchasedRepo.save(purchased);
    }

    @Override
    public List<Purchesed> getAllPurchase() {
        //getAllPurchesedDetail((PurchesedDetail) purchesedDetailService.getAllPurchesedDetail(new PurchesedDetail()));
        return purchasedRepo.findAll();
    }

    @Override
    public Purchesed getPurchasedById(String id) {
        if (!purchasedRepo.findById(id).isPresent()) {
            return new Purchesed();
        }
        return purchasedRepo.findById(id).get();
    }

}
 /*   @Override
    public List<PurchesedDetail> getAllPurchesedDetail(PurchesedDetail purchesedDetail) {
        return purchesedDetailService.getAllPurchesedDetail(purchesedDetail);
    }

    @Override
    public PurchesedDetail getPurchesedDetailById(String id) {
        return purchesedDetailService.getPurchesedDetailById(id);
    }*/
