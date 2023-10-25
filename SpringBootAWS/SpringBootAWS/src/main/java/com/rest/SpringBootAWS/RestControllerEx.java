package com.rest.SpringBootAWS;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//@RestController
//@RequestMapping("/api")
@Component
public class RestControllerEx {
	/**
	 * @return
	 */
//	@GetMapping("/aws")
//	public ResponseEntity Display()
//	{
//		return new ResponseEntity("I was landed on aws cloud",HttpStatus.ACCEPTED);
//	}
	static int i=0;
	@Scheduled(fixedRate=1000)
	public void displayTask()
	{
		System.out.println("Sending Message="+i);
		i++;
	}
	@Scheduled(cron="*/10 * * * * *")
	public void displayTask1()
	{
		System.out.println("cron Message=");
	}
}