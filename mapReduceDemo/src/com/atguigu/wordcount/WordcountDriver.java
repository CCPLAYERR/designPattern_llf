package com.atguigu.wordcount;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class WordcountDriver  {
    public static void main(String[] args) throws Exception {
        //1 获取配置信息，或者job对象实例
        Configuration conf = new Configuration();
        Job job = Job.getInstance(conf);

        job.setJarByClass(WordcountDriver.class);
        job.setJobName("wordCount");

        //2 指定本次job要运行的mapper和reducer
        job.setMapperClass(WordcountMapper.class);
        job.setReducerClass(WordcountReducer.class);

        //3指定mapper输出数据的类型
        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(IntWritable.class);

        //4指定最终输出（reducer）的kv类型
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);

        //设置分区
        job.setPartitionerClass(WordCountPartitioner.class);
        job.setNumReduceTasks(2);

        //5 指定job的原始输入文件所在目录
        FileInputFormat.setInputPaths(job,new Path(args[0]));
        Path path = new Path(args[1]);
        FileSystem fs = FileSystem.get(conf);
        if (fs.exists(path)){//不用一直删output文件夹了
            fs.delete(path,true);
        }
        FileOutputFormat.setOutputPath(job,path);

        // 7 将job中配置的相关参数，以及job所用的java类所在的jar包， 提交给yarn去运行
        boolean result = job.waitForCompletion(true);
        if (result){
            System.out.println("执行完成");
        }
    }
}
