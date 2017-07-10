package com.dk.hbase.client;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Delete;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.util.Bytes;

public class DeleteData {
	@SuppressWarnings("deprecation")
	//删除数据
	//delete 'emp', '1', 'personal data:city',
	public static void main(String[] args) throws IOException {
		Configuration conf = HBaseConfiguration.create();
		
		HTable table = new HTable(conf,"emp");
		
		Delete delete = new Delete(Bytes.toBytes("row1"));
		
		delete.deleteColumn(Bytes.toBytes("personal"), Bytes.toBytes("name"));
		delete.deleteFamily(Bytes.toBytes("professional"));
		
		table.delete(delete);
		System.out.println("data deleted");
		table.close();
	}

}
