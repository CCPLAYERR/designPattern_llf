package com.atguigu.flowsum;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class FlowCountSortReducer extends Reducer<FlowBean, Text, Text, FlowBean> {

    @Override
    protected void reduce(FlowBean bean, Iterable<Text> values, Context context)
            throws IOException, InterruptedException {
        context.write(values.iterator().next(), bean);
    }
}

