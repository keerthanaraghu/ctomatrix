package com.assignment.processor;

import java.io.StringReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.assignment.dao.FeedProcessorDAO;
import com.assignment.dao.FeedProcessorDAOImpl;
import com.assignment.entities.FeedBySKU;
import com.assignment.mapper.FeedMapper;
import com.assignment.xml.vo.CTOMatrix;

/**
 * @author keerthana This class parse the XML data
 */
/**
 * @author ra305652
 *
 */
public class FeedProcessor {

	public void convertToObject(String xml) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(CTOMatrix.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		StringReader reader = new StringReader(xml);
		CTOMatrix ctomatrix = (CTOMatrix) unmarshaller.unmarshal(reader);
		FeedMapper feedMapper = new FeedMapper(ctomatrix);
		List<FeedBySKU> feedBySKU = feedMapper.convertToEntity();
		feedBySKU.stream().forEach(fbs -> {
			String optgrpid = Integer.toString(fbs.getOptionGroupID());
			String optid = Integer.toString(fbs.getOptionID());
			String salesorg = Integer.toString(fbs.getSalesOrg());
			java.sql.Date startdate = this.convertStringtoDate(fbs.getStartDate());
			java.sql.Date enddate = this.convertStringtoDate(fbs.getEndDate());
			String sql = "Insert into FeedBySKU VALUES ('";
			sql = sql + fbs.getSku() + "'," + optgrpid + "," + optid + "," + salesorg + ",'" + fbs.getMpn() + "','"
					+ fbs.getDescription() + "','" + fbs.getPublishedDescr() + "','" + fbs.getDispyOnWeb() + "','"
					+ startdate + "','" + enddate + "')";
			FeedProcessorDAO feedProcessorDAO = new FeedProcessorDAOImpl();
			feedProcessorDAO.save(sql);

		});
	}

	
	
	
	/**
	 * This method converts String to SQL date format.
	 * @param String
	 * @return java.sql.date format 
	 */
	private java.sql.Date convertStringtoDate(String date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date langDate = null;
		try {
			langDate = sdf.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		java.sql.Date sqlDate = new java.sql.Date(langDate.getTime());
		return sqlDate;
	}
}
