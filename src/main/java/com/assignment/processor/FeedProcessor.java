package com.assignment.processor;

import java.io.StringReader;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.assignment.entities.FeedBySKU;
import com.assignment.mapper.FeedMapper;
import com.assignment.xml.vo.CTOMatrix;

/**
 * @author keerthana
 * This class parse the XML data
 */
public class FeedProcessor {
	
	public void convertToObject(String xml) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(CTOMatrix.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        StringReader reader = new StringReader(xml);
        CTOMatrix ctomatrix = (CTOMatrix) unmarshaller.unmarshal(reader);
        FeedMapper feedMapper = new FeedMapper(ctomatrix);
        List<FeedBySKU> feedBySKU = feedMapper.convertToEntity();
		

}
}
