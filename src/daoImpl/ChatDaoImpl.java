package daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dao.ChatDao;
import entity.DsChat;
@Repository
public class ChatDaoImpl extends CommonDaoImpl implements ChatDao{

	@Override
	public void addChatItems(DsChat chatItem) {
		// TODO Auto-generated method stub
		getTemplate().save(chatItem);
	}


	@Override
	public void deleteAll(int userId) {
		// TODO Auto-generated method stub
		ArrayList<DsChat> bePublisher = (ArrayList<DsChat>) getTemplate().
				find("from entity.DsChat chat where chat.chPublisherid = ?", userId);
		ArrayList<DsChat> beReceiver = (ArrayList<DsChat>)getTemplate().
				find("from entity.DsChat chat where chat.chReceiver = ?", userId);
		if(bePublisher.size()!=0)
			for(DsChat chat : bePublisher)
			{
				if(chat.getChReceiver()==null)
					getTemplate().delete(chat);
				else{
					chat.setChPublisherid(null);
					getTemplate().update(chat);
				}
			}
		if(beReceiver.size()!=0)
			for(DsChat chat : beReceiver){
				if(chat.getChPublisherid()==null)
					getTemplate().delete(chat);
				else{
					chat.setChReceiver(null);
					getTemplate().update(chat);
				}	
			}		
	}

	@Override
	public List<DsChat> getMessages(int id, long date) {
		// TODO Auto-generated method stub
		ArrayList<DsChat> list =(ArrayList<DsChat>) getTemplate().
			find("from entity.DsChat chat where chat.chReceiver = ? and chTime > ?"
					, new Object[]{id,date});
		if(list.size()!=0)
			return list;
		else return null;
	}

}
