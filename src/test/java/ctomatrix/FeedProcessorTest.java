package ctomatrix;


import java.io.FileNotFoundException;

import javax.xml.bind.JAXBException;
import com.assignment.entities.FeedBySKU;
import com.assignment.processor.FeedProcessor;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



/**
 * @author Keerthana
 *
 */

public class FeedProcessorTest {

		
//		FeedBySKU feedBySKU;
		String xml;

		@Before
		public void setUp() {
				
//			feedBySKU=new FeedBySKU();

				 xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				 "<CTO_MATRIX>\n" + 
				 "<KMATS>\n" + 
				 " <KMAT>\n" + 
				 "    <ID>Z0RT</ID>\n" + 
				 "    <MPN>MK642</MPN>\n" + 
				 "    <FIND_NOS>\n" + 
				 "       <FIND_NO>\n" + 
				 "         <ID>100</ID>\n" + 
				 "         <Description>Base Unit</Description>\n" + 
				 "         <Options>\n" + 
				 "			<Option>\n" + 
				 "                 <ID>065</ID>\n" + 
				 "                 <PUBLISHED_DESCRIPTION>iMac-27-inch</PUBLISHED_DESCRIPTION>\n" + 
				 "                 <DISPLAY_ON_WEB>Y</DISPLAY_ON_WEB>\n" + 
				 "                 <START_DATE>10/12/2018</START_DATE>\n" + 
				 "                 <END_DATE>10/15/2018</END_DATE>\n" + 
				 "                 <SALES_ORGS>\n" + 
				 "                   <SALES_ORG>\n" + 
				 "                       <ID>6458</ID>\n" + 
				 "                       <EXTENTION_TYPE>Primary</EXTENTION_TYPE>\n" + 
				 "                   </SALES_ORG>\n" + 
				 "                   <SALES_ORG>\n" + 
				 "                       <ID>6498</ID>\n" + 
				 "                       <EXTENTION_TYPE>Secondary</EXTENTION_TYPE>\n" + 
				 "                   </SALES_ORG>\n" + 
				 "                  </SALES_ORGS>\n" + 
				 "	   			</Option>\n" + 
				 "            </Options>\n" + 
				 "            </FIND_NO>\n" + 
				 "         </FIND_NOS>\n" + 
				 "</KMAT>\n" + 
				 "</KMATS>\n" + 
				 "</CTO_MATRIX>";
						
		}

		@After
		public void tearDown() {
//			feedBySKU = null;
		}


		
		@Test
		public void testXmlToVO() throws JAXBException {
			FeedProcessor  feedProcessor = new FeedProcessor();
			feedProcessor.convertToObject(xml);
			
		}
		



}
