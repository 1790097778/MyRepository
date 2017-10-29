package dao;

import java.util.Date;
import java.util.List;

import entity.DsChat;

/**
 * @author Administrator
 *
 */

public interface ChatDao {
	
	/**
	 * @param chatItem which will be deleted
	 */
	public void addChatItems(DsChat chatItem);

	

	/**
	 * @param userId Find the item by publisherId or recieverId.
	 * 		Find the other chatter .
	 * 		Judge if the other chatter's id in the chatItem is null.
	 * 		Delete it.
	 */
	public void deleteAll(int userId);
	
	/**
	 * @param id the user id
	 * @return	all chatItem receiverId of which is this id
	 */
	public List<DsChat> getMessages(int id,long date);
	

}
