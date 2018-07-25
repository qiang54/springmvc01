package com.spring.converter;


import com.spring.domain.DemoObj;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.StreamUtils;


import java.io.IOException;
import java.nio.charset.Charset;

/**
 * Created with IntelliJ IDEA.
 * User qiang
 * Date 2018/7/25 16:34
 * To change this template use File | Settings | File Templates.
 */
public class MyMessageConverter extends AbstractHttpMessageConverter<DemoObj> {

    /**
     * 自定义新的媒体类型 application/x-qiang
     */
    public MyMessageConverter(){
        super(new MediaType("application","x-qiang",Charset.forName("UTF-8")));
    }

    /**
     * 只处理DemoObj一类
     * @param aClass
     * @return
     */
    @Override
    protected boolean supports(Class<?> aClass) {
        return DemoObj.class.isAssignableFrom(aClass);
    }

    /**
     * 处理请求数据 request
     * @param aClass
     * @param httpInputMessage
     * @return
     * @throws IOException
     * @throws HttpMessageNotReadableException
     */
    @Override
    protected DemoObj readInternal(Class<? extends DemoObj> aClass, HttpInputMessage httpInputMessage)
            throws IOException, HttpMessageNotReadableException {

        String s = StreamUtils.copyToString(httpInputMessage.getBody(), Charset.forName("UTF-8"));
        String[] splits = s.split("-");
        return new DemoObj(new Integer(splits[0]), splits[1] );


    }

    /**
     * 处理输出数据到respons
     * @param obj
     * @param httpOutputMessage
     * @throws IOException
     * @throws HttpMessageNotWritableException
     */
    @Override
    protected void writeInternal(DemoObj obj, HttpOutputMessage httpOutputMessage) throws IOException, HttpMessageNotWritableException {

        String out = "hello :" +obj.toString();
        httpOutputMessage.getBody().write(out.getBytes());
    }

}
