package com.atguigu.wordcount;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;

import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class WordcountMapper extends Mapper<LongWritable,Text,Text,IntWritable> {
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        //* maptask会对每一行输入数据调用一次我们自定义的map（）方法
        //获取值
        String line = value.toString();
        //取到的是一行的数据，进行切分
        String[] words = line.split(" ");
        //得到需要的单词
        Text tex = new Text();
        IntWritable intWri = new IntWritable();
        for (String word : words) {
            //输出，以每个单词作为key，所以输出类型位Text
            tex.set(word);
            intWri.set(1);
            context.write(tex,intWri);
        }
    }
}
