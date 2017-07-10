package com.dk.hbase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class ListTables {
	@SuppressWarnings({ "resource", "deprecation" })
	//列出所有的表
	public static void main(String[] args) throws IOException {
		Configuration conf = HBaseConfiguration.create();
		
		HBaseAdmin admin = new HBaseAdmin(conf);
		
		HTableDescriptor[] tables = admin.listTables();
		
		for(int i=0;i<tables.length;i++){
			System.out.println(tables[i].getNameAsString());//获得表名
		}
	}

}
