package com.ggh.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author gaoquan on 2017/9/22
 */
public class IpDemo {

	public static void main(String[] args) throws UnknownHostException {

		//通过名称(ip字符串or主机名)来获取一个ip对象。

		InetAddress ip = InetAddress.getByName("www.baidu.com");//java.net.UnknownHostException

		System.out.println("addr:" + ip.getHostAddress());

		System.out.println("name:" + ip.getHostName());

	}
}
