package com.atguigu.flowsum;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class FlowCountReducer extends Reducer<Text,FlowBean,Text,FlowBean> {

    @Override
    protected void reduce(Text key, Iterable<FlowBean> values, Context context) throws IOException, InterruptedException {
        //Reducetask进程对每一组相同k的<k,v>组调用一次reduce()方法  所以count的最终结果就是不重复的每个手机号码的总流量（up  down 和 sum）
        long upFlow_sum = 0;
        long downFlow_sum = 0;
        for (FlowBean value : values) {
            upFlow_sum+=value.getUpFlow();
            downFlow_sum+=value.getDownFlow();
        }
        //输出
        context.write(key,new FlowBean(upFlow_sum,downFlow_sum));
    }
}
