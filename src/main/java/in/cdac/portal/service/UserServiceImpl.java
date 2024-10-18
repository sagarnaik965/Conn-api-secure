package in.cdac.portal.service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import in.cdac.connector.ConnectorImpl;
import in.cdac.connector.IConnector;
import in.cdac.cryptoservice.Idtype;
import in.cdac.cryptoservice.KeyType;
import in.cdac.cryptoservice.Mask;
import in.cdac.cryptoservice.Operations;
import in.cdac.cryptoservice.Status;
import in.cdac.cryptoservice.TokenType;
import in.cdac.model.RequestObject;
import in.cdac.model.ResponseObject;
import in.cdac.portal.model.RequestFromApi;
import in.cdac.util.Utility;

public class UserServiceImpl  {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
	public static void apiCall(RequestFromApi req , String opr) throws MalformedURLException, IOException, NoSuchAlgorithmException
	{
		try {
			IConnector conn = new ConnectorImpl();
			RequestObject vltReq = new RequestObject();
			vltReq.setAadhaarMask(Mask.NO);
			vltReq.setIdType(Idtype.UID);;
			//vltReq.setOpr(Operations.STRUID);
			switch (opr.toUpperCase()) 
			{
			case "STRUID":
				vltReq.setOpr(Operations.STRUID);
				break;
			case "ACTIVATE":
				vltReq.setOpr(Operations.ACTIVATE);
				break;
			case "DEACTIVATE":
				vltReq.setOpr(Operations.DEACTIVATE);
				break;
			case "GETREFNUM":
				vltReq.setOpr(Operations.GETREFNUM);
				break;
			case "GETUID":
				vltReq.setOpr(Operations.GETUID);
				break;

			case "DELETE":
				vltReq.setOpr(Operations.DELETE);
				break;

			case "USERSCHEMES":
				vltReq.setOpr(Operations.USERSCHEMES);
				break;

			default:
				LOGGER.info("API URL is not proper!");
				break;
			}
			vltReq.setTxn(UUID.randomUUID().toString());	
			vltReq.setTs(Utility.generateTimeStamp());
			vltReq.setNumber(req.getAadhaarNum());// 999971658847
			vltReq.setRefNum(req.getRefNum());
			switch (req.getKeytype().toUpperCase()) 
			{
			case "AES":
				vltReq.setKeytype(KeyType.AES);
				break;
			default:
				break;
			}
			switch (req.getTkntype().toUpperCase()) 
			{
			case "SOFT":
				vltReq.setTkntype(TokenType.SOFT);
				break;
			case "HARD":
				vltReq.setTkntype(TokenType.HARD);
				break;
			default:
				break;
			}

			vltReq.setAc(req.getAc());
			vltReq.setSa(req.getSa());
			vltReq.setLk(req.getLk());
			vltReq.setUrl(req.getUrl());
			ResponseObject vltResp = conn.requestVault(vltReq);
			if (vltResp.getStatus().equals(Status.N.value().trim())) 
			{
				LOGGER.info("ERROR : " + vltResp.getError() + "   Status : " + vltResp.getStatus());
			} 
			else 
			{
				LOGGER.info("REFNUM : " + vltResp.getRefNum() + "    AadhaarNumber : " + vltResp.getNumber()
						+ "    Status : " + vltResp.getStatus() + "    Prn : " + vltResp.getPrn() + "    userScheme : "
						+ vltResp.getUserScheme(
								));
			}

		} 
		catch (Exception e) 
		{
			LOGGER.info(e.getMessage());
		}
	}

}
