package in.cdac.portal.model;

import java.util.Arrays;

import in.cdac.cryptoservice.Idtype;

public class RequestFromApi {
		private String ac;
	    private String opr;
	    private String tkntype;
	    private String keytype;
		private String keyidentifier;
	    private String lk;
	    private String txn;
	    private String aadhaarNum;
	    private String refNum;
//	    private XMLGregorianCalendar ts;
	    private String sa;
	    private String pin;
	    private Idtype idType;
	    private String type;
	    private byte[] value;
	    private String val;
	    private String data;
	    private String idData;
	    private String mac;
	    @Override
		public String toString() {
			return "RequestFromApi [ac=" + ac + ", opr=" + opr + ", tkntype=" + tkntype + ", keytype=" + keytype
					+ ", keyidentifier=" + keyidentifier + ", lk=" + lk + ", txn=" + txn + ", aadhaarNum=" + aadhaarNum
					+ ", refNum=" + refNum + ", sa=" + sa + ", pin=" + pin + ", idType=" + idType + ", type=" + type
					+ ", value=" + Arrays.toString(value) + ", val=" + val + ", data=" + data + ", idData=" + idData
					+ ", mac=" + mac + ", url=" + url + ", fileParam=" + fileParam + ", ip=" + ip + "]";
		}
		public String getAc() {
			return ac;
		}
		public void setAc(String ac) {
			this.ac = ac;
		}
		public String getOpr() {
			return opr;
		}
		public void setOpr(String opr) {
			this.opr = opr;
		}
		public String getTkntype() {
			return tkntype;
		}
		public void setTkntype(String tkntype) {
			this.tkntype = tkntype;
		}
		public String getKeytype() {
			return keytype;
		}
		public void setKeytype(String keytype) {
			this.keytype = keytype;
		}
		public String getKeyidentifier() {
			return keyidentifier;
		}
		public void setKeyidentifier(String keyidentifier) {
			this.keyidentifier = keyidentifier;
		}
		public String getLk() {
			return lk;
		}
		public void setLk(String lk) {
			this.lk = lk;
		}
		public String getTxn() {
			return txn;
		}
		public void setTxn(String txn) {
			this.txn = txn;
		}
		public String getAadhaarNum() {
			return aadhaarNum;
		}
		public void setAadhaarNum(String aadhaarNum) {
			this.aadhaarNum = aadhaarNum;
		}
		public String getRefNum() {
			return refNum;
		}
		public void setRefNum(String refNum) {
			this.refNum = refNum;
		}
		public String getSa() {
			return sa;
		}
		public void setSa(String sa) {
			this.sa = sa;
		}
		public String getPin() {
			return pin;
		}
		public void setPin(String pin) {
			this.pin = pin;
		}
		public Idtype getIdType() {
			return idType;
		}
		public void setIdType(Idtype idType) {
			this.idType = idType;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public byte[] getValue() {
			return value;
		}
		public void setValue(byte[] value) {
			this.value = value;
		}
		public String getVal() {
			return val;
		}
		public void setVal(String val) {
			this.val = val;
		}
		public String getData() {
			return data;
		}
		public void setData(String data) {
			this.data = data;
		}
		public String getIdData() {
			return idData;
		}
		public void setIdData(String idData) {
			this.idData = idData;
		}
		public String getMac() {
			return mac;
		}
		public void setMac(String mac) {
			this.mac = mac;
		}
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public String getFileParam() {
			return fileParam;
		}
		public void setFileParam(String fileParam) {
			this.fileParam = fileParam;
		}
		public String getIp() {
			return ip;
		}
		public void setIp(String ip) {
			this.ip = ip;
		}
		private String url;
	    private String fileParam;
	    private String ip;
}
