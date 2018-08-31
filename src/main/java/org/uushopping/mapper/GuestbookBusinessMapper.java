package org.uushopping.mapper;

import org.springframework.stereotype.Repository;
import org.uushopping.pojo.GuestbookBusiness;

import java.util.List;
@Repository
public interface GuestbookBusinessMapper {
    public List<GuestbookBusiness> getAllGuestbookBusiness();

    public List<GuestbookBusiness> search(String arg0);
    public void deleteByCommentId(int commentId);
//    public String getFlag(int commentId);
//
//    public void setFlag(String flag, int commentId);
}
