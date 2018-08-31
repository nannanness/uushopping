package org.uushopping.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.uushopping.mapper.GuestbookBusinessMapper;
import org.uushopping.pojo.GuestbookBusiness;
import org.uushopping.service.IGuestbookBusinessService;

import java.util.List;
@Service
public class GuestbookBusinessImpl implements IGuestbookBusinessService {
    @Autowired
    GuestbookBusinessMapper guestbookBusinessMapper;
    @Override
    public List<GuestbookBusiness> getAllGuestbookBusiness() {
        List<GuestbookBusiness> guestbookBusinessList=guestbookBusinessMapper.getAllGuestbookBusiness();
        return guestbookBusinessList;
    }

    @Override
    public List<GuestbookBusiness> search(String arg0) {
            return guestbookBusinessMapper.search(arg0);
    }

    @Override
    public void deleteCommentId(int commentId) {
        guestbookBusinessMapper.deleteByCommentId(commentId);
    }
}
