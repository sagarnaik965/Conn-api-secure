package in.cdac.portal.controller;

import java.io.IOException;
import java.net.MalformedURLException;
import java.security.NoSuchAlgorithmException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import in.cdac.portal.model.RequestFromApi;
import in.cdac.portal.service.UserService;
import in.cdac.portal.service.UserServiceImpl;

@EnableAsync
@RestController
@RequestMapping("/")
public class HomeController {

	private final  static Logger logger = LogManager.getLogger( HomeController.class );
	

//	@Autowired
	UserService readSer;

	@PostMapping("/check")
	@ResponseBody
	public String dummyApi() {
		System.out.println("Working . . . .");
		return "Working . . . .    2 ";
	}

	@PostMapping("/{reqOpr}")
	public void StoreUid(@RequestBody RequestFromApi vltReq , @PathVariable String reqOpr)
			throws MalformedURLException, NoSuchAlgorithmException, IOException {
		try {
			UserServiceImpl.apiCall(vltReq , reqOpr);
		} catch (Exception e) {
			logger.info(e.getMessage());

		}
	}

}
