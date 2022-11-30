package br.com.weslley.publicador.service;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MensagemService {
	private static final Logger log = LoggerFactory.getLogger(MensagemService.class);
	
	public String getMensagem() {
		HttpClient httpclient = HttpClients.createDefault();
		HttpGet get = new HttpGet("https://api.adviceslip.com/advice");

		try {
			HttpResponse response = httpclient.execute(get);
			String json = EntityUtils.toString(response.getEntity());
			
			JSONParser parser = new JSONParser();
			JSONObject obj = (JSONObject) parser.parse(json);
			JSONObject objMsg = (JSONObject) obj.get("slip");

			String mensagem = (String) objMsg.get("advice");
			
			return mensagem;
		} catch (Exception e) {
			log.error("Houve um problema na geração da mensagem: " + e.getMessage());
		}

		return "";
	}
}
