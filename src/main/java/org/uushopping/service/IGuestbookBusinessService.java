package org.uushopping.service;

import org.uushopping.pojo.GuestbookBusiness;

import java.util.List;

public interface IGuestbookBusinessService {
    public List<GuestbookBusiness> getAllGuestbookBusiness();
    public List<GuestbookBusiness> search(String arg0);
    public void deleteCommentId(int commentId);
}
