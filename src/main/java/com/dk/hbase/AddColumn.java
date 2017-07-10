package com.dk.hbase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.MasterNotRunningException;
import org.apache.hadoop.hbase.ZooKeeperConnectionException;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class AddColumn {
	@SuppressWarnings({ "deprecation", "resource" })
	//添加列族
//	public static void main(String[] args) throws MasterNotRunningException, ZooKeeperConnectionException, IOException {
//		Configuration conf = HBaseConfiguration.create();
//		
//		HBaseAdmin admin = new HBaseAdmin(conf);
//		
//		HColumnDescriptor columnDescriptor = new HColumnDescriptor("contactDetails");
//		admin.addColumn("employee", columnDescriptor);
//		
//		System.out.println("coloumn added");
//	}
	
	//删除列族
	public static void main(String[] args) throws MasterNotRunningException, ZooKeeperConnectionException, IOException{
		Configuration conf = HBaseConfiguration.create();
		
		HBaseAdmin admin = new HBaseAdmin(conf);
		
		admin.deleteColumn("employee", "contactDetailes");
		System.out.println("column deleted");
	}

}
