package br.com.microservice.fornecedor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class InfoController {
	
	public ResponseEntity<Object> getInfoByEstado(String estado){
		
		
		
		return null;		
	}

}
