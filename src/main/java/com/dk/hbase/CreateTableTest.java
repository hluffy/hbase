package com.dk.hbase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.MasterNotRunningException;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.ZooKeeperConnectionException;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class CreateTableTest {
	@SuppressWarnings({ "deprecation", "resource" })
	//创建表
	//create 'emp','personal','professional';
	public static void main(String[] args) throws MasterNotRunningException, ZooKeeperConnectionException, IOException {
		Configuration conf = HBaseConfiguration.create();
		HBaseAdmin admin = new HBaseAdmin(conf);
		
		HTableDescriptor table = new HTableDescriptor(TableName.valueOf("emp"));
		
		table.addFamily(new HColumnDescriptor("personal"));
		table.addFamily(new HColumnDescriptor("professional"));
		
		admin.createTable(table);
		System.out.println("Table Created");
	}

}
