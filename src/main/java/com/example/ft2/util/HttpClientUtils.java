package com.example.ft2.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.AuthSchemes;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.config.SocketConfig;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author: wangxiaobo
 * @create: 2020-08-24 23:41
 * description: HttpClient调用Https接口封装.
 * http请求工具类
 **/
public class HttpClientUtils {
    private static final int MAX_SOCKET_TIMEOUT = 10000;
    private static final int MAX_TOTAL = 100;
    private static final int MAX_PER_ROUTE = 100;
    private static final int VALIDATE_AFTER_INACTIVITY = 200;
    public static String check(String name) {
        try {
            HttpResponse get = HttpClientUtils.doGet("https://prod-api.kosetto.com", "/search/users?username=" + name, "get", new HashMap<>(), new HashMap<>());
            JSONObject json = getJson(get);
            if (json != null) {
                JSONArray users = json.getJSONArray("users");
                if (users != null && users.size() > 0) {
                    return users.toString();
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    /**
     * get
     *
     * @param host
     * @param path
     * @param method
     * @param headers
     * @param querys
     * @return
     * @throws Exception
     */
    public static HttpResponse doGet(String host, String path, String method,
                                     Map<String, String> headers,
                                     Map<String, String> querys) throws Exception {
        HttpClient httpClient = wrapClient(host, path);
        HttpGet request = new HttpGet(buildUrl(host, path, querys));
        for (Map.Entry<String, String> e : headers.entrySet()) {
            request.addHeader(e.getKey(), e.getValue());
        }
        return httpClient.execute(request);
    }

    /**
     * post form
     *
     * @param host
     * @param path
     * @param headers
     * @param querys
     * @param bodys
     * @return
     * @throws Exception
     */
    public static HttpResponse doPost(String host, String path,
                                      Map<String, String> headers,
                                      Map<String, String> querys,
                                      Map<String, String> bodys)
            throws Exception {
        HttpClient httpClient = wrapClient(host, path);
        HttpPost request = new HttpPost(buildUrl(host, path, querys));
        for (Map.Entry<String, String> e : headers.entrySet()) {
            request.addHeader(e.getKey(), e.getValue());
        }
        if (bodys != null) {
            List<NameValuePair> nameValuePairList = new ArrayList<NameValuePair>();

            for (String key : bodys.keySet()) {
                nameValuePairList.add(new BasicNameValuePair(key, bodys.get(key)));
            }
            UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(nameValuePairList, "utf-8");
            formEntity.setContentType("application/x-www-form-urlencoded; charset=UTF-8");
            request.setEntity(formEntity);
        }
        return httpClient.execute(request);
    }

    /**
     * Post String
     *
     * @param host
     * @param path
     * @param headers
     * @param querys
     * @param body
     * @return
     * @throws Exception
     */
    public static HttpResponse doPost(String host, String path,
                                      Map<String, String> headers,
                                      Map<String, String> querys,
                                      String body)
            throws Exception {
        HttpClient httpClient = wrapClient(host, path);
        HttpPost request = new HttpPost(buildUrl(host, path, querys));
        for (Map.Entry<String, String> e : headers.entrySet()) {
            request.addHeader(e.getKey(), e.getValue());
        }
        if (StringUtils.isNotBlank(body)) {
            request.setEntity(new StringEntity(body, "utf-8"));
        }
        return httpClient.execute(request);
    }

    /**
     * Post stream
     *
     * @param host
     * @param path
     * @param headers
     * @param querys
     * @param body
     * @return
     * @throws Exception
     */
    public static HttpResponse doPost(String host, String path,
                                      Map<String, String> headers,
                                      Map<String, String> querys,
                                      byte[] body)
            throws Exception {
        HttpClient httpClient = wrapClient(host, path);
        HttpPost request = new HttpPost(buildUrl(host, path, querys));
        for (Map.Entry<String, String> e : headers.entrySet()) {
            request.addHeader(e.getKey(), e.getValue());
        }
        if (body != null) {
            request.setEntity(new ByteArrayEntity(body));
        }
        return httpClient.execute(request);
    }

    /**
     * Put String
     *
     * @param host
     * @param path
     * @param headers
     * @param querys
     * @param body
     * @return
     * @throws Exception
     */
    public static HttpResponse doPut(String host, String path,
                                     Map<String, String> headers,
                                     Map<String, String> querys,
                                     String body)
            throws Exception {
        HttpClient httpClient = wrapClient(host, path);
        HttpPut request = new HttpPut(buildUrl(host, path, querys));
        for (Map.Entry<String, String> e : headers.entrySet()) {
            request.addHeader(e.getKey(), e.getValue());
        }
        if (StringUtils.isNotBlank(body)) {
            request.setEntity(new StringEntity(body, "utf-8"));
        }
        return httpClient.execute(request);
    }

    /**
     * Put stream
     *
     * @param host
     * @param path
     * @param headers
     * @param querys
     * @param body
     * @return
     * @throws Exception
     */
    public static HttpResponse doPut(String host, String path,
                                     Map<String, String> headers,
                                     Map<String, String> querys,
                                     byte[] body)
            throws Exception {
        HttpClient httpClient = wrapClient(host, path);
        HttpPut request = new HttpPut(buildUrl(host, path, querys));
        for (Map.Entry<String, String> e : headers.entrySet()) {
            request.addHeader(e.getKey(), e.getValue());
        }
        if (body != null) {
            request.setEntity(new ByteArrayEntity(body));
        }
        return httpClient.execute(request);
    }

    /**
     * Delete
     *
     * @param host
     * @param path
     * @param headers
     * @param querys
     * @return
     * @throws Exception
     */
    public static HttpResponse doDelete(String host, String path,
                                        Map<String, String> headers,
                                        Map<String, String> querys)
            throws Exception {
        HttpClient httpClient = wrapClient(host, path);
        HttpDelete request = new HttpDelete(buildUrl(host, path, querys));
        for (Map.Entry<String, String> e : headers.entrySet()) {
            request.addHeader(e.getKey(), e.getValue());
        }
        return httpClient.execute(request);
    }


    /**
     * 构建请求的 url
     *
     * @param host
     * @param path
     * @param querys
     * @return
     */
    private static String buildUrl(String host, String path, Map<String, String> querys)
            throws UnsupportedEncodingException {
        StringBuilder sbUrl = new StringBuilder();
        //append(String str)字符串连接
        if (!StringUtils.isBlank(host)) {
            sbUrl.append(host);
        }
        if (!StringUtils.isBlank(path)) {
            sbUrl.append(path);
        }
        if (null != querys) {
            StringBuilder sbQuery = new StringBuilder();
            for (Map.Entry<String, String> query : querys.entrySet()) {
                if (0 < sbQuery.length()) {
                    sbQuery.append("&");
                }
                if (StringUtils.isBlank(query.getKey()) && !StringUtils.isBlank(query.getValue())) {
                    sbQuery.append(query.getValue());
                }
                if (!StringUtils.isBlank(query.getKey())) {
                    sbQuery.append(query.getKey());
                    if (!StringUtils.isBlank(query.getValue())) {
                        sbQuery.append("=");
                        sbQuery.append(URLEncoder.encode(query.getValue(), "utf-8"));
                    }
                }
            }
            if (0 < sbQuery.length()) {
                sbUrl.append("?").append(sbQuery);
            }
        }
        return sbUrl.toString();
    }

    /**
     * 获取 HttpClient
     *
     * @param host
     * @param path
     * @return
     */
    private static HttpClient wrapClient(String host, String path) {
        HttpClient httpClient = HttpClientBuilder.create().build();
        if (host != null && host.startsWith("https://")) {
            return sslClient();
        } else if (StringUtils.isBlank(host) && path != null && path.startsWith("https://")) {
            return sslClient();
        }
        return httpClient;
    }

    /**
     * 在调用SSL之前需要重写验证方法，取消检测SSL
     * 创建ConnectionManager，添加Connection配置信息
     *
     * @return HttpClient 支持https
     */
    private static HttpClient sslClient() {
        try {
            // 在调用SSL之前需要重写验证方法，取消检测SSL
            X509TrustManager trustManager = new X509TrustManager() {
                @Override
                public X509Certificate[] getAcceptedIssuers() {
                    return null;
                }

                @Override
                public void checkClientTrusted(X509Certificate[] xcs, String str) {
                }

                @Override
                public void checkServerTrusted(X509Certificate[] xcs, String str) {
                }
            };
            SSLContext ctx = SSLContext.getInstance(SSLConnectionSocketFactory.TLS);
            ctx.init(null, new TrustManager[]{trustManager}, null);
            SSLConnectionSocketFactory socketFactory = new SSLConnectionSocketFactory(ctx, NoopHostnameVerifier.INSTANCE);
            // 创建Registry
            RequestConfig requestConfig = RequestConfig.custom().setCookieSpec(CookieSpecs.STANDARD_STRICT)
                    .setExpectContinueEnabled(Boolean.TRUE).setTargetPreferredAuthSchemes(Arrays.asList(AuthSchemes.NTLM, AuthSchemes.DIGEST))
                    .setProxyPreferredAuthSchemes(Arrays.asList(AuthSchemes.BASIC)).build();
            Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory>create()
                    .register("http", PlainConnectionSocketFactory.INSTANCE)
                    .register("https", socketFactory).build();
            // 创建ConnectionManager，添加Connection配置信息
            PoolingHttpClientConnectionManager connectionManager = new PoolingHttpClientConnectionManager(socketFactoryRegistry);

            // 设置连接池大小
            connectionManager.setMaxTotal(MAX_TOTAL);
            connectionManager.setDefaultMaxPerRoute(MAX_PER_ROUTE);
            connectionManager.setDefaultSocketConfig(SocketConfig.custom().setSoTimeout(MAX_SOCKET_TIMEOUT).build());
            // 一个连接idle超过200ms,再次被使用之前,需要先做validation
            connectionManager.setValidateAfterInactivity(VALIDATE_AFTER_INACTIVITY);

            CloseableHttpClient closeableHttpClient = HttpClients.custom().setConnectionManager(connectionManager)
                    .setDefaultRequestConfig(requestConfig).build();
            return closeableHttpClient;
        } catch (KeyManagementException ex) {
            throw new RuntimeException(ex);
        } catch (NoSuchAlgorithmException ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * 将结果转换成JSONObject
     *
     * @param httpResponse
     * @return
     * @throws IOException
     */
    public static JSONObject getJson(HttpResponse httpResponse) throws IOException {
        HttpEntity entity = httpResponse.getEntity();
        String resp = EntityUtils.toString(entity, "UTF-8");
        EntityUtils.consume(entity);
        return JSON.parseObject(resp);
    }
}
