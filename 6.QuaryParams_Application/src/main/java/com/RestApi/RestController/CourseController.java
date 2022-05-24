package com.RestApi.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@GetMapping(value="/course", produces="text/plain")
	public String getJurneyDetails(@RequestParam("vachile") String vachile) {		
 		String msg="";
		if("Bus".equals(vachile)){
			msg="we can get normal Comfort ";
		}
		else if("Scooter".equals(vachile)) {
			msg="we can get Avarage Comfort ";
		}
		else if("car".equals(vachile)) {
			msg="we can get good Comfort ";		
				}
		else if("train".equals(vachile)) {
			msg="we can get verygood Comfort ";
		}
		else if("flight".equals(vachile)) {
			msg="we can get extrordinary Comfort ";
		}		
		return msg;		
	}
	
	@GetMapping(value="/travel", produces="text/plain")
	public String getJurneyDetail(@RequestParam("vachile") String vachile, @RequestParam("Friend") String Friend) {
		String msg="I have to Travel with my dear Friend " +Friend+ " in The " +vachile+ " to the Delhi";
		return msg;
		
	}

}
