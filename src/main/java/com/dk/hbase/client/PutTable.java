package com.dk.hbase.client;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;

public class PutTable {
	@SuppressWarnings("deprecation")
	//添加数据
	//p.add(Bytes.toBytes("coloumn family "), Bytes.toBytes("column name"),Bytes.toBytes("value"));
	public static void main(String[] args) throws IOException {
		Configuration conf = HBaseConfiguration.create();
		
		HTable table = new HTable(conf,"emp");
		
		Put p = new Put(Bytes.toBytes("row1"));
		
		p.add(Bytes.toBytes("personal"),Bytes.toBytes("name"),Bytes.toBytes("raju"));
		p.add(Bytes.toBytes("personal"),Bytes.toBytes("city"),Bytes.toBytes("hyderabad"));
		
		p.add(Bytes.toBytes("professional"),Bytes.toBytes("designation"),Bytes.toBytes("manager"));
		p.add(Bytes.toBytes("professional"),Bytes.toBytes("salary"),Bytes.toBytes("50000"));
		
		table.put(p);
		System.out.println("data inserted");
		table.close();
	}

}
