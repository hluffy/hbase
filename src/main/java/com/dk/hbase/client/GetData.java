package com.dk.hbase.client;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.util.Bytes;

public class GetData {
	@SuppressWarnings({ "deprecation", "resource" })
	//获取数据
	//get 'table name', ‘rowid’, {COLUMN => ‘column family:column name ’}
	public static void main(String[] args) throws IOException {
		Configuration conf = HBaseConfiguration.create();
		
		HTable table = new HTable(conf,"emp");
		Get get = new Get(Bytes.toBytes("row1"));
		
		Result result = table.get(get);
		
		byte[] names = result.getValue(Bytes.toBytes("personal"), Bytes.toBytes("name"));
		byte[] citys = result.getValue(Bytes.toBytes("personal"), Bytes.toBytes("city"));
		
		String name = Bytes.toString(names);
		String city = Bytes.toString(citys);
		System.out.println(name+":"+city);
	}

}
