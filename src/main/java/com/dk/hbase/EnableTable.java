package com.dk.hbase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.MasterNotRunningException;
import org.apache.hadoop.hbase.ZooKeeperConnectionException;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class EnableTable {
	@SuppressWarnings({ "deprecation", "resource" })
	//启用表
	//enable emp
	public static void main(String[] args) throws MasterNotRunningException, ZooKeeperConnectionException, IOException {
		Configuration conf = HBaseConfiguration.create();
		
		HBaseAdmin admin = new HBaseAdmin(conf);
		
		boolean isEnable = admin.isTableEnabled("emp");
		
		if(!isEnable){
			admin.enableTable("emp");
			System.out.println("Table Enabled");
		}
		
		
	}

}
