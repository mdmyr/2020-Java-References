package com.draf;

import java.util.Properties;

import com.siperian.sif.client.SiperianClient;
import com.siperian.sif.message.SiperianRequest;
import com.siperian.sif.message.SiperianResponse;

public class client extends SiperianClient {

	
	protected client(Properties config) {
		super(config);
		// TODO Auto-generated constructor stub
	}

	public static SiperianClient SiperianClient() {
		
		return SiperianClient();
	}

	@Override
	protected SiperianResponse _process(SiperianRequest arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
