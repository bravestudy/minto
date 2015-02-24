package org.bravestudy.minto.common.constant;
/**
 * 공통 상수 변수
 */
public enum ConstantEnum {
	SUCCES("0000","정상 처리 되었습니다."),SYSTEM_ERROR("9999","시스템 에러입니다."),PARAMETER_NOTEXSISTS("1001","필수 파라미터가 없습니다.");

	private String code;
	private String errorMsg;
	
    public String getCode() {
        return code;
    }
    public String errorMsg() {
        return errorMsg;
    }
    
    private ConstantEnum(String code,String errorMsg) {
        this.code = code;
        this.errorMsg =errorMsg; 
    }
}
