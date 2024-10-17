/*
 * Aim : Java program to get the IP address, Hostname based on given Hostname.
 * Name : Sidra Shaikh
 * UIN : 231P064
 * Div : A.
 */
package skll_oop_B3_odd;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class IpAddress {

	public static void main(String[] args) {
	 String host="www.leetcode.org";
	 InetAddress address = null;
	 try {
		 address = InetAddress.getByName(host);
	 }
  catch (UnknownHostException e) {
	  throw new RuntimeException(e);
  }
	 System.out.println("Ip Address is :" + address.getHostAddress());
	 
	 System.out.println("\nName:Sidra Shaikh \nRoll no:40 \nUIN:231P064 \nDiv:A ");
	}

}
