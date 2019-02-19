package com.kh.god.seller.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.god.seller.model.dao.SellerDao;
import com.kh.god.seller.model.vo.Seller;
import com.kh.god.storeInfo.model.vo.StoreInfo;

@Service
public class SellerServiceImpl implements SellerService {

	@Autowired
	SellerDao sellerDao;

	@Override
	public Seller selectOneSeller(String sellerId) {
		return sellerDao.selectOneSeller(sellerId);
	}

	@Override
	public int insertSeller(Seller s) {
		return sellerDao.insertSeller(s);
	}
	
	public List<StoreInfo> myStore(String sellerId) {
		List<StoreInfo> store = sellerDao.myStore(sellerId);
		return store;
	}

	@Override
	public int updatePwd(String password) {
		return sellerDao.updatePwd(password);
	}

	@Override
	public int updateSeller(Seller s) {
		return sellerDao.updateSeller(s);
	}
	
}
