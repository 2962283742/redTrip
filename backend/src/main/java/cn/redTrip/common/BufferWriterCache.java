package cn.redTrip.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author dzl
 * @date 2024/3/8 14:02
 */
@Component
public class BufferWriterCache {

    @Bean
    @Order(1)
    public FileWriter fileWriter() throws IOException {
        return new FileWriter("logging.txt");
    }

    @Bean
    @Order(2)
    public BufferedWriter bufferedWriter(FileWriter fileWriter) throws IOException {
        return new BufferedWriter(fileWriter);
    }







}
