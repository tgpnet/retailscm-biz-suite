
package com.doublechaintech.retailscm.retailstoremember;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import com.doublechaintech.retailscm.BaseEntity;
import com.doublechaintech.retailscm.SmartList;
import com.doublechaintech.retailscm.MultipleAccessKey;
import com.doublechaintech.retailscm.RetailscmUserContext;
import com.doublechaintech.retailscm.consumerorder.ConsumerOrderDAO;
import com.doublechaintech.retailscm.memberwishlist.MemberWishlistDAO;
import com.doublechaintech.retailscm.memberrewardpointredemption.MemberRewardPointRedemptionDAO;
import com.doublechaintech.retailscm.memberrewardpoint.MemberRewardPointDAO;
import com.doublechaintech.retailscm.retailstoremembergiftcard.RetailStoreMemberGiftCardDAO;
import com.doublechaintech.retailscm.retailstorememberaddress.RetailStoreMemberAddressDAO;
import com.doublechaintech.retailscm.retailstoremembercoupon.RetailStoreMemberCouponDAO;
import com.doublechaintech.retailscm.retailstorecountrycenter.RetailStoreCountryCenterDAO;


public interface RetailStoreMemberDAO{

	
	public RetailStoreMember load(String id, Map<String,Object> options) throws Exception;
	public void enhanceList(List<RetailStoreMember> retailStoreMemberList);
	public void collectAndEnhance(BaseEntity ownerEntity);
	
	public void alias(List<BaseEntity> entityList);
	
	
	
	
	public RetailStoreMember present(RetailStoreMember retailStoreMember,Map<String,Object> options) throws Exception;
	public RetailStoreMember clone(String id, Map<String,Object> options) throws Exception;
	
	
	
	public RetailStoreMember save(RetailStoreMember retailStoreMember,Map<String,Object> options);
	public SmartList<RetailStoreMember> saveRetailStoreMemberList(SmartList<RetailStoreMember> retailStoreMemberList,Map<String,Object> options);
	public SmartList<RetailStoreMember> removeRetailStoreMemberList(SmartList<RetailStoreMember> retailStoreMemberList,Map<String,Object> options);
	public SmartList<RetailStoreMember> findRetailStoreMemberWithKey(MultipleAccessKey key,Map<String, Object> options);
	public int countRetailStoreMemberWithKey(MultipleAccessKey key,Map<String, Object> options);
	public Map<String, Integer> countRetailStoreMemberWithGroupKey(String groupKey, MultipleAccessKey filterKey,
			Map<String, Object> options);
	public void delete(String retailStoreMemberId, int version) throws Exception;
	public RetailStoreMember disconnectFromAll(String retailStoreMemberId, int version) throws Exception;
	public int deleteAll() throws Exception;

	public ConsumerOrderDAO getConsumerOrderDAO();
		
	public RetailStoreMemberCouponDAO getRetailStoreMemberCouponDAO();
		
	public MemberWishlistDAO getMemberWishlistDAO();
		
	public MemberRewardPointDAO getMemberRewardPointDAO();
		
	public MemberRewardPointRedemptionDAO getMemberRewardPointRedemptionDAO();
		
	public RetailStoreMemberAddressDAO getRetailStoreMemberAddressDAO();
		
	public RetailStoreMemberGiftCardDAO getRetailStoreMemberGiftCardDAO();
		
	
 	public SmartList<RetailStoreMember> requestCandidateRetailStoreMemberForConsumerOrder(RetailscmUserContext userContext, String ownerClass, String id, String filterKey, int pageNo, int pageSize) throws Exception;
		
 	public SmartList<RetailStoreMember> requestCandidateRetailStoreMemberForRetailStoreMemberCoupon(RetailscmUserContext userContext, String ownerClass, String id, String filterKey, int pageNo, int pageSize) throws Exception;
		
 	public SmartList<RetailStoreMember> requestCandidateRetailStoreMemberForMemberWishlist(RetailscmUserContext userContext, String ownerClass, String id, String filterKey, int pageNo, int pageSize) throws Exception;
		
 	public SmartList<RetailStoreMember> requestCandidateRetailStoreMemberForMemberRewardPoint(RetailscmUserContext userContext, String ownerClass, String id, String filterKey, int pageNo, int pageSize) throws Exception;
		
 	public SmartList<RetailStoreMember> requestCandidateRetailStoreMemberForMemberRewardPointRedemption(RetailscmUserContext userContext, String ownerClass, String id, String filterKey, int pageNo, int pageSize) throws Exception;
		
 	public SmartList<RetailStoreMember> requestCandidateRetailStoreMemberForRetailStoreMemberAddress(RetailscmUserContext userContext, String ownerClass, String id, String filterKey, int pageNo, int pageSize) throws Exception;
		
 	public SmartList<RetailStoreMember> requestCandidateRetailStoreMemberForRetailStoreMemberGiftCard(RetailscmUserContext userContext, String ownerClass, String id, String filterKey, int pageNo, int pageSize) throws Exception;
		
	
	public RetailStoreMember planToRemoveConsumerOrderList(RetailStoreMember retailStoreMember, String consumerOrderIds[], Map<String,Object> options)throws Exception;


	//disconnect RetailStoreMember with store in ConsumerOrder
	public RetailStoreMember planToRemoveConsumerOrderListWithStore(RetailStoreMember retailStoreMember, String storeId, Map<String,Object> options)throws Exception;
	public int countConsumerOrderListWithStore(String retailStoreMemberId, String storeId, Map<String,Object> options)throws Exception;
	
	public RetailStoreMember planToRemoveRetailStoreMemberCouponList(RetailStoreMember retailStoreMember, String retailStoreMemberCouponIds[], Map<String,Object> options)throws Exception;


	public RetailStoreMember planToRemoveMemberWishlistList(RetailStoreMember retailStoreMember, String memberWishlistIds[], Map<String,Object> options)throws Exception;


	public RetailStoreMember planToRemoveMemberRewardPointList(RetailStoreMember retailStoreMember, String memberRewardPointIds[], Map<String,Object> options)throws Exception;


	public RetailStoreMember planToRemoveMemberRewardPointRedemptionList(RetailStoreMember retailStoreMember, String memberRewardPointRedemptionIds[], Map<String,Object> options)throws Exception;


	public RetailStoreMember planToRemoveRetailStoreMemberAddressList(RetailStoreMember retailStoreMember, String retailStoreMemberAddressIds[], Map<String,Object> options)throws Exception;


	public RetailStoreMember planToRemoveRetailStoreMemberGiftCardList(RetailStoreMember retailStoreMember, String retailStoreMemberGiftCardIds[], Map<String,Object> options)throws Exception;


	
	public SmartList<RetailStoreMember> queryList(String sql, Object ... parmeters);
 
 	public SmartList<RetailStoreMember> findRetailStoreMemberByOwner(String retailStoreCountryCenterId, Map<String,Object> options);
 	public int countRetailStoreMemberByOwner(String retailStoreCountryCenterId, Map<String,Object> options);
 	public Map<String, Integer> countRetailStoreMemberByOwnerIds(String[] ids, Map<String,Object> options);
 	public SmartList<RetailStoreMember> findRetailStoreMemberByOwner(String retailStoreCountryCenterId, int start, int count, Map<String,Object> options);
 	public void analyzeRetailStoreMemberByOwner(SmartList<RetailStoreMember> resultList, String retailStoreCountryCenterId, Map<String,Object> options);

 
 }


