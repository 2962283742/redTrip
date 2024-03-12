package cn.redTrip.common;

import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

/**
 * @author dzl
 * @date 2024/3/8 14:01
 */
@Configuration
public class AopLogging {

    @Resource
    private BufferWriterCache bufferWriterCache;


    @Resource
    private FileWriter fileWriter;



    public void write(String str) throws IOException {
        BufferedWriter bufferedWriter = bufferWriterCache.bufferedWriter(fileWriter);
        Date date = new Date();
        bufferedWriter.write(date.toString() + "\t" + str+"\n" + "sssssss");
        bufferedWriter.flush();

    }







}
