package com.draf.put;

import java.io.File;
import java.util.Properties;

import com.draf.*;
import com.siperian.mrm.message.*;
import com.siperian.sif.client.SiperianClient;
import com.siperian.sif.message.Record;
import com.siperian.sif.message.SiperianResponse;
import com.siperian.sif.message.mrm.PutRequest;

public class updateMajorType extends request{

	public static void main(String[] args) {
		
		PutRequest request = makeRequestObject();//gets the request. 
		
		// lets make a siperian client.
		
		SiperianClient sipClient = SiperianClient.newSiperianClient(new File("C:\\Users\\yraghunp\\Documents\\Work\\Project_Related\\Eclipse\\Dev\\UpdatewithPUT\\src\\config.properties")  );
				SiperianResponse  res =  sipClient.process(request);
		System.out.println(res.getMessage());
	}

	

	
}
