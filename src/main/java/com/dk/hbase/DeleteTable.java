package com.dk.hbase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.MasterNotRunningException;
import org.apache.hadoop.hbase.ZooKeeperConnectionException;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class DeleteTable {
	@SuppressWarnings({ "deprecation", "resource" })
	//删除表
	public static void main(String[] args) throws MasterNotRunningException, ZooKeeperConnectionException, IOException {
		Configuration conf = HBaseConfiguration.create();
		
		HBaseAdmin admin = new HBaseAdmin(conf);
		
		admin.disableTable("employee");
		
		admin.deleteTable("employee");
		System.out.println("Table deleted");
	}

}
