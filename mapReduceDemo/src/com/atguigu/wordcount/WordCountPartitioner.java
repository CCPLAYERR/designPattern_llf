package com.atguigu.wordcount;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class WordCountPartitioner extends Partitioner<Text,IntWritable> {

    @Override
    public int getPartition(Text key, IntWritable intWritable, int numPartitions) {
        String first_char = key.toString().substring(0, 1);
        char[] fc_chars = first_char.toCharArray();
        int result = fc_chars[0];
        // 2 根据奇数偶数分区
        if (result % 2 == 0) {
            return 0;
        }else {
            return 1;
        }
    }
}
