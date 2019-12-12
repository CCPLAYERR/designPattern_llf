package com.atguigu.wordcount;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class WordcountReducer extends Reducer<Text,IntWritable,Text,IntWritable> {
    @Override
    protected void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {
        // 形参 key，是一组相同单词kv对的key

        //汇总各个key的个数
        int count = 0;
        //Reducetask进程对每一组相同k的<k,v>组调用一次reduce()方法  所以count的最终结果就是每个单词的计数
        for (IntWritable value : values) {
            count+=value.get();
        }
        //输出
        context.write(key,new IntWritable(count));
    }
}
