package com.ning.autotest;

import com.alibaba.fastjson.JSON;
import com.ning.autotest.bean.HttpResult;
import com.ning.autotest.bean.Joker;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.util.List;

/**
 * @Author: nicholas
 * @Date: 2020/8/13 21:51
 * @Descreption: 第二课： HttpClient的使用
 */
public class Test2 {
    private static final String RANDOM_JOKER_URL = "http://v.juhe.cn/joke/randJoke.php";
    private static final String NEW_JOKER_URL = "http://v.juhe.cn/joke/content/text.php";

    @Test
    public void getJoker() {
        //构建客户端
        CloseableHttpClient client = HttpClientBuilder.create().build();
        //声明返回
        CloseableHttpResponse response = null;
        try {
            //构建请求URL
            URIBuilder uriBuilder = new URIBuilder(RANDOM_JOKER_URL);
            uriBuilder.addParameter("key", "f74f7bcafb976a043dd97161fcaff744");
            HttpGet httpGet = getHttpGet(uriBuilder);
            //执行请求，拿到结果赋值给返回。
            response = client.execute(httpGet);
            //解析返回
            HttpEntity entity = response.getEntity();
            //打印请求状态
            System.out.println("响应状态：" + response.getStatusLine());
            //打印返回的数据
            if (entity != null) {
                HttpResult result = getResult(entity);
                List<Joker> jokers = JSON.parseArray(result.getResult(), Joker.class);
                for (int i = 0; i < jokers.size(); i++) {
                    System.out.println((i + 1) + " : " + jokers.get(i).getContent());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (client != null) {
                    client.close();
                }
                if (response != null) {
                    response.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private HttpGet getHttpGet(URIBuilder uriBuilder) throws URISyntaxException {
        HttpGet httpGet = new HttpGet(uriBuilder.build());
        //请求连接设置
        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectTimeout(3000)
                .setSocketTimeout(3000)
                .setRedirectsEnabled(true).build();
        //将设置配置到请求上
        httpGet.setConfig(requestConfig);
        return httpGet;
    }

    public HttpResult getResult(HttpEntity entity) {
        StringBuilder entityStringBuilder = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(entity.getContent(), "UTF-8"), 8 * 1024)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                entityStringBuilder.append(line).append("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return JSON.parseObject(entityStringBuilder.toString(), HttpResult.class);
    }
}
