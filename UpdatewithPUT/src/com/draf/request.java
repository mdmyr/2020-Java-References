package com.draf;


import com.siperian.sif.message.Field;
import com.siperian.sif.message.Record;
import com.siperian.sif.message.RecordKey;
import com.siperian.sif.message.mrm.PutRequest;

public class request {
/*
 * lets create a  request object with all the details needed to pass 
 * to the putRequest.
 */
	public static PutRequest makeRequestObject() {
		
		/*
		 * Parameters for all records
		 */
		String system="Admin";
		String BO_TABLE_NAME="C_B_LU_MAJOR_TYPE";
		String SiperianObjectName="BASE_OBJECT."+BO_TABLE_NAME;
		
		Record majorTypeRecord = new Record();
		majorTypeRecord=majorTypeRecord();
		majorTypeRecord.setSiperianObjectUid(SiperianObjectName);
		
		
		/*making a request object*/
		PutRequest majorTypeRequest =new PutRequest();
		
		/*
		 * set the record key 
		 * set the fields and values.
		 */
		RecordKey recordKey = new RecordKey();
		recordKey.setSystemName(system);
		recordKey.setSourceKey("A_A");
		majorTypeRequest.setRecordKey(recordKey);
			//recordKey.setSourceKey(sourceKey);
			majorTypeRequest.setRecordKey(recordKey);
			
		/*
		 * Record values
		 */
		majorTypeRequest.setRecord(majorTypeRecord);
		return majorTypeRequest;
	}

	private static Record majorTypeRecord() {
		/*
		 * Record with fields and its values.
		 */
		
		Record record = new Record();
		
		
		/* fields
		 * 
		 */
		Field fields = new Field();
		fields.setName("CUST_CATEGORY_CD");
		fields.setStringValue("PA");
		
		
		Field field2 = new Field();
		field2.setName("MAJOR_TYPE_DESC");
		field2.setStringValue("A  ROMA PURE ST ");
		

		Field field3 = new Field();
		field3.setName("MAJOR_TYPE_CD");
		field3.setStringValue("PA_A");
		
		record.setField(fields);
		record.setField(field2);
		record.setField(field3);
		return record;
	}

}
