package com.assignment.mapper;

import java.util.ArrayList;
import java.util.List;

import com.assignment.entities.FeedBySKU;
import com.assignment.xml.vo.CTOMatrix;

/**
 * @author keerthana
 * This class conversion of value object to feed object 
 */
public class FeedMapper {
	
	private CTOMatrix ctomatrix;

	public FeedMapper(CTOMatrix ctomatrix) {
		super();
		this.ctomatrix = ctomatrix;
	}


	public FeedMapper() {
		super();
	}


	public CTOMatrix getCtomatrix() {
		return ctomatrix;
	}

	
	
	public void setCtomatrix(CTOMatrix ctomatrix) {
		this.ctomatrix = ctomatrix;
	}


	public List<FeedBySKU> convertToEntity(){
		List<FeedBySKU> feedBySKU = new ArrayList<FeedBySKU>();
		FeedBySKU sku = new FeedBySKU();
		
		ctomatrix.getKmats().getKmats().stream().forEach(lkm -> 
		lkm.getFindNos().getFindNos().stream().forEach(lfn -> 
			lfn.getOptions().getOptions().stream().forEach(lo -> 
				lo.getSalesOrg().getSalesOrg().stream().forEach(lso -> {
							if (lo.getDisplayOnWeb().equals("Y")) {
							if (lso.getExtentionType().equals("Primary")) {
							sku.setSku(lkm.getId());
							sku.setOptionGroupID(lfn.getId());
							sku.setOptionID(lo.getOptionId());
							sku.setSalesOrg(lso.getSalesOrgID());
							sku.setMpn(lkm.getMpn());
							sku.setDescription(lfn.getDescription());
							sku.setPublishedDescr(lo.getPublishedDesc());
							sku.setDispyOnWeb(lo.getDisplayOnWeb());
							sku.setStartDate(lo.getStartDate());
							sku.setEndDate(lo.getEndDate());
							feedBySKU.add(sku);
							}
							}
						}))));
				
		
	return feedBySKU;	
	}

		
}
