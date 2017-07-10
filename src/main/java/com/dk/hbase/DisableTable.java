package com.dk.hbase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.MasterNotRunningException;
import org.apache.hadoop.hbase.ZooKeeperConnectionException;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class DisableTable {
	@SuppressWarnings({ "deprecation",  "resource" })
	//禁用表
	//要删除表或改变其设置，首先需要使用 disable 命令关闭表
	//disable emp
	public static void main(String[] args) throws MasterNotRunningException, ZooKeeperConnectionException, IOException {
		Configuration conf = HBaseConfiguration.create();
		
		HBaseAdmin admin = new HBaseAdmin(conf);
		
		boolean isDisable = admin.isTableDisabled("emp");
		if(!isDisable){
			admin.disableTable("emp");
			System.out.println("Table disabled");
		}
	}

}
