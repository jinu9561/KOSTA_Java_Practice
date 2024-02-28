package util;
/**
 * DB의 설정 정보들 상수로 관리
 * */
public interface DbProperties {
	public static final String DRVIER_NAME="oracle.jdbc.driver.OracleDriver";
  	String URL="jdbc:oracle:thin:@localhost:1521:xe";
  	String USER_ID = "JUNG_JINWOO";
	String USER_PASS = "1702";
   
}
