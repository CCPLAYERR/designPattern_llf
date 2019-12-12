package com.atguigu.flowsum;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class FlowCountMapper extends Mapper<LongWritable,Text,Text,FlowBean> {
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        //1363157985066 	13726230503	00-FD-07-A4-72-B8:CMCC	120.196.100.82	i02.c.aliimg.com		24	27	2481	24681	200
        //输出 以手机号码作为key，flowbean作为value
        String line = value.toString();
        String[] words = line.split("\t");
        String key_phone = words[1];
        long  upFlow =  Long.parseLong(words[words.length-3]);
        long  downFlow =  Long.parseLong(words[words.length-2]);
        FlowBean flowBean = new FlowBean(upFlow, downFlow);
        context.write(new Text(key_phone),flowBean);
    }
}
