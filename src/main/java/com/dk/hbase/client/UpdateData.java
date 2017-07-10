package com.dk.hbase.client;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;

public class UpdateData {
	@SuppressWarnings("deprecation")
	//更新数据
	public static void main(String[] args) throws IOException {
		Configuration conf = HBaseConfiguration.create();
		
		HTable table = new HTable(conf,"emp");
		
		Put p = new Put(Bytes.toBytes("row1"));
		
		p.add(Bytes.toBytes("personal"),Bytes.toBytes("city"),Bytes.toBytes("Delih"));
		
		table.put(p);
		System.out.println("data updated");
		table.close();
	}

}
